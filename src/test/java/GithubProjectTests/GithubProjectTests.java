package GithubProjectTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GithubProjectTests extends TestHelper {

  @Test(priority = 1, groups = "uitest")
  public void headerTabTest() {

    Assert.assertEquals(elementsHelper.getTextofClickableElement(headerTabLocators.pullRequests, 10), "Pull requests", "The name of web element does not match the 'Pull requests' name");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(headerTabLocators.issues, 10), "Issues", "The name of web element does not match the 'Issues' name");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(headerTabLocators.marketplace, 10), "Marketplace", "The name of web element does not match the 'Marketplace' name");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(headerTabLocators.explore, 10), "Explore", "The name of web element does not match the 'Explore' name");
  }

  @Test(priority = 2, groups = "uitest")
  public void marketplacePageTest() {

    driver.get(marketplaceURL);

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.exploreFreeAppsButton, 10), "Explore free apps", "The name of web element does not match the 'Explore free apps' name");
    Assert.assertEquals(driver.findElement(marketplaceLocators.extendGitHub).getText(), "Extend GitHub", "The name of web element does not match the 'Extend GitHub' name");
    Assert.assertEquals(driver.findElement(marketplaceLocators.findTools).getText(), "Find tools to improve your workflow", "The name of web element does not match the 'Find tools to improve your workflow' name");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.exploreActionsButton, 10), "Explore Actions", "The name of web element does not match the 'Explore Actions' name");
    Assert.assertEquals(driver.findElement(marketplaceLocators.introGithub).getText(), "Introducing GitHub Actions", "The name of web element does not match the 'Introducing GitHub Actions' name");
    Assert.assertEquals(driver.findElement(marketplaceLocators.mrktplcAnnouncmnt).getText(), "An entirely new way to automate your development workflow.", "The name of web element does not match the 'An entirely new way to automate your development workflow.' name");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.appsTypes, 10), "Apps", "The name of web element does not match the 'Apps' name");
    Assert.assertEquals(driver.findElement(marketplaceLocators.types).getText(), "Types", "The name of web element does not match the 'Types' name");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.actionsTypes, 10), "Actions", "The name of web element does not match the 'Actions' name");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.chatCategories, 10), "Chat", "The name of web element does not match the 'Chat' name");
    Assert.assertEquals(driver.findElement(marketplaceLocators.categories).getText(), "Categories", "The name of web element does not match the 'Categories' name");
    Assert.assertEquals(driver.findElement(marketplaceLocators.recommended).getText(), "Recommended for you", "The name of web element does not match the 'Recommended for you' name");

    Assert.assertEquals(driver.findElement(marketplaceLocators.trending).getText(), "Trending", "The name of web element does not match the 'Trending' name");

    driver.findElement(marketplaceLocators.svg).click();
    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.freeFilters, 10), "Free", "The name of web element does not match the 'Free' name");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.verifiedVerification, 10), "Verified", "The name of web element does not match the 'Verified' name");
    Assert.assertEquals(driver.findElement(marketplaceLocators.verification).getText(), "Verification", "The name of web element does not match the 'Verification' name");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.vueggRecentlyAdded, 10), "vuegg", "The name of web element does not match the 'vuegg' name");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.codeClimateCodeQuality, 10), "Code Climate", "The name of web element does not match the 'Code Climate' name");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.buddyCI, 10), "Buddy", "The name of web element does not match the 'Buddy' name");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.sentryMonitoring, 10), "Sentry", "The name of web element does not match the 'Sentry' name");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.stalePM, 10), "Stale", "The name of web element does not match the 'Stale' name");

    Assert.assertEquals(elementsHelper.getTextofClickableElement(marketplaceLocators.footerTerms, 10), "Terms", "The name of web element does not match the 'Terms' name");
  }

  @Test(priority = 3, groups = "uitest")
  public void apiManagementPageTest() {

    driver.get(apiManagementURL);

    Assert.assertEquals(elementsHelper.getTextofClickableElement(apiManagementLocators.moesif, 10), "Moesif API Insights", "The name of web element does not match the 'Moesif API Insights' name");
    Assert.assertEquals(driver.findElement(apiManagementLocators.apiMngmnt).getText(), "API management", "The name of web element does not match the 'API management' name");
    Assert.assertEquals(driver.findElement(apiManagementLocators.searchResults).getText(), "Search results", "The name of web element does not match the 'Search results' name");

    driver.findElement(apiManagementLocators.nextButton1).click();
    Assert.assertEquals(elementsHelper.getTextofClickableElement(apiManagementLocators.releaseCreator, 10), "Release Creator with Auto-Tag Generation", "The name of web element does not match the 'Release Creator with Auto-Tag Generation' name");
    Assert.assertEquals(driver.findElement(apiManagementLocators.releaseCreatorSubheader).getText(), "Creates github releases", "The name of web element does not match the 'Creates github releases' name");

    driver.findElement(apiManagementLocators.nextButton2).click();
    Assert.assertEquals(elementsHelper.getTextofClickableElement(apiManagementLocators.uploadToCF, 10), "Upload to CurseForge", "The name of web element does not match the 'Upload to CurseForge' name");
    Assert.assertEquals(driver.findElement(apiManagementLocators.uploadToCFSubheader).getText(), "Uploads files to CurseForge via CurseForge API", "The name of web element does not match the 'Uploads files to CurseForge via CurseForge API' name");

    driver.findElement(apiManagementLocators.nextButton2).click();
    Assert.assertEquals(elementsHelper.getTextofClickableElement(apiManagementLocators.consumableCode, 10), "Consumable Code Movie TMDB API", "The name of web element does not match the 'Consumable Code Movie TMDB API' name");
    Assert.assertEquals(driver.findElement(apiManagementLocators.disabledButtonText).getText(), "Next", "The name of web element does not match the 'Next' name");
  }

  @Test(priority = 4, groups = "uitest")
  public void deploymentPage() {

    driver.get(deploymentURL);

    Assert.assertEquals(elementsHelper.getTextfromInputField(deploymentLocators.semaphore, 10), driver.findElement(deploymentLocators.semaphore).getText());
    driver.get(deploymentURL);

    Assert.assertEquals(elementsHelper.getTextfromInputField(deploymentLocators.cloud66, 10), driver.findElement(deploymentLocators.cloud66).getText());
    driver.get(deploymentURL);

    Assert.assertEquals(elementsHelper.getTextfromInputField(deploymentLocators.triggerMesh, 10), driver.findElement(deploymentLocators.triggerMesh).getText());
    driver.get(deploymentURL);

    Assert.assertEquals(elementsHelper.getTextfromInputField(deploymentLocators.decentralInet, 10), driver.findElement(deploymentLocators.decentralInet).getText());
    driver.get(deploymentURL);

    Assert.assertEquals(elementsHelper.getTextfromInputField(deploymentLocators.swiftPackage, 10), driver.findElement(deploymentLocators.swiftPackage).getText());
  }

  @Test(priority = 5, groups = "uitest")
  public void explorePage() {

    driver.get(exploreURL);

    Assert.assertEquals(elementsHelper.getTextofClickableElement(exploreLocators.exploreTab, 10), "Explore", "The name of web element does not match the 'Explore' name");
    Assert.assertEquals(elementsHelper.getTextofClickableElement(exploreLocators.topics, 10), "Topics", "The name of web element does not match the 'Topics' name");
    Assert.assertEquals(elementsHelper.getTextofClickableElement(exploreLocators.trending, 10), "Trending", "The name of web element does not match the 'Trending' name");
    Assert.assertEquals(elementsHelper.getTextofClickableElement(exploreLocators.collections, 10), "Collections", "The name of web element does not match the 'Collections' name");
    Assert.assertEquals(elementsHelper.getTextofClickableElement(exploreLocators.events, 10), "Events", "The name of web element does not match the 'Events' name");
    Assert.assertEquals(elementsHelper.getTextofClickableElement(exploreLocators.githubSponsors, 10), "GitHub Sponsors", "The name of web element does not match the 'GitHub Sponsors' name");
  }
}