package locators;

import org.openqa.selenium.By;

public class ExploreLocators {
  public By exploreUrl = By.cssSelector("[aria-label='Global'] [href='/explore']");
  public By exploreTab = By.xpath("//a[contains(text(),'Explore')]");
  public By topics = By.xpath("//a[contains(text(),'Topics')]");
  public By trending = By.xpath("//a[contains(text(),'Trending')]");
  public By collections = By.xpath("//a[contains(text(),'Collections')]");
  public By events = By.xpath("//a[contains(text(),'Events')]");
  public By githubSponsors = By.xpath("//a[contains(text(),'GitHub Sponsors')]");
}