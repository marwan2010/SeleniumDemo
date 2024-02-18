package Objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DasboardPage extends PagesBase {
	public DasboardPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[@href='/admin/dashboard']")
	WebElement p;

	@FindBy(xpath = "//div[@class='user']")
	WebElement user;

	@FindBy(xpath = "/html/body/app-root/admin-layout/section/div[1]/header/section/navbar/div/div[2]/nav-actions/div/ul/li[3]/div/div[2]/ul")
	WebElement uldrop;

	@FindBy(xpath = "/html/body/app-root/admin-layout/section/div[1]/header/section/navbar/div/div[2]/nav-actions/div/ul/li[3]/div/div[2]/ul/li[3]")
	WebElement logout;

	public String VerfiyDashoardPage() {

		String j = p.getText();
		return j;
	}

	public void logOut()

	{

		clickButton(user);

		List<WebElement> MenuList = uldrop.findElements(By.tagName("li"));
		for (WebElement li : MenuList) {
			if (li.getText().equals("Logout")) {
				li.click();
			}
		}

	}

}
