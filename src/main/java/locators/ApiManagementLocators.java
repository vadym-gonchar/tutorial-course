package locators;

import org.openqa.selenium.By;

public class ApiManagementLocators {
  public By moesif = By.xpath("//h3[contains(text(),'Moesif API Insights')]");
  public By apiMngmnt = By.xpath("//h1[@class='h2']");
  public By searchResults = By.xpath("//span[contains(text(),'Search results')]");
  public By nextButton1 = By.xpath("//a[contains(@class,'btn btn-outline BtnGroup-item')]");
  public By releaseCreator = By.xpath("//h3[contains(text(),'Release Creator with Auto-Tag Generation')]");
  public By setupPantheon = By.xpath("//h3[contains(text(),'Setup Pantheon Terminus')]");
  public By nextButton2 = By.xpath("//a[contains(text(),'Next')]");
  public By uploadToCF = By.xpath("//h3[contains(text(),'Upload to CurseForge')]");
  public By uploadToCFSubheader = By.xpath("//p[contains(text(),'Uploads files to CurseForge via CurseForge API')]");
  public By consumableCode = By.xpath("//h3[contains(text(),'Consumable Code Movie TMDB API')]");
  public By disabledButtonText = By.xpath("//button[@class='btn btn-outline BtnGroup-item']");
  public By previousButton = By.linkText("Previous");
}