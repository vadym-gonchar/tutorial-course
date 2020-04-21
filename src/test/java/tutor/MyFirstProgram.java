package tutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstProgram {
  WebDriver driver = new ChromeDriver();
  LoginPageLocators loginPageLocators = new LoginPageLocators();
  LoginPageHelper loginPageHelper = new LoginPageHelper(driver);
  HeaderTabLocators headerTabLocators = new HeaderTabLocators();

  @Test(priority = 1)
  public void loginTest() {
    driver.navigate().to("https://github.com/login");
    loginPageHelper.isLoginPresent(loginPageLocators.loginField, 10);
    driver.manage().window().fullscreen();
    driver.findElement(loginPageLocators.loginField).sendKeys("aqa-tutoring");
    driver.findElement(loginPageLocators.passwordField).sendKeys("aqatest123");
    driver.findElement(loginPageLocators.signInButton).click();
  }

  @Test(priority = 2)
  public void headerTabTest() {

    boolean isPullRequestsPresent = driver.findElement(headerTabLocators.pullRequests).isDisplayed();
    Assert.assertTrue(isPullRequestsPresent);

    boolean isIssuesPresent = driver.findElement(headerTabLocators.issues).isDisplayed();
    Assert.assertTrue(isIssuesPresent);

    boolean isMarketplacePresent = driver.findElement(headerTabLocators.marketplace).isDisplayed();
    Assert.assertTrue(isMarketplacePresent);

    boolean isExplorePresent = driver.findElement(headerTabLocators.explore).isDisplayed();
    Assert.assertTrue(isExplorePresent);
  }

  @Test(priority = 3)
  public void marketplacePageTest() {
    driver.get("https://github.com/marketplace");

    boolean isExploreFreeAppsButtonPresent = driver.findElement(By.linkText("Explore free apps")).isDisplayed();
    Assert.assertTrue(isExploreFreeAppsButtonPresent);

    boolean isAppsTypePresent = driver.findElement(By.linkText("Apps")).isDisplayed();
    Assert.assertTrue(isAppsTypePresent);

    driver.quit();
  }
}