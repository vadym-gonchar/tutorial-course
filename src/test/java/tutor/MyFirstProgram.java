package tutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstProgram {
    WebDriver driver;

    @Test(priority = 1)
    public void firstTest() {

        driver = new ChromeDriver();
        mainJob();

        /*driver = new FirefoxDriver();
        mainJob();*/

        /*driver = new EdgeDriver();
        mainJob();*/

        /*driver = new InternetExplorerDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        mainJob();*/
    }

    public void mainJob() {
        driver.get("https://github.com/login");
        driver.manage().window().fullscreen();
        driver.findElement(By.name("login")).sendKeys("aqa-tutoring");
        driver.findElement(By.name("password")).sendKeys("aqatest123");
        driver.findElement(By.name("commit")).click();

        boolean isPullRequestsPresent = driver.findElement(By.xpath("//a[2]")).isDisplayed();
        Assert.assertTrue(isPullRequestsPresent);
        boolean isIssuesPresent = driver.findElement(By.linkText("Issues")).isDisplayed();
        Assert.assertTrue(isIssuesPresent);
        boolean isMarketplacePresent = driver.findElement(By.linkText("Marketplace")).isDisplayed();
        Assert.assertTrue(isMarketplacePresent);
        boolean isExplorePresent = driver.findElement(By.xpath("//a[contains(.,'Explore')]")).isDisplayed();
        Assert.assertTrue(isExplorePresent);

        driver.get("https://github.com/marketplace");

        boolean isExploreFreeAppsButtonPresent = driver.findElement(By.linkText("Explore free apps")).isDisplayed();
        Assert.assertTrue(isExploreFreeAppsButtonPresent);

        boolean isAppsTypePresent = driver.findElement(By.linkText("Apps")).isDisplayed();
        Assert.assertTrue(isAppsTypePresent);
    }
}