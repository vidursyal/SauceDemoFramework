package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YourCartPage {
	
	WebDriver driver;
	
	public YourCartPage(WebDriver driver) {
		
		this.driver = driver; 
	}
	
	By bikeLight = By.xpath("//div[normalize-space()='Sauce Labs Bike Light']");
	
	public WebElement bikeLight() {
		return driver.findElement(bikeLight);
	}
	
	By backPack = By.xpath("//div[normalize-space()='Sauce Labs Backpack']");
	
	public WebElement backPack() {
		return driver.findElement(backPack);
	}
	
	By checkout = By.xpath("//button[@id='checkout']");
	
	public WebElement checkout() {
		return driver.findElement(checkout);
	}

}
