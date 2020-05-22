package githubTests;

import helpers.Browsers;
import helpers.ElementsHelper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Parameters;

public class TestBase {

  WebDriver driver;

  ElementsHelper elementsHelper;

  @BeforeGroups(groups = {"uitest"})
  @Parameters("browser")
  public void setUp(Browsers browser) {
    switch (browser) {
      case CHROME:
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--dns-prefetch-disable");
        options.setCapability("enableVNC", true);
        options.setCapability("enableVideo", false);
        options.setAcceptInsecureCerts(true);
        options.setCapability("sessionTimeout", "10m");
        options.setCapability("screenResolution", "1440x900x24");
        options.setCapability("timeZone", "America/New_York");
        options.setPageLoadStrategy(PageLoadStrategy.NONE);

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
      case OPERA:
        WebDriverManager.operadriver().setup();
        driver = new OperaDriver();
        break;
      default:
        throw new RuntimeException("Invalid specified browser: " +
                browser + ", expected one of 'CHROME', 'FIREFOX', 'EDGE', 'IE11', 'OPERA'");
    }
    elementsHelper = new ElementsHelper(driver);
  }

  @AfterGroups(groups = {"uitest"})
  public void tearDown() {
    if (driver != null)
      driver.quit();
  }
}