package mooPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CreateUser {
	
	private String URL = "https://www.moo.com/uk/account/signin.php";
	
	WebDriver gb; //an empty variable, which will be populated from the constructor
	private String title = "Sign in | MOO (United Kingdom)";
	
	@FindBy (css="label[data-webdriver-automation-id='signup-option']") private WebElement singUp;
	@FindBy (css="input[id='txtFirstName']") private WebElement firstName;
	@FindBy (css="input[id='txtLastName']") private WebElement secondName;
	@FindBy (id="txtEmailSignUp") private WebElement email;
	@FindBy (id="txtPasswordSignUp") private WebElement password;
	@FindBy (id="txtPassword2SignUp") private WebElement confPass;
	
	public CreateUser(WebDriver gb) { //constractor
		this.gb = gb; //populating the value for the browser
		gb.get(URL); //call the get method to pen the URL
		PageFactory.initElements(gb, this);
		gb.getTitle().equals(title); //need to check the title if correct
		Assert.assertTrue(gb.getTitle().equals(title), "The title is incorrect");
	}

	public void clickIDontHave() {
		singUp.click();	
	}

	public void typeFirstName(String value) {
		firstName.sendKeys(value);	
	}

	public void typeSecondName(String value) {
		secondName.sendKeys(value);	
	}

	public void typeEmail(String value) {
		email.sendKeys(value);	
	}
	
	public void typePassword(String value) {
		password.sendKeys(value);	
	}

	public void typeConfPass(String value) {
		confPass.sendKeys(value);	
	}

}
