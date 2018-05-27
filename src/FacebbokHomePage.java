import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class FacebbokHomePage extends PageObject{
	
	@FindBy(xpath=("//a[text()='Home']"))
	private WebElement fb_home;
	
	@FindBy(xpath=("//div[@class='_fmk UFICommentAttachmentButtons _5op2 _15i7 _2kwm']/preceding-sibling::div[@role='presentation' and @class='_2xwx _289c']"))
	private WebElement fb_comment;

	@FindBy(xpath=("//span[@class='UFICommentBody']"))
	private WebElement fb_verify_comment;


	public FacebbokHomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void clickHome() {
		this.fb_home.click();
	}
	public void addcomment()
	{
		
		JavascriptExecutor je =(JavascriptExecutor)driver;
		je.executeScript("arguments[0].scrollIntoView(true)",fb_comment );
		System.out.println(fb_comment.getText());
		fb_comment.click();
		fb_comment.sendKeys("my first test");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER);
		
	}
	
	public String verifycomment()
	{
	  return fb_verify_comment.getText();
		
	}



	
}
