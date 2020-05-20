package githubTests;

import locators.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNot.not;

public class GithubTests extends TestHelper {

  HeaderTabLocators headerTabLocators = new HeaderTabLocators();
  MarketplaceLocators marketplaceLocators = new MarketplaceLocators();
  ApiManagementLocators apiManagementLocators = new ApiManagementLocators();
  DeploymentLocators deploymentLocators = new DeploymentLocators();
  ExploreLocators exploreLocators = new ExploreLocators();

  @Test(priority = 1, groups = "uitest")
  public void headerTabTest() {

    Assert.assertEquals(elementsHelper.getTextOfClickableElement(headerTabLocators.pullRequests, 10),
            "Pull requests",
            "The name of web element does not match the 'Pull requests' name");

    Assert.assertEquals(elementsHelper.getTextOfClickableElement(headerTabLocators.issues, 10),
            "Issues", "The name of web element does not match the 'Issues' name");

    Assert.assertEquals(elementsHelper.getTextOfClickableElement(headerTabLocators.marketplace, 10),
            "Marketplace", "The name of web element does not match the 'Marketplace' name");

    Assert.assertEquals(elementsHelper.getTextOfClickableElement(headerTabLocators.explore, 10),
            "Explore", "The name of web element does not match the 'Explore' name");
  }

  @Test(priority = 2, groups = "uitest")
  public void marketplacePageTest() {

    elementsHelper.click(headerTabLocators.marketplace, 10);

    Assert.assertEquals(elementsHelper.getAttributeOfElement(deploymentLocators.searchField,
            10), "Search for apps and actions",
            "The name of web element does not match the 'Search for apps and actions' name");

    Assert.assertEquals(elementsHelper.getTextOfClickableElement(marketplaceLocators.exploreFreeAppsButton,
            10), "Explore free apps",
            "The name of web element does not match the 'Explore free apps' name");

    Assert.assertEquals(elementsHelper.getTextOfVisibleElement(marketplaceLocators.extendGitHub, 10),
            "Extend GitHub",
            "The name of web element does not match the 'Extend GitHub' name");

    Assert.assertEquals(elementsHelper.getTextOfVisibleElement(marketplaceLocators.findTools, 10),
            "Find tools to improve your workflow",
            "The name of web element does not match the 'Find tools to improve your workflow' name");

    Assert.assertEquals(elementsHelper.getTextOfClickableElement(marketplaceLocators.exploreActionsButton,
            10), "Explore Actions",
            "The name of web element does not match the 'Explore Actions' name");

    Assert.assertEquals(elementsHelper.getTextOfVisibleElement(marketplaceLocators.introGithub, 10),
            "Introducing GitHub Actions",
            "The name of web element does not match the 'Introducing GitHub Actions' name");

    Assert.assertEquals(elementsHelper.getTextOfVisibleElement(marketplaceLocators.mrktplcAnnouncmnt,
            10), "An entirely new way to automate your development workflow.",
            "The name of web element does not match " +
                    "the 'An entirely new way to automate your development workflow.' name");

    Assert.assertEquals(elementsHelper.getTextOfClickableElement(marketplaceLocators.appsTypes, 10),
            "Apps", "The name of web element does not match the 'Apps' name");

    Assert.assertEquals(elementsHelper.getTextOfVisibleElement(marketplaceLocators.types, 10),
            "Types", "The name of web element does not match the 'Types' name");

    Assert.assertEquals(elementsHelper.getTextOfClickableElement(marketplaceLocators.actionsTypes,
            10), "Actions",
            "The name of web element does not match the 'Actions' name");

    Assert.assertEquals(elementsHelper.getTextOfClickableElement(marketplaceLocators.chatCategories,
            10), "Chat",
            "The name of web element does not match the 'Chat' name");

    Assert.assertEquals(elementsHelper.getTextOfVisibleElement(marketplaceLocators.categories, 10),
            "Categories", "The name of web element does not match the 'Categories' name");

    Assert.assertEquals(elementsHelper.getTextOfVisibleElement(marketplaceLocators.recommended, 10),
            "Recommended for you",
            "The name of web element does not match the 'Recommended for you' name");

    Assert.assertEquals(elementsHelper.getTextOfVisibleElement(marketplaceLocators.trending, 10),
            "Trending", "The name of web element does not match the 'Trending' name");

    Assert.assertEquals(elementsHelper.getTextOfElementAndClick(marketplaceLocators.filters, 10),
            "Filters", "The name of web element does not match the 'Filters' name");

    Assert.assertEquals(elementsHelper.getTextOfClickableElement(marketplaceLocators.freeFilters, 10),
            "Free", "The name of web element does not match the 'Free' name");

    Assert.assertEquals(elementsHelper.getTextOfClickableElement(marketplaceLocators.verifiedVerification,
            10), "Verified",
            "The name of web element does not match the 'Verified' name");

    Assert.assertEquals(elementsHelper.getTextOfVisibleElement(marketplaceLocators.verification, 10),
            "Verification",
            "The name of web element does not match the 'Verification' name");

    Assert.assertEquals(elementsHelper.getTextOfElementAndClick(marketplaceLocators.yourItems, 10),
            "Your items", "The name of web element does not match the 'Your items' name");

    Assert.assertEquals(elementsHelper.getTextOfClickableElement(marketplaceLocators.vueggRecentlyAdded,
            10), "vuegg", "The name of web element does not match the 'vuegg' name");

    Assert.assertEquals(elementsHelper.getTextOfClickableElement(marketplaceLocators.codeClimateCodeQuality,
            10), "Code Climate",
            "The name of web element does not match the 'Code Climate' name");

    Assert.assertEquals(elementsHelper.getTextOfClickableElement(marketplaceLocators.buddyCI, 10),
            "Buddy", "The name of web element does not match the 'Buddy' name");

    Assert.assertEquals(elementsHelper.getTextOfClickableElement(marketplaceLocators.sentryMonitoring,
            10), "Sentry",
            "The name of web element does not match the 'Sentry' name");

    Assert.assertEquals(elementsHelper.getTextOfClickableElement(marketplaceLocators.stalePM, 10),
            "Stale", "The name of web element does not match the 'Stale' name");

    Assert.assertEquals(elementsHelper.getTextOfClickableElement(marketplaceLocators.footerTerms,
            10), "Terms",
            "The name of web element does not match the 'Terms' name");
  }

