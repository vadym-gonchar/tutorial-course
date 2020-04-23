package Helpers;

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

    public String getTextofClickableElement(By element, int timeout){
      try {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        return driver.findElement(element).getText();
      } catch (NoSuchElementException e){
        throw  new RuntimeException("Web element is not present: " + element, e);
      }
    }
  }