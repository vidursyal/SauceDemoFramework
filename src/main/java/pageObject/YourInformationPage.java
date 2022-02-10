package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YourInformationPage {

	WebDriver driver;

	public YourInformationPage(WebDriver driver) {

		this.driver = driver;
	}

	By firstName = By.xpath("//input[@id='first-name']");

	public WebElement firstName() {
		return driver.findElement(firstName);
	}

	By lastName = By.xpath("//input[@id='last-name']");

	public WebElement lastName() {
		return driver.findElement(lastName);
	}

	By postalCode = By.xpath("//input[@id='postal-code']");

	public WebElement postalCode() {
		return driver.findElement(postalCode);
	}

	By continuebutton = By.xpath("//input[@id='continue']");

	public WebElement continuebutton() {
		return driver.findElement(continuebutton);
	}
}
