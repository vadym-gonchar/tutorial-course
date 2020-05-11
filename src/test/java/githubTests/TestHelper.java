package githubTests;

import helpers.Initiation;
import locators.LogInAndOutPageLocators;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestHelper extends TestBase {

  LogInAndOutPageLocators logInAndOutPageLocators = new LogInAndOutPageLocators();

  @BeforeSuite(alwaysRun = true)
  public void login() {
    Initiation initiation = new Initiation(driver);
    driver.get(initiation.loginURL);
    driver.manage().window().maximize();
    initiation.init();
  }

  @AfterSuite(alwaysRun = true)
  public void logout() {
    driver.findElement(logInAndOutPageLocators.dropdown).click();
    driver.findElement(logInAndOutPageLocators.signOutButton).click();
  }
}