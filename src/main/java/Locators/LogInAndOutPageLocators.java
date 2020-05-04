package Locators;

import org.openqa.selenium.By;

public class LogInAndOutPageLocators {
  public By loginField = By.name("login");
  public By passwordField = By.name("password");
  public By signInButton = By.name("commit");
  public By dropdown = By.xpath("/html[1]/body[1]/div[1]/header[1]/div[7]/details[1]/summary[1]");
  public By signOutButton = By.xpath("//button[contains(@class,'dropdown-item dropdown-signout')]");
}