
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CirclesLifeTest extends BaseSetUp {
	
	String mail_id="naresh.gopalkadiyala@gmail.com";
	@Test
	public void signUp() throws InterruptedException{
		driver.get("https://pages.circles.life/");
		CirclesHomePage signUpPage = new CirclesHomePage(driver);
		signUpPage.clickSignup();
		signUpPage.clickSignIn();
		signUpPage.enterLoginCredentials("naresh.gopalkadiyala@gmail.com", "susu7143");
		signUpPage.submit();
		Thread.sleep(5000);


	}	
	
	@Test(dependsOnMethods= {"signUp"})
	public void email_Verification(){
		AccountVerification  av= new AccountVerification(driver);
		av.account_click();
		Assert.assertEquals(mail_id,av.emailVerification());


	}	
}