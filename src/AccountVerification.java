import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountVerification extends PageObject {

	@FindBy(xpath = ("//div[text()='MY ACCOUNT']"))
	private WebElement my_account;
	
	@FindBy(xpath =("//label[text()='Email']//following::input"))
	private WebElement verify_mail;
	
	public AccountVerification(WebDriver driver) {
		super(driver);
	}

	public void account_click() {
		my_account.click();
	}

	public String emailVerification(){
		return verify_mail.getAttribute("value");
		
		
	}

}