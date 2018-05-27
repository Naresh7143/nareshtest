import org.testng.Assert;
import org.testng.annotations.Test;

public class FacebookTest extends BaseSetUp {
	String my_comment ="my first test";
	@Test (priority=1)
	public void signUp()
	{
		driver.get("https://www.facebook.com/");
		
		FacebookLoginPage fb= new FacebookLoginPage(driver);
		fb.enterLoginCredentials("usert7091@gmail.com", "Abc@12345");
		fb.submit();
	}
	
	@Test (priority=2)
	public void postcomments()
	{
		
		FacebbokHomePage fh= new FacebbokHomePage(driver);
	    fh.clickHome();
	    fh.addcomment();
	    fh.verifycomment();
	    Assert.assertEquals(my_comment, fh.verifycomment());
	}


}
