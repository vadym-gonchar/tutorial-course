package tutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyFirstProgram {
    WebDriver driver;

    @Test(priority = 1)
    public void firstTest() {

        driver = new ChromeDriver();
        mainJob();

        driver = new FirefoxDriver();
        mainJob();

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
        driver.quit();
    }
}