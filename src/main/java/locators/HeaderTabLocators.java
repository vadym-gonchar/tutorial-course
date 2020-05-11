package locators;

import org.openqa.selenium.By;

public class HeaderTabLocators {
  public By pullRequests = By.xpath("//a[contains(text(),'Pull requests')]");
  public By issues = By.xpath("//a[contains(text(),'Issues')]");
  public By marketplace = By.cssSelector("[aria-label='Global'] [href='/marketplace']");
  public By explore = By.xpath("//a[contains(.,'Explore')]");
}