package Helpers;

import Locators.DeploymentLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementsHelper {

  WebDriver driver;

  public ElementsHelper(WebDriver driver) {
    this.driver = driver;
  }

  public String getTextofClickableElement(By element, int timeout) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
    try {
      wait.until(ExpectedConditions.elementToBeClickable(element));
      return driver.findElement(element).getText();
    } catch (NoSuchElementException e) {
      throw new RuntimeException("The web element or its name is NOT found or it is NOT clickable: " + element, e);
    }
  }

  public String getTextfromInputField(By element, int timeout) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
    DeploymentLocators deploymentLocators = new DeploymentLocators();
    try {
      wait.until(ExpectedConditions.visibilityOfElementLocated(element));
      driver.findElement(deploymentLocators.searchField).sendKeys(driver.findElement(element).getText());
      driver.findElement(deploymentLocators.searchField).sendKeys(Keys.ENTER);
      return driver.findElement(element).getText();

    } catch (NoSuchElementException e) {
      throw new RuntimeException("The web element or its name is NOT found: " + element, e);
    }
  }
}