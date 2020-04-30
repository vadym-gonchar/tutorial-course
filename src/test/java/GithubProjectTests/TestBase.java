package GithubProjectTests;

import Helpers.ElementsHelper;
import Locators.ApiManagementLocators;
import Locators.HeaderTabLocators;
import Locators.LogInAndOutPageLocators;
import Locators.MarketplaceLocators;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;


public class TestBase {

  WebDriver driver;

  LogInAndOutPageLocators logInAndOutPageLocators = new LogInAndOutPageLocators();
  HeaderTabLocators headerTabLocators = new HeaderTabLocators();
  MarketplaceLocators marketplaceLocators = new MarketplaceLocators();
  ApiManagementLocators apiManagementLocators = new ApiManagementLocators();
  ElementsHelper elementsHelper;

  @BeforeClass
  @Parameters("browser")

  public void setUp(Browsers browser) {
    switch (browser) {
      case CHROME:
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        break;
      case FIREFOX:
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        break;
      case IE11:
        WebDriverManager.iedriver().setup();
        driver = new InternetExplorerDriver();
        break;
      case EDGE:
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        break;
      default:
        throw new RuntimeException("Invalid specified browser: " + browser + ", expected one of 'CHROME', 'FIREFOX', 'EDGE', 'IE11'");
    }
    driver = new ChromeDriver();
    elementsHelper = new ElementsHelper(driver);
  }

  @AfterClass
  public void tearDown() {
    if (driver != null)
      driver.quit();
  }
}
