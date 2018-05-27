import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookLoginPage extends PageObject {
	
	@FindBy(id=("email"))
	private WebElement fb_email;
	
	@FindBy(id=("pass"))
	private WebElement fb_pass;
	
	@FindBy(id=("loginbutton"))
	private WebElement fb_login;
	
	
	public FacebookLoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void enterLoginCredentials(String email, String password){
		this.fb_email.clear();
		this.fb_email.sendKeys(email);

		this.fb_pass.clear();
		this.fb_pass.sendKeys(password);
	}

	
	public void submit(){
		fb_login.click();
		
	}


}
