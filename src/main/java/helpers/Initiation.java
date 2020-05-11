package helpers;

import locators.LogInAndOutPageLocators;
import org.openqa.selenium.WebDriver;

public class Initiation {

  WebDriver driver;
  LogInAndOutPageLocators logInAndOutPageLocators = new LogInAndOutPageLocators();

  public Initiation(WebDriver driver){
    this.driver = driver;
  }

  public String loginURL = "https://github.com/login";
  public String login = "aqa-tutoring";
  public String password = "aqatest123";

  public void init(){
    driver.findElement(logInAndOutPageLocators.loginField).sendKeys(login);
    driver.findElement(logInAndOutPageLocators.passwordField).sendKeys(password);
    driver.findElement(logInAndOutPageLocators.signInButton).click();
  }
}