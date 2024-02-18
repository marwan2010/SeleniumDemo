package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PagesBase {
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "mat-input-0")
	WebElement email;

	@FindBy(id = "mat-input-1")
	WebElement pswd;
	@FindBy(xpath = "//button[@class='block primary']")
	WebElement btnlogin;

	@FindBy(xpath = "//a[@href='/admin/dashboard']") 
	WebElement p;

	@FindBy(xpath = "//div[@class='user']")
	WebElement user;

	@FindBy(xpath = "/html/body/app-root/admin-layout/section/div[1]/header/section/navbar/div/div[2]/nav-actions/div/ul/li[3]/div/div[2]/ul")
	WebElement uldrop;

	@FindBy(xpath = "/html/body/app-root/admin-layout/section/div[1]/header/section/navbar/div/div[2]/nav-actions/div/ul/li[3]/div/div[2]/ul/li[3]")
	WebElement logout;

	public void emails(String value)

	{

		setTextElementText(email, value);
	}

	public void password(String value)

	{

		setTextElementText(pswd, value);
	}

	public void loginButton()

	{

		clickButton(btnlogin);

	}

}
