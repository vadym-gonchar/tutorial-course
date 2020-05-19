package helpers;

import locators.DeploymentLocators;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

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
      wait.until(ExpectedConditions.visibilityOfElementLocated(element));
      return driver.findElement(element).getText();
    } catch (NoSuchElementException e) {
      throw new RuntimeException("The web element is NOT found or it is NOT visible: " + element, e);
    }
  }

  public String getTextOfElementAndClick(By element, int timeout) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
    try {
      wait.until(ExpectedConditions.visibilityOfElementLocated(element));
      driver.findElement(element).click();
      return driver.findElement(element).getText();
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

  public void textEnter(String text) throws InterruptedException {
    driver.findElement(deploymentLocators.searchField).clear();
    driver.findElement(deploymentLocators.searchField).sendKeys(text);
    driver.findElement(deploymentLocators.searchField).sendKeys(Keys.ENTER);
    Thread.sleep(2000);
  }
}