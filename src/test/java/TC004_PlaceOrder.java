import org.testng.annotations.Test;
import org.testng.AssertJUnit;



import java.io.IOException;

import org.openqa.selenium.WebDriver;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;


import main.BaseClass;
import pageObject.CompletePage;
import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.OverviewPage;
import pageObject.YourCartPage;
import pageObject.YourInformationPage;

public class TC004_PlaceOrder extends BaseClass {

	WebDriver driver;
	String expectedMessage = "THANK YOU FOR YOUR ORDER";
	

	@BeforeMethod

	public void preTest() throws IOException {

		driver = intializebrowser();

		// driver.get("https://www.saucedemo.com");

	}

	@Test(dataProvider = "getData")

	public void TC004(String username, String password) throws IOException, InterruptedException {

		LoginPage lp = new LoginPage(driver);

		lp.username().sendKeys(username);
		
		lp.password().sendKeys(password);
		
		lp.login().click();

		HomePage hp = new HomePage(driver);

		hp.addBakcpack().click();
		
		hp.addBikeLight().click();
		
		hp.clickOnCart().click();

		YourCartPage cp = new YourCartPage(driver);

		cp.checkout().click();
		
		YourInformationPage ip = new YourInformationPage(driver);
		
		ip.firstName().sendKeys("ok");
		ip.lastName().sendKeys("ok");
		ip.postalCode().sendKeys("123");
		ip.continuebutton().click();
		
		OverviewPage op = new OverviewPage(driver);
		
		op.finshButton().click();
		
		CompletePage cp1 = new CompletePage(driver);
		
		String orderPlaced = cp1.orderPlaced().getText();
		
		AssertJUnit.assertEquals(orderPlaced, expectedMessage);
		
		

	}

	@AfterMethod

	public void after_test() throws InterruptedException {

		driver.quit();
	}

	@DataProvider

	public Object[][] getData() {

		Object data[][] = new Object[1][2];

		data[0][0] = "standard_user";
		
		data[0][1] = "secret_sauce";

		return data;
	}

}
