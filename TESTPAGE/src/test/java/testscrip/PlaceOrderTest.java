package testscrip;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import page.LoginPage;

public class PlaceOrderTest {
	WebDriver driver;
	LoginPage loginPage;
	
	public PlaceOrderTest() {
		TestBase.initDriver();
		driver = TestBase.getDriver();
		loginPage = new LoginPage(driver);
	}
	@BeforeMethod
	public void Website() {
		  
		  TestBase.openURL("https://www.saucedemo.com/");
	  }
  @Test
  public void Login() {
	  
	  loginPage.login("problem_user","secret_sauce");
  }
}
