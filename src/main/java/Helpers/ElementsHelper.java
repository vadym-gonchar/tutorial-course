package Helpers;

import Locators.DeploymentLocators;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

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
  public List<String> getList(){
    List<String> list = new ArrayList<>();
    List<WebElement> elements = driver.findElements(By.cssSelector("[class='d-md-flex flex-wrap mb-4'] a h3"));
    for (WebElement element : elements) {
      String text = element.getText();
      list.add(text);
    }
    return list;
  }

  
}