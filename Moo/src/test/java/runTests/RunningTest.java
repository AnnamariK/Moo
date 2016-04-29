package runTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import framework.GetBrowser;
import mooPages.CreateUser;

public class RunningTest {
	WebDriver gb;
	
	@BeforeClass
	public void startBrowser() {
		gb = new FirefoxDriver(); //first step to get the browser
	}
	
	@Test
	public void createUserTest() {
		CreateUser cu = new CreateUser(gb); // second step to open the page
		cu.clickIDontHave();
		cu.typeFirstName("Anna");
		cu.typeSecondName("Keskeny");
		cu.typeEmail("konlabos77@gmail.com");
		cu.typePassword("JtE8tRLS");
		cu.typeConfPass("JtE8tRLS");	
	}
	
	@AfterClass
	public void closeBrowser() {
		gb.close();
	}

}
