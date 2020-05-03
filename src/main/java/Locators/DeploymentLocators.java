package Locators;

import org.openqa.selenium.By;

public class DeploymentLocators {
  public By searchField = By.xpath("//input[@placeholder='Search for apps and actions']");
  public By semaphore = By.xpath("//h3[contains(text(),'Semaphore')]");
  public By cloud66 = By.xpath("//h3[contains(text(),'Cloud 66 for Rails')]");
  public By triggerMesh = By.xpath("//h3[contains(text(),'TriggerMesh')]");
  public By decentralInet = By.xpath("//h3[contains(text(),'Decentralized Internet')]");
  public By swiftPackage = By.xpath("//h3[contains(text(),'Swift Package Registry')]");
}