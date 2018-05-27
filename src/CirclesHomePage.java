import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CirclesHomePage extends PageObject {

	@FindBy(xpath=("//a[text()='Sign up']"))
	private WebElement sign_up;
	
	@FindBy(xpath=("//span[text()='SIGN IN']"))
	private WebElement sign_in;

	@FindBy(xpath=("//input[@name='email']"))
	private WebElement email;

	@FindBy(xpath=("//input[@name='password']"))
	private WebElement pass;
	
	@FindBy(xpath=("//button[text()='Sign In']"))
	private WebElement login_button;

	public CirclesHomePage(WebDriver driver) {
		super(driver);
	}
	
	public void clickSignup() {
		this.sign_up.click();
	}
	
	public void clickSignIn() {
		this.sign_in.click();
	}

	/*public boolean isInitialized() {
		return firstName.isDisplayed();
	}*/
	
	public void enterLoginCredentials(String email, String password){
		this.email.clear();
		this.email.sendKeys(email);

		this.pass.clear();
		this.pass.sendKeys(password);
	}

	
	public void submit(){
		login_button.click();
		
	}


}
