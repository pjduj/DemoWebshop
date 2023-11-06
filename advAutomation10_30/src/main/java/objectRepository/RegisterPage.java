package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver,this);	
	}
	@FindBy(linkText="Register")
	private WebElement Registerlink;

	@FindBy(id="FirstName")
	private WebElement FirstNameTF;

	@FindBy(id="LastName")
	private WebElement LastNameTF;

	@FindBy(id="Email")
	private WebElement emailTF;

	@FindBy(id="Password")
	private WebElement passwordTF;

	@FindBy(id="ConfirmPassword")
	private WebElement conformpasswordTF;

	@FindBy(xpath="//input[@value='Register']")
	private WebElement registerButton;

	public WebElement getRegisterlink() {
		return Registerlink;
	}

	public WebElement getFirstNameTF() {
		return FirstNameTF;
	}

	public WebElement getLastNameTF() {
		return LastNameTF;
	}

	public WebElement getEmailTF() {
		return emailTF;
	}

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getConformpasswordTF() {
		return conformpasswordTF;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}

}
