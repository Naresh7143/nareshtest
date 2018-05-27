import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;




public class BaseSetUp {

	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public static void tearDown(){
		driver.manage().deleteAllCookies();
		driver.close();
	}	
}