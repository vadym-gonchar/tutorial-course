package tutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MyFirstProgram {
    public static void main(String[] args) {
        WebDriver driver0 = new ChromeDriver();
        WebDriver driver1 = new FirefoxDriver();
        WebDriver driver2 = new SafariDriver();
        WebDriver driver3 = new OperaDriver();
        WebDriver driver4 = new EdgeDriver();
    }
}
