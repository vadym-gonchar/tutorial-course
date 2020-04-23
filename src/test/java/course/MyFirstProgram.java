package course;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstProgram {
  WebDriver driver = new ChromeDriver();

  LoginPageLocators loginPageLocators = new LoginPageLocators();
  HeaderTabLocators headerTabLocators = new HeaderTabLocators();
  MarketplaceLocators marketplaceLocators = new MarketplaceLocators();
  ElementsHelper elementsHelper = new ElementsHelper(driver);

  @Test(priority = 1)
  public void loginTest() {
    driver.navigate().to("https://github.com/login");
    elementsHelper.getTextofClickableElement(loginPageLocators.loginField);
    driver.manage().window().fullscreen();
    driver.findElement(loginPageLocators.loginField).sendKeys("aqa-tutoring");
    driver.findElement(loginPageLocators.passwordField).sendKeys("aqatest123");
    driver.findElement(loginPageLocators.signInButton).click();
  }

  @Test(priority = 2)
  public void headerTabTest() {

    Assert.assertEquals(elementsHelper.getTextofClickableElement(headerTabLocators.pullRequests), "Pull requests");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(headerTabLocators.issues), "Issues");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(headerTabLocators.marketplace), "Marketplace");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(headerTabLocators.explore), "Explore");
  }

  @Test(priority = 3)
  public void marketplacePageTest() {
    driver.get("https://github.com/marketplace");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.exploreFreeAppsButton), "Explore free apps");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.exploreActionsButton), "Explore Actions");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.appsTypes), "Apps");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.actionsTypes), "Actions");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.chatCategories), "Chat");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.codeInspectorTrending), "Code Inspector");

    driver.findElement(marketplaceLocators.svg).click();
    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.freeFilters), "Free");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.verifiedVerification), "Verified");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.vueggRecentlyAdded), "vuegg");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.codeClimateCodeQuality), "Code Climate");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.buddyCI), "Buddy");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.sentryMonitoring), "Sentry");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.stalePM), "Stale");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.footerTerms), "Terms");

    driver.quit();
  }
}