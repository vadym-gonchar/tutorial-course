package GithubProjectTests;

import org.testng.annotations.*;

public class TestHelper extends TestBase {

  @BeforeClass
  public void login() {
    driver.navigate().to("https://github.com/login");
    driver.manage().window().fullscreen();
    driver.findElement(logInAndOutPageLocators.loginField).sendKeys("aqa-tutoring");
    driver.findElement(logInAndOutPageLocators.passwordField).sendKeys("aqatest123");
    driver.findElement(logInAndOutPageLocators.signInButton).click();
  }

  @AfterClass
  public void logout(){
    driver.findElement(logInAndOutPageLocators.dropdown).click();
    driver.findElement(logInAndOutPageLocators.signOutButton).click();
  }
}