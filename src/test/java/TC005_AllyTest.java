
import org.testng.annotations.Test;
import java.io.IOException;



import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import com.deque.html.axecore.results.Results;
import com.deque.html.axecore.results.Rule;
import com.deque.html.axecore.selenium.AxeBuilder;


import main.BaseClass;


public class TC005_AllyTest extends BaseClass {
	WebDriver driver;
	
	@BeforeMethod

	public void preTest() throws IOException {

		driver = intializebrowser();

		// driver.get("https://www.saucedemo.com");

	}
	

	@Test
	public void TC005_AlleyTest() {
		
		
		
		AxeBuilder builder = new AxeBuilder();
		Results results = builder.analyze(driver);
		java.util.List<Rule> violations = results.getViolations();
		
		System.out.println(violations);
		
		
	}

	@AfterMethod

	public void after_test() throws InterruptedException {

		driver.quit();
	}
}
