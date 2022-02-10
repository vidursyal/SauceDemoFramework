package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}

	By username = By.xpath("//*[@id='user-name']");

	public WebElement username() {

		return driver.findElement(username);
	}

	By password = By.xpath("//*[@id='password']");

	public WebElement password() {

		return driver.findElement(password);
	}

	By login = By.xpath("//*[@id='login-button']");

	public WebElement login() {

		return driver.findElement(login);
	}

}
