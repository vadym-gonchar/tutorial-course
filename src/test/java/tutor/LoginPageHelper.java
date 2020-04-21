package tutor;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageHelper {
  WebDriver driver;

  LoginPageHelper(WebDriver driver){
    this.driver = driver;
  }

  public boolean isLoginPresent(By element, int timeout){
    WebDriverWait wait = new WebDriverWait(driver, timeout);
    try {
      wait.until(ExpectedConditions.presenceOfElementLocated(element));
      return true;
    } catch (NoSuchElementException ex){
      throw  new RuntimeException("Web element is not present: " + element, ex);
    }
  }
}