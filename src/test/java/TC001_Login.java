
import org.testng.annotations.Test;
import org.testng.AssertJUnit;





import java.io.IOException;


import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.DataProvider;


import main.BaseClass;
import pageObject.LoginPage;

public class TC001_Login extends BaseClass {

	String expectedUrl = "https://www.saucedemo.com/inventory.html";

	@BeforeMethod

	public void preTest() throws IOException {

		driver = intializebrowser();
		
		// driver.get("https://www.saucedemo.com");

	}

	@Test(dataProvider = "getData")

	public void TC001(String username, String password) throws IOException {

		LoginPage lp = new LoginPage(driver);

		lp.username().sendKeys(username);

		lp.password().sendKeys(password);

		lp.login().click();

		String actualUrl = driver.getCurrentUrl();

		AssertJUnit.assertEquals(actualUrl, expectedUrl);

	}

	@AfterMethod

	public void after_test() throws InterruptedException {

		
		driver.quit();
	}

	@DataProvider

	public Object[][] getData() {

		Object data[][] = new Object[4][2];

		data[0][0] = "xyz";
		data[0][1] = "xyz";
		data[1][0] = "standard_user";
		data[1][1] = "secret_sauce";
		data[2][0] = "xyz";
		data[2][1] = "xyz";
		data[3][0] = "standasdsdrd_user";
		data[3][1] = "secrsddet_sauce";

		return data;
	}

}
