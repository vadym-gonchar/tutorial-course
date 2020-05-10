package locators;

import org.openqa.selenium.By;

public class LogInAndOutPageLocators {
  public By loginField = By.name("login");
  public By passwordField = By.name("password");
  public By signInButton = By.name("commit");
  public By dropdown = By.xpath("//summary[contains(@class,'Header-link')]//img[contains(@class,'avatar avatar-user')]");
  public By signOutButton = By.xpath("//button[contains(@class,'dropdown-item dropdown-signout')]");
}