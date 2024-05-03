package base;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {
	
	private static TestBase testbase;
	private static WebDriver driver;
	private static Properties prop;
	
	private TestBase() {
		String stbrowser = "chrome";
		
		if (stbrowser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver() ;
			
		}
		else if (stbrowser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
	}
	public static void initDriver() {
		if(testbase == null) {
			testbase = new TestBase();
		}
	}
	public static WebDriver getDriver()
	{
		return driver;
	}
	public static void openURL(String url) {
		driver.get(url);
	}
	
	public static void teardown() {
		
		if(driver!=null) {
			driver.quit();
		}
		testbase =null;
	}

}
