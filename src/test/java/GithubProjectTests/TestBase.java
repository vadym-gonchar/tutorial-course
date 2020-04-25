package GithubProjectTests;

import Helpers.ElementsHelper;
import Locators.ApiManagementLocators;
import Locators.HeaderTabLocators;
import Locators.LogInAndOutPageLocators;
import Locators.MarketplaceLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class TestBase {

  WebDriver driver;

  LogInAndOutPageLocators logInAndOutPageLocators = new LogInAndOutPageLocators();
  HeaderTabLocators headerTabLocators = new HeaderTabLocators();
  MarketplaceLocators marketplaceLocators = new MarketplaceLocators();
  ApiManagementLocators apiManagementLocators = new ApiManagementLocators();
  ElementsHelper elementsHelper;

  @BeforeClass
  public void setUp() {
    driver = new ChromeDriver();
    elementsHelper = new ElementsHelper(driver);
  }

  @AfterClass
  public void tearDown() {
   if (driver !=null)
    driver.quit();
  }
}