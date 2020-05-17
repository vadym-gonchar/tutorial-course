package githubTests;

import helpers.Initiation;
import locators.LogInAndOutPageLocators;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;

public class TestHelper extends TestBase {

  LogInAndOutPageLocators logInAndOutPageLocators = new LogInAndOutPageLocators();

  @BeforeGroups(groups = {"uitest"})
  public void login() {
    Initiation initiation = new Initiation(driver);
    driver.get(initiation.loginURL);
    driver.manage().window().maximize();
    initiation.init();
  }

  @AfterGroups(groups = {"uitest"})
  public void logout() {
    driver.findElement(logInAndOutPageLocators.dropdown).click();
    driver.findElement(logInAndOutPageLocators.signOutButton).click();
  }
}