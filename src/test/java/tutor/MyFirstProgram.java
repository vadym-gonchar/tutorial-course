package tutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyFirstProgram {
    WebDriver driver;

    @Test(priority = 1)
    public void firstTest() {
        driver = new ChromeDriver();
        driver.get("https://github.com/login");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("[id='login_field']")).sendKeys("vadym-gonchar");

        driver.quit();
    }
}