package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public WebDriver driver; 

	public HomePage (WebDriver driver) {
		
		this.driver= driver;
	}
	
	By addBackpack = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	
	public WebElement addBakcpack() {
		
		return driver.findElement(addBackpack);

	}
	
	By addBikeLight = By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']");
	
	public WebElement addBikeLight() {
		
		return driver.findElement(addBikeLight);
	}
	
	By clickOnCart = By.xpath("//a[@class='shopping_cart_link']");

	public WebElement clickOnCart() {
		return driver.findElement(clickOnCart);
	}
}