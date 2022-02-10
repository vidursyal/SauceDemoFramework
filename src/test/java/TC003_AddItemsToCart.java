import org.testng.annotations.Test;
import org.testng.AssertJUnit;



import java.io.IOException;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;


import main.BaseClass;
import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.YourCartPage;

public class TC003_AddItemsToCart extends BaseClass {

	@BeforeMethod

	public void preTest() throws IOException {

		driver = intializebrowser();
		
		// driver.get("https://www.saucedemo.com");

	}

	@Test(dataProvider = "getData")

	public void TC001(String username, String password) throws IOException, InterruptedException {

		LoginPage lp = new LoginPage(driver);

		lp.username().sendKeys(username);
		
		Thread.sleep(5000);

		lp.password().sendKeys(password);
		
		Thread.sleep(5000);

		lp.login().click();
		
		HomePage hp = new HomePage(driver);
		
		hp.addBakcpack().click();
		hp.addBikeLight().click();
		hp.clickOnCart().click();
		
		YourCartPage cp = new YourCartPage(driver);
		
		Boolean backPack = cp.backPack().isDisplayed();
		Boolean bikeLight = cp.bikeLight().isDisplayed();
		
		System.out.println(backPack);
		System.out.println(bikeLight);
		
		AssertJUnit.assertEquals(backPack,bikeLight);
		
		

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
