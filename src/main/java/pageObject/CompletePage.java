package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CompletePage {
	WebDriver driver;

	public CompletePage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	By complete = By.xpath("//h2[normalize-space()='THANK YOU FOR YOUR ORDER']");
	
	public WebElement orderPlaced() {
		return driver.findElement(complete);
	}
}
