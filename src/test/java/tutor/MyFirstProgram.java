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
  MarketplaceLocators marketplaceLocators = new MarketplaceLocators();

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

    boolean isExploreFreeAppsButtonPresent = driver.findElement(marketplaceLocators.exploreFreeAppsButton).isDisplayed();
    Assert.assertTrue(isExploreFreeAppsButtonPresent);

    boolean isExploreActionsButtonPresent = driver.findElement(marketplaceLocators.exploreActionsButton).isDisplayed();
    Assert.assertTrue(isExploreActionsButtonPresent);

    boolean isAppsTypePresent = driver.findElement(marketplaceLocators.appsTypes).isDisplayed();
    Assert.assertTrue(isAppsTypePresent);

    boolean isActionsTypePresent = driver.findElement(marketplaceLocators.actionsTypes).isDisplayed();
    Assert.assertTrue(isActionsTypePresent);

    boolean isChatPresent = driver.findElement(marketplaceLocators.chatCategories).isDisplayed();
    Assert.assertTrue(isChatPresent);

    boolean isCodeInspectorPresent = driver.findElement(marketplaceLocators.codeInspectorTrending).isDisplayed();
    Assert.assertTrue(isCodeInspectorPresent);

    driver.findElement(marketplaceLocators.svg).click();
    boolean isFreeFiltersPresent = driver.findElement(marketplaceLocators.freeFilters).isDisplayed();
    Assert.assertTrue(isFreeFiltersPresent);

    boolean isVerifiedPresent = driver.findElement(marketplaceLocators.verifiedVerification).isDisplayed();
    Assert.assertTrue(isVerifiedPresent);

    boolean isVueggPresent = driver.findElement(marketplaceLocators.vueggRecentlyAdded).isDisplayed();
    Assert.assertTrue(isVueggPresent);

    boolean isCodeClimatePresent = driver.findElement(marketplaceLocators.codeClimateCodeQuality).isDisplayed();
    Assert.assertTrue(isCodeClimatePresent);

    boolean isBuddyPresent = driver.findElement(marketplaceLocators.buddyCI).isDisplayed();
    Assert.assertTrue(isBuddyPresent);

    boolean isSentryPresent = driver.findElement(marketplaceLocators.sentryMonitoring).isDisplayed();
    Assert.assertTrue(isSentryPresent);

    boolean isStalePresent = driver.findElement(marketplaceLocators.stalePM).isDisplayed();
    Assert.assertTrue(isStalePresent);

    boolean isFooterTermsPresent = driver.findElement(marketplaceLocators.footerTerms).isDisplayed();
    Assert.assertTrue(isFooterTermsPresent);

    driver.quit();
  }
}