package locators;

import org.openqa.selenium.By;

public class DeploymentLocators {
  public By searchField = By.xpath("//input[@placeholder='Search for apps and actions']");
  public By elementsWrapper = By.cssSelector("[class='d-md-flex flex-wrap mb-4'] a h3");
}