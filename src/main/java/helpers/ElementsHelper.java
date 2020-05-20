package helpers;

import locators.DeploymentLocators;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ElementsHelper {

  WebDriver driver;
  DeploymentLocators deploymentLocators = new DeploymentLocators();

  public ElementsHelper(WebDriver driver) {
    this.driver = driver;
  }

  public String getTextOfClickableElement(By element, int timeout) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
    try {
      wait.until(ExpectedConditions.elementToBeClickable(element));
      return driver.findElement(element).getText();
    } catch (NoSuchElementException e) {
      throw new RuntimeException("The web element or its name is NOT " +
              "found or it is NOT clickable: " + element, e);
    }
  }

  public String getAttributeOfElement(By element, int timeout) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
    try {
      wait.until(ExpectedConditions.presenceOfElementLocated(element));
      return driver.findElement(element).getAttribute("placeholder");
    } catch (NoSuchElementException e) {
      throw new RuntimeException("The web element or its name is NOT " +
              "found: " + element, e);
    }
  }

  public String getTextOfVisibleElement(By element, int timeout) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
    try {
      wait.until(ExpectedConditions.presenceOfElementLocated(element));
      wait.until(ExpectedConditions.visibilityOfElementLocated(element));
      return driver.findElement(element).getText();
    } catch (NoSuchElementException e) {
      throw new RuntimeException("The web element is NOT found or it is NOT visible: " + element, e);
    }
  }

  public String getTextOfElementAndClick(By element, int timeout) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
    try {
      wait.until(ExpectedConditions.presenceOfElementLocated(element));
      driver.findElement(element).click();
      return driver.findElement(element).getText();
    } catch (NoSuchElementException e) {
      throw new RuntimeException("The web element or its name is NOT found: " + element, e);
    }
  }

  public void click(By element, int timeout) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
    try {
      wait.until(ExpectedConditions.presenceOfElementLocated(element));
      driver.findElement(element).click();
    } catch (NoSuchElementException e) {
      throw new RuntimeException("The web element or its name is NOT " +
              "found or it is NOT visible: " + element, e);
    }
  }

  public List<String> getList() {
    List<String> list = new ArrayList<>();
    List<WebElement> elements = driver.findElements(deploymentLocators.elementsWrapper);
    for (WebElement element : elements) {
      String text = element.getText();
      list.add(text);
    }
    return list;
  }

  public void textEnter(By element, int timeout, String text) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
    try {
      wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(element)));
      wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOfElementLocated(element)));
      driver.findElement(element).clear();
      driver.findElement(element).sendKeys(text);
      driver.findElement(element).sendKeys(Keys.ENTER);
    } catch (NoSuchElementException e) {
      throw new RuntimeException("The web element or its name is NOT found or it is NOT visible: " + element, e);
    }
  }

    public void waitForElementPresence (By element, int timeout){
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
      try {
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(element)));
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOfElementLocated(element)));
      } catch (NoSuchElementException e) {
        throw new RuntimeException("The web element is NOT found or it is NOT visible: " + element, e);
      }
    }
}