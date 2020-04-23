package GithubProjectTests;

import Helpers.ElementsHelper;
import Locators.ApiManagementLocators;
import Locators.HeaderTabLocators;
import Locators.LoginPageLocators;
import Locators.MarketplaceLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GithubProjectTests {
  WebDriver driver = new ChromeDriver();

  LoginPageLocators loginPageLocators = new LoginPageLocators();
  HeaderTabLocators headerTabLocators = new HeaderTabLocators();
  MarketplaceLocators marketplaceLocators = new MarketplaceLocators();
  ElementsHelper elementsHelper = new ElementsHelper(driver);
  ApiManagementLocators apiManagementLocators = new ApiManagementLocators();

  @Test(priority = 1)
  public void loginTest() {
    driver.navigate().to("https://github.com/login");
    elementsHelper.getTextofClickableElement(loginPageLocators.loginField, 10);
    driver.manage().window().fullscreen();
    driver.findElement(loginPageLocators.loginField).sendKeys("aqa-tutoring");
    driver.findElement(loginPageLocators.passwordField).sendKeys("aqatest123");
    driver.findElement(loginPageLocators.signInButton).click();
  }

  @Test(priority = 2)
  public void headerTabTest() {

    Assert.assertEquals(elementsHelper.getTextofClickableElement(headerTabLocators.pullRequests, 10), "Pull requests");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(headerTabLocators.issues, 10), "Issues");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(headerTabLocators.marketplace, 10), "Marketplace");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(headerTabLocators.explore, 10), "Explore");
  }

  @Test(priority = 3)
  public void marketplacePageTest() {
    driver.get("https://github.com/marketplace");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.exploreFreeAppsButton, 10), "Explore free apps");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.exploreActionsButton, 10), "Explore Actions");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.appsTypes, 10), "Apps");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.actionsTypes, 10), "Actions");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.chatCategories, 10), "Chat");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.codeInspectorTrending, 10), "Code Inspector");

    driver.findElement(marketplaceLocators.svg).click();
    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.freeFilters, 10), "Free");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.verifiedVerification, 10), "Verified");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.vueggRecentlyAdded, 10), "vuegg");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.codeClimateCodeQuality, 10), "Code Climate");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.buddyCI, 10), "Buddy");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.sentryMonitoring, 10), "Sentry");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.stalePM, 10), "Stale");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.footerTerms, 10), "Terms");
  }

  @Test(priority = 4)
  public void apiManagementPageTest() {
    driver.get("https://github.com/marketplace/category/api-management");
    Assert.assertEquals(elementsHelper.getTextofClickableElement(apiManagementLocators.moesif, 10), "Moesif API Insights");
    driver.findElement(apiManagementLocators.nextButton1).click();
    Assert.assertEquals(elementsHelper.getTextofClickableElement(apiManagementLocators.releaseCreator, 10), "Release Creator with Auto-Tag Generation");
    driver.findElement(apiManagementLocators.nextButton2).click();
    Assert.assertEquals(elementsHelper.getTextofClickableElement(apiManagementLocators.uploadToCF, 10), "Upload to CurseForge");
    driver.findElement(apiManagementLocators.nextButton2).click();
    Assert.assertEquals(elementsHelper.getTextofClickableElement(apiManagementLocators.consumableCode, 10), "Consumable Code Movie TMDB API");

    driver.quit();
  }
}