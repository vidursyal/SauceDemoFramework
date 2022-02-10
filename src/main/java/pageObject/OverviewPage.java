package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OverviewPage {

	WebDriver driver;

	public OverviewPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	By finish = By.xpath("//button[@id='finish']");
	
	public WebElement finshButton() {
		return driver.findElement(finish);
	}

}
