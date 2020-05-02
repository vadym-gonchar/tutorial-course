package Locators;

import org.openqa.selenium.By;

public class MarketplaceLocators {

  public By exploreFreeAppsButton = By.linkText("Explore free apps");
  public By extendGitHub = By.xpath("//h1[@class='h00-mktg mb-2 ml-n1 lh-condensed-ultra']");
  public By findTools = By.xpath("//p[@class='lead-mktg mb-4 text-gray lh-condensed']");
  public By introGithub = By.xpath("//h3[contains(text(),'Introducing GitHub Actions')]");
  public By mrktplcAnnouncmnt = By.xpath("//p[@class='MarketplaceAnnouncement-description']");
  public By exploreActionsButton = By.linkText("Explore Actions");
  public By appsTypes = By.linkText("Apps");
  public By types = By.xpath("//h4[@class='text-mono mb-3 text-normal']");
  public By actionsTypes = By.linkText(("Actions"));
  public By chatCategories = By.linkText(("Chat"));
  public By categories = By.xpath("//h4[@class='text-mono mb-3 text-normal mt-6']");
  public By recommended = By.xpath("//h3[contains(text(),'Recommended for you')]");
  public By codeInspectorTrending = By.xpath("//h3[contains(text(),'Code Inspector')]");
  public By trending = By.xpath("//h3[contains(text(),'Trending')]");
  public By svg = By.xpath("//h4[@class='text-mono text-normal mt-6'][contains(text(),'Filters')]//*[local-name()='svg']");
  public By freeFilters = By.linkText(("Free"));
  public By verifiedVerification = By.linkText(("Verified"));
  public By verification = By.xpath("//h4[@class='text-mono mt-6 mb-3 text-normal']");
  public By vueggRecentlyAdded = By.xpath("//h3[contains(text(),'vuegg')]");
  public By codeClimateCodeQuality = By.xpath("//h3[contains(text(),'Code Climate')]");
  public By buddyCI = By.xpath("//h3[contains(text(),'Buddy')]");
  public By sentryMonitoring = By.xpath("//h3[contains(text(),'Sentry')]");
  public By stalePM = By.xpath("//h3[contains(text(),'Stale')]");
  public By footerTerms = By.linkText("Terms");
  public By copyright = By.xpath("//li[contains(text(),'© 2020 GitHub, Inc.')]");
}