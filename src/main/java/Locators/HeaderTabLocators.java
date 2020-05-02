package Locators;

import org.openqa.selenium.By;

public class HeaderTabLocators {

  public By pullRequests = By.xpath("//a[contains(text(),'Pull requests')]");
  public By issues = By.linkText("Issues");
  public By marketplace = By.linkText("Marketplace");
  public By explore = By.xpath("//a[contains(.,'Explore')]");
}