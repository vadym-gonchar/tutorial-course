package course;

import org.openqa.selenium.By;

public class MarketplaceLocators {
  public By exploreFreeAppsButton = By.linkText("Explore free apps");
  public By exploreActionsButton = By.linkText("Explore Actions");
  public By appsTypes = By.linkText("Apps");
  public By actionsTypes = By.linkText(("Actions"));
  public By chatCategories = By.linkText(("Chat"));
  public By codeInspectorTrending = By.xpath("//h3[contains(text(),'Code Inspector')]");
  public By svg = By.xpath("//h4[@class='text-mono text-normal mt-6'][contains(text(),'Filters')]//*[local-name()='svg']");
  public By freeFilters = By.linkText(("Free"));
  public By verifiedVerification = By.linkText(("Verified"));
  public By vueggRecentlyAdded = By.xpath("//h3[contains(text(),'vuegg')]");
  public By codeClimateCodeQuality = By.xpath("//h3[contains(text(),'Code Climate')]");
  public By buddyCI = By.xpath("//h3[contains(text(),'Buddy')]");
  public By sentryMonitoring = By.xpath("//h3[contains(text(),'Sentry')]");
  public By stalePM = By.xpath("//h3[contains(text(),'Stale')]");
  public By footerTerms = By.linkText("Terms");
}