package tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import Objects.DasboardPage;
import Objects.LoginPage;

public class End2EndTest extends TestBase {

	LoginPage loginObj;
	DasboardPage dashObj;

	@Test(priority = 0)

	public void Test_valid_login() {

		loginObj = new LoginPage(driver);
		dashObj = new DasboardPage(driver);
		loginObj.emails("store@admin.com");
		loginObj.password("P@ssw0rd");
		loginObj.loginButton();
		Assert.assertEquals("My Dashboard", dashObj.VerfiyDashoardPage());

	}

	@Test(priority = 1)

	public void PrintTitleOfDashoardPage() {

		String j = driver.getTitle();

		System.out.println("Your page title Is : " + j);

	}

	@Test(priority = 2)

	public void Test_valid_logout() {

		dashObj = new DasboardPage(driver);

		dashObj.logOut();

		Assert.assertEquals("Admin | Login", driver.getTitle());
		System.out.println(" LoginPage is displayed – Assert passed");

	}

	@Test(priority = 3)
	public void tearDown() {
		driver.quit();
	}
}
