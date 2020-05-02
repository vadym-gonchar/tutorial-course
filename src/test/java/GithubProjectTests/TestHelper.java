package GithubProjectTests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestHelper extends TestBase {
  String loginUrl = "https://github.com/login";

  @BeforeSuite(alwaysRun = true)
  public void login() {
    driver.get(loginUrl);
    driver.manage().window().maximize();
    driver.findElement(logInAndOutPageLocators.loginField).sendKeys("aqa-tutoring");
    driver.findElement(logInAndOutPageLocators.passwordField).sendKeys("aqatest123");
    driver.findElement(logInAndOutPageLocators.signInButton).click();
  }

  @AfterSuite(alwaysRun = true)
  public void logout() {
    driver.findElement(logInAndOutPageLocators.dropdown).click();
    driver.findElement(logInAndOutPageLocators.signOutButton).click();
  }
}