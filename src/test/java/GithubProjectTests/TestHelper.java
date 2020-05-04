package GithubProjectTests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestHelper extends TestBase {

  @BeforeSuite(alwaysRun = true)
  public void login() {
    driver.get(loginURL);
    driver.manage().window().maximize();
    driver.findElement(logInAndOutPageLocators.loginField).sendKeys(login);
    driver.findElement(logInAndOutPageLocators.passwordField).sendKeys(password);
    driver.findElement(logInAndOutPageLocators.signInButton).click();
  }

  @AfterSuite(alwaysRun = true)
  public void logout() {
    driver.findElement(logInAndOutPageLocators.dropdown).click();
    driver.findElement(logInAndOutPageLocators.signOutButton).click();
  }
}