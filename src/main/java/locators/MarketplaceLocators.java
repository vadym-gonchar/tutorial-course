package locators;

import org.openqa.selenium.By;

public class MarketplaceLocators {
  public By searchBox = By.xpath("//input[@placeholder='Search for apps and actions']");
  public By exploreFreeAppsButton = By.xpath("//a[contains(text(),'Explore free apps')]");
  public By extendGitHub = By.xpath("//h1[@class='h00-mktg mb-2 ml-n1 lh-condensed-ultra']");
  public By findTools = By.xpath("//p[@class='lead-mktg mb-4 text-gray lh-condensed']");
  public By introGithub = By.xpath("//h3[contains(text(),'Introducing GitHub Actions')]");
  public By mrktplcAnnouncmnt = By.xpath("//p[@class='MarketplaceAnnouncement-description']");
  public By exploreActionsButton = By.xpath("//a[contains(text(),'Explore Actions')]");
  public By appsTypes = By.xpath("//a[@class='muted-link filter-item py-2 mb-0'][contains(text(),'Apps')]");
  public By types = By.xpath("//h4[@class='text-mono mb-3 text-normal']");
  public By actionsTypes = By.xpath("//a[@class='muted-link filter-item py-2 mb-0']" +
          "[contains(text(),'Actions')]");
  public By chatCategories = By.xpath("//a[@class='muted-link filter-item py-2 mb-0']" +
          "[contains(text(),'Chat')]");
  public By categories = By.xpath("//h4[@class='text-mono mb-3 text-normal mt-6']");
  public By recommended = By.xpath("//h3[contains(text(),'Recommended for you')]");
  public By trending = By.xpath("//h3[contains(text(),'Trending')]");
  public By filters = By.xpath("//h4[@class='text-mono text-normal mt-6'][contains(text(),'Filters')]");
  public By freeFilters = By.xpath(("//details[@class='MarketplaceDetails details-reset']//li[1]//a[1]"));
  public By verifiedVerification = By.xpath("//a[@class='muted-link filter-item py-2 mb-0']" +
          "[contains(text(),'Verified')]");
  public By verification = By.xpath("//h4[@class='text-mono mt-6 mb-3 text-normal']");
  public By yourItems = By.xpath("//h4[@class='text-mono text-normal mt-6'][contains(text(),'Your items')]");
  public By vueggRecentlyAdded = By.xpath("//h3[contains(text(),'vuegg')]");
  public By codeClimateCodeQuality = By.xpath("//h3[contains(text(),'Code Climate')]");
  public By buddyCI = By.xpath("//h3[contains(text(),'Buddy')]");
  public By sentryMonitoring = By.xpath("//h3[contains(text(),'Sentry')]");
  public By stalePM = By.xpath("//h3[contains(text(),'Stale')]");
  public By footerTerms = By.xpath("//a[contains(text(),'Terms')]");
}