  @Test(priority = 3, groups = "uitest")
  public void apiManagementPageTest() {

    elementsHelper.click(apiManagementLocators.apiMngmntUrl, 10);

    Assert.assertEquals(elementsHelper.getTextOfClickableElement(apiManagementLocators.moesif, 10),
            "Moesif API Insights",
            "The name of web element does not match the 'Moesif API Insights' name");

    Assert.assertEquals(elementsHelper.getTextOfVisibleElement(apiManagementLocators.apiMngmnt, 10),
            "API management",
            "The name of web element does not match the 'API management' name");

    Assert.assertEquals(elementsHelper.getTextOfVisibleElement(apiManagementLocators.searchResults,
            10), "Search results",
            "The name of web element does not match the 'Search results' name");

    driver.findElement(apiManagementLocators.nextButton1).click();

    Assert.assertEquals(elementsHelper.getTextOfClickableElement(apiManagementLocators.createRelease,
            10), "Create Release - local",
            "The name of web element does not match " +
                    "the 'Create Release - local' name");

    Assert.assertEquals(elementsHelper.getTextOfVisibleElement(apiManagementLocators.office365,
            10), "Office 365 CLI Login",
            "The name of web element does not match the 'Office 365 CLI Login");

    driver.findElement(apiManagementLocators.nextButton2).click();

    Assert.assertEquals(elementsHelper.getTextOfClickableElement(apiManagementLocators.uploadToCF,
            10), "Upload to CurseForge",
            "The name of web element does not match the 'Upload to CurseForge' name");

    Assert.assertEquals(elementsHelper.getTextOfVisibleElement(apiManagementLocators.uploadToCFSubheader,
            10), "Uploads files to CurseForge via CurseForge API",
            "The name of web element does not match the 'Uploads files " +
                    "to CurseForge via CurseForge API' name");

    driver.findElement(apiManagementLocators.nextButton2).click();

    Assert.assertEquals(elementsHelper.getTextOfClickableElement(apiManagementLocators.consumableCode,
            10), "Consumable Code Movie TMDB API",
            "The name of web element does not match the 'Consumable Code Movie TMDB API' name");

    Assert.assertTrue(driver.findElement(apiManagementLocators.previousButton).isEnabled());

    Assert.assertEquals(elementsHelper.getAttributeOfElement(deploymentLocators.searchField,
            10), "Search for apps and actions",
            "The name of web element does not match the 'Search for apps and actions' name");
  }

  @Test(priority = 4, groups = "uitest")
  public void deploymentPage() {

    elementsHelper.click(deploymentLocators.deploymentUrl, 10);

    elementsHelper.textEnter(deploymentLocators.searchField, 10, "cloud");

    elementsHelper.waitForElementPresence(deploymentLocators.deployToCleverCloud, 10);

    assertThat(elementsHelper.getList(), hasItems("Deploy to Clever Cloud"));

    assertThat(elementsHelper.getList(), not(hasItems("Semaphore")));

    elementsHelper.textEnter(deploymentLocators.searchField, 10, "code");

    elementsHelper.waitForElementPresence(deploymentLocators.screepsDeployer, 10);

    assertThat(elementsHelper.getList(), hasItems("Screeps Deployer"));

    assertThat(elementsHelper.getList(), not(hasItems("Buddy")));

    elementsHelper.textEnter(deploymentLocators.searchField, 10, "delivery");

    elementsHelper.waitForElementPresence(deploymentLocators.setupCDtools, 10);

    assertThat(elementsHelper.getList(), hasItems("Setup CD tools"));

    assertThat(elementsHelper.getList(), not(hasItems("Flaptastic")));
  }

  @Test(priority = 5, groups = "uitest")
  public void explorePage() {

    elementsHelper.click(exploreLocators.exploreUrl, 10);

    Assert.assertEquals(elementsHelper.getTextOfClickableElement(exploreLocators.exploreTab, 10),
            "Explore", "The name of web element does not match the 'Explore' name");

    Assert.assertEquals(elementsHelper.getTextOfClickableElement(exploreLocators.topics, 10),
            "Topics", "The name of web element does not match the 'Topics' name");

    Assert.assertEquals(elementsHelper.getTextOfClickableElement(exploreLocators.trending, 10),
            "Trending", "The name of web element does not match the 'Trending' name");

    Assert.assertEquals(elementsHelper.getTextOfClickableElement(exploreLocators.collections, 10),
            "Collections", "The name of web element does not match the 'Collections' name");

    Assert.assertEquals(elementsHelper.getTextOfClickableElement(exploreLocators.events, 10),
            "Events", "The name of web element does not match the 'Events' name");

    Assert.assertEquals(elementsHelper.getTextOfClickableElement(exploreLocators.githubSponsors, 10),
            "GitHub Sponsors",
            "The name of web element does not match the 'GitHub Sponsors' name");
  }
}