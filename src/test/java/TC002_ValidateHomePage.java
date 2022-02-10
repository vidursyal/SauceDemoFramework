
import org.testng.annotations.Test;
import org.testng.AssertJUnit;





import java.io.IOException;


import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;




import main.BaseClass;



public class TC002_ValidateHomePage extends BaseClass {
	

	String expectedTitle = "Swag Labs";

	@BeforeMethod

	public void preTest() throws IOException {

		driver = intializebrowser();
		
		// driver.get("https://www.saucedemo.com");

	}

	@Test

	public void TC002() {


		String actualTitle = driver.getTitle();
		

		AssertJUnit.assertEquals(actualTitle, expectedTitle);

	}

	@AfterMethod

	public void after_test() throws InterruptedException {

		
		driver.quit();
	}

	

}
