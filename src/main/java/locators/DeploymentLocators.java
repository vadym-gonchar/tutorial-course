package locators;

import org.openqa.selenium.By;

public class DeploymentLocators {
  public By deploymentUrl = By.xpath("//a[@class='muted-link filter-item py-2 mb-0']" +
          "[contains(text(),'Deployment')]");
  public By searchField = By.xpath("//input[@placeholder='Search for apps and actions']");
  public By elementsWrapper = By.cssSelector("[class='d-md-flex flex-wrap mb-4'] a h3");
  public By deployToCleverCloud = By.xpath("//h3[contains(text(),'Deploy to Clever Cloud')]");
  public By screepsDeployer = By.xpath("//h3[contains(text(),'Screeps Deployer')]");
  public By setupCDtools = By.xpath("//h3[contains(text(),'Setup CD tools')]");
}