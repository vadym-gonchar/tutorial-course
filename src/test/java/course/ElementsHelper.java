package course;

import org.openqa.selenium.By;
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

  public boolean isClickable(By locator){
    try{
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      wait.until(ExpectedConditions.elementToBeClickable(locator));
      return true;
    } catch (NoSuchElementException e){
      throw  new RuntimeException("Web element is not present: " + locator, e);
    }
  }
  public boolean isElementPresent(By element){
    try {
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      wait.until(ExpectedConditions.visibilityOfElementLocated(element));
      return true;
    } catch (NoSuchElementException e){
      throw  new RuntimeException("Web element is not present: " + element, e);
    }
  }
}