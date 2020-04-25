package GithubProjectTests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class GithubProjectTests extends TestHelper {

  @Test(priority = 1)
  public void headerTabTest() {

    Assert.assertEquals(elementsHelper.getTextofClickableElement(headerTabLocators.pullRequests, 5), "Pull requests");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(headerTabLocators.issues, 5), "Issues");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(headerTabLocators.marketplace, 5), "Marketplace");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(headerTabLocators.explore, 5), "Explore");
  }

  @Test(priority = 2)
  public void marketplacePageTest() {

    driver.get("https://github.com/marketplace");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.exploreFreeAppsButton, 5), "Explore free apps");
    Assert.assertEquals(driver.findElement(marketplaceLocators.extendGitHub).getText(), "Extend GitHub");
    Assert.assertEquals(driver.findElement(marketplaceLocators.findTools).getText(), "Find tools to improve your workflow");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.exploreActionsButton, 5), "Explore Actions");
    Assert.assertEquals(driver.findElement(marketplaceLocators.introGithub).getText(), "Introducing GitHub Actions");
    Assert.assertEquals(driver.findElement(marketplaceLocators.mrktplcAnnouncmnt).getText(), "An entirely new way to automate your development workflow.");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.appsTypes, 5), "Apps");
    Assert.assertEquals(driver.findElement(marketplaceLocators.types).getText(), "Types");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.actionsTypes, 5), "Actions");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.chatCategories, 5), "Chat");
    Assert.assertEquals(driver.findElement(marketplaceLocators.categories).getText(), "Categories");
    Assert.assertEquals(driver.findElement(marketplaceLocators.recommended).getText(), "Recommended for you");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.codeInspectorTrending, 5), "Code Inspector");
    Assert.assertEquals(driver.findElement(marketplaceLocators.trending).getText(), "Trending");

    driver.findElement(marketplaceLocators.svg).click();
    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.freeFilters, 5), "Free");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.verifiedVerification, 5), "Verified");
    Assert.assertEquals(driver.findElement(marketplaceLocators.verification).getText(), "Verification");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.vueggRecentlyAdded, 5), "vuegg");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.codeClimateCodeQuality, 5), "Code Climate");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.buddyCI, 5), "Buddy");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.sentryMonitoring, 5), "Sentry");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.stalePM, 5), "Stale");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.footerTerms, 5), "Terms");
    Assert.assertEquals(driver.findElement(marketplaceLocators.copyright).getText(), "© 2020 GitHub, Inc.");
  }
  @Test(priority = 3)
  public void apiManagementPageTest() {

    driver.get("https://github.com/marketplace/category/api-management");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(apiManagementLocators.moesif, 5), "Moesif API Insights");
    Assert.assertEquals(driver.findElement(apiManagementLocators.apiMngmnt).getText(), "API management");
    Assert.assertEquals(driver.findElement(apiManagementLocators.searchResults).getText(), "Search results");

    driver.findElement(apiManagementLocators.nextButton1).click();
    Assert.assertEquals(elementsHelper.getTextofClickableElement(apiManagementLocators.releaseCreator, 5), "Release Creator with Auto-Tag Generation");
    Assert.assertEquals(driver.findElement(apiManagementLocators.releaseCreatorSubheader).getText(), "Creates github releases");

    driver.findElement(apiManagementLocators.nextButton2).click();
    Assert.assertEquals(elementsHelper.getTextofClickableElement(apiManagementLocators.uploadToCF, 5), "Upload to CurseForge");
    Assert.assertEquals(driver.findElement(apiManagementLocators.uploadToCFSubheader).getText(), "Uploads files to CurseForge via CurseForge API");

    driver.findElement(apiManagementLocators.nextButton2).click();
    Assert.assertEquals(elementsHelper.getTextofClickableElement(apiManagementLocators.consumableCode, 5), "Consumable Code Movie TMDB API");
    Assert.assertEquals(driver.findElement(apiManagementLocators.disabledButtonText).getText(), "Next");
  }
}