package login;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ExcelUtility;
import genericUtilities.ItextListener;
import objectRepository.LoginPage;

@Listeners(ItextListener.class)
public class DWS_Login_01_Test extends BaseClass {
	@Test(dataProvider="data",dataProviderClass=ExcelUtility.class)
	public void Login_to_application_wih_valid_credentials(String email,String password) {
		loginpage.getLoginlink().click();
		logger.log(Status.INFO,"User click on login link");
		loginpage.getEmailTF().sendKeys(email);
		logger.log(Status.INFO,"User enter the email address");
		loginpage.getPasswordTF().sendKeys(password);
		logger.log(Status.INFO,"User entered password");
		loginpage.getLoginButton().click();
		
	}

}
