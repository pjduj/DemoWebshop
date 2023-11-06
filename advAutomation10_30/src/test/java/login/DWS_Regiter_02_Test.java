package login;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ItextListener;
@Listeners(ItextListener.class)
public class DWS_Regiter_02_Test extends BaseClass {
	@Test

	public void regiter_to_application_with_valid_credentials() {
		registerpage.getRegisterlink().click();
		logger.log(Status.INFO,"User click on register link");
		registerpage.getFirstNameTF().sendKeys("Prasanthi");
		logger.log(Status.INFO,"User should enter firstname");
		registerpage.getLastNameTF().sendKeys("Anand");
		logger.log(Status.INFO,"User should enter lastname");
		registerpage.getEmailTF().sendKeys("eprashanthi1071991@gmail.com");
		logger.log(Status.INFO,"User should enter valid id");
		registerpage.getPasswordTF().sendKeys("Bubloo@143");
		logger.log(Status.INFO,"user should enter password");
		registerpage.getConformpasswordTF().sendKeys("Bubloo@143");
		logger.log(Status.INFO,"user should reconfirm th password");
		registerpage.getRegisterButton().click();
		logger.log(Status.INFO,"user should click on register button");



	}

}
