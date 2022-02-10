package main;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseClass {
	
	public WebDriver driver;
	public Properties prop ;

	public WebDriver intializebrowser() throws IOException {
		
		prop = new Properties();
		FileInputStream f = new FileInputStream("/Users/vidursyal/eclipse-workspace/SauceDemoFramework/src/main/resources/data.properties");
		prop.load(f);
		String browserName = prop.getProperty("browser");
		String url = prop.getProperty("url");
		
		if(browserName.equals("firefox")) {
			
			//execute in firefox 
			System.setProperty("webdriver.gecko.driver", "/Users/vidursyal/Downloads/Drivers/geckodriver");
			 driver = new FirefoxDriver();
			
		}else if(browserName.equals("safari")) {
			//execute in safari 
			driver = new SafariDriver();
			
		}
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		return driver; 
	}
	

}
