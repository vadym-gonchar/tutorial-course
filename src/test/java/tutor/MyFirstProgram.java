package tutor;

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
  ElementsHelper elementsHelper = new ElementsHelper(driver);

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
    boolean isPullRequestsClickable = elementsHelper.isClickable(headerTabLocators.pullRequests);
    Assert.assertTrue(isPullRequestsClickable);

    boolean isIssuesPresent = driver.findElement(headerTabLocators.issues).isDisplayed();
    Assert.assertTrue(isIssuesPresent);
    boolean isIssuesClickable = elementsHelper.isClickable(headerTabLocators.issues);
    Assert.assertTrue(isIssuesClickable);

    boolean isMarketplacePresent = driver.findElement(headerTabLocators.marketplace).isDisplayed();
    Assert.assertTrue(isMarketplacePresent);
    boolean isMarketplaceClickable = elementsHelper.isClickable(headerTabLocators.marketplace);
    Assert.assertTrue(isMarketplaceClickable);

    boolean isExplorePresent = driver.findElement(headerTabLocators.explore).isDisplayed();
    Assert.assertTrue(isExplorePresent);
    boolean isExploreClickable = elementsHelper.isClickable(headerTabLocators.explore);
    Assert.assertTrue(isExploreClickable);
  }

  @Test(priority = 3)
  public void marketplacePageTest() {
    driver.get("https://github.com/marketplace");

    boolean isExploreFreeAppsButtonPresent = driver.findElement(marketplaceLocators.exploreFreeAppsButton).isDisplayed();
    Assert.assertTrue(isExploreFreeAppsButtonPresent);
    boolean isExploreFreeAppsButtonClickable = elementsHelper.isClickable(marketplaceLocators.exploreFreeAppsButton);
    Assert.assertTrue(isExploreFreeAppsButtonClickable);

    boolean isExploreActionsButtonPresent = driver.findElement(marketplaceLocators.exploreActionsButton).isDisplayed();
    Assert.assertTrue(isExploreActionsButtonPresent);
    boolean isExploreActionsButtonClickable = elementsHelper.isClickable(marketplaceLocators.exploreActionsButton);
    Assert.assertTrue(isExploreActionsButtonClickable);

    boolean isAppsTypePresent = driver.findElement(marketplaceLocators.appsTypes).isDisplayed();
    Assert.assertTrue(isAppsTypePresent);
    boolean isAppsTypeClickable = elementsHelper.isClickable(marketplaceLocators.appsTypes);
    Assert.assertTrue(isAppsTypeClickable);

    boolean isActionsTypePresent = driver.findElement(marketplaceLocators.actionsTypes).isDisplayed();
    Assert.assertTrue(isActionsTypePresent);
    boolean isActionsTypeClickable = elementsHelper.isClickable(marketplaceLocators.actionsTypes);
    Assert.assertTrue(isActionsTypeClickable);

    boolean isChatPresent = driver.findElement(marketplaceLocators.chatCategories).isDisplayed();
    Assert.assertTrue(isChatPresent);
    boolean isChatClickable = elementsHelper.isClickable(marketplaceLocators.chatCategories);
    Assert.assertTrue(isChatClickable);

    boolean isCodeInspectorPresent = driver.findElement(marketplaceLocators.codeInspectorTrending).isDisplayed();
    Assert.assertTrue(isCodeInspectorPresent);
    boolean isCodeInspectorClickable = elementsHelper.isClickable(marketplaceLocators.codeInspectorTrending);
    Assert.assertTrue(isCodeInspectorClickable);

    driver.findElement(marketplaceLocators.svg).click();
    boolean isFreeFiltersPresent = driver.findElement(marketplaceLocators.freeFilters).isDisplayed();
    Assert.assertTrue(isFreeFiltersPresent);
    boolean isFreeFiltersClickable = elementsHelper.isClickable(marketplaceLocators.freeFilters);
    Assert.assertTrue(isFreeFiltersClickable);

    boolean isVerifiedPresent = driver.findElement(marketplaceLocators.verifiedVerification).isDisplayed();
    Assert.assertTrue(isVerifiedPresent);
    boolean isVerifiedClickable = elementsHelper.isClickable(marketplaceLocators.verifiedVerification);
    Assert.assertTrue(isVerifiedClickable);

    boolean isVueggPresent = driver.findElement(marketplaceLocators.vueggRecentlyAdded).isDisplayed();
    Assert.assertTrue(isVueggPresent);
    boolean isVueggClickable = elementsHelper.isClickable(marketplaceLocators.vueggRecentlyAdded);
    Assert.assertTrue(isVueggClickable);

    boolean isCodeClimatePresent = driver.findElement(marketplaceLocators.codeClimateCodeQuality).isDisplayed();
    Assert.assertTrue(isCodeClimatePresent);
    boolean isCodeClimateClickable = elementsHelper.isClickable(marketplaceLocators.codeClimateCodeQuality);
    Assert.assertTrue(isCodeClimateClickable);

    boolean isBuddyPresent = driver.findElement(marketplaceLocators.buddyCI).isDisplayed();
    Assert.assertTrue(isBuddyPresent);
    boolean isBuddyClickable = elementsHelper.isClickable(marketplaceLocators.buddyCI);
    Assert.assertTrue(isBuddyClickable);

    boolean isSentryPresent = driver.findElement(marketplaceLocators.sentryMonitoring).isDisplayed();
    Assert.assertTrue(isSentryPresent);
    boolean isSentryClickable = elementsHelper.isClickable(marketplaceLocators.sentryMonitoring);
    Assert.assertTrue(isSentryClickable);

    boolean isStalePresent = driver.findElement(marketplaceLocators.stalePM).isDisplayed();
    Assert.assertTrue(isStalePresent);
    boolean isStaleClickable = elementsHelper.isClickable(marketplaceLocators.stalePM);
    Assert.assertTrue(isStaleClickable);

    boolean isFooterTermsPresent = driver.findElement(marketplaceLocators.footerTerms).isDisplayed();
    Assert.assertTrue(isFooterTermsPresent);
    boolean isFooterTermsClickable = elementsHelper.isClickable(marketplaceLocators.footerTerms);
    Assert.assertTrue(isFooterTermsClickable);

    driver.quit();
  }
}