package login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ItextListener;

@Listeners(ItextListener.class)
public class Remove_Desktop_Products_06_Test extends BaseClass  {
	@Test
	public void Remove_to_compare() {
		desktop.getComputerClick().click();
		logger.log(Status.INFO,"User click on computer link");
		desktop.getDestopsitem().click();
		logger.log(Status.INFO,"User select desktops");
		desktop.getCheapProduct().click();
		logger.log(Status.INFO,"User click on cheap computer");
	desktop.getAddtoCompareList().click();
	
	driver.navigate().back();
	logger.log(Status.INFO,"User click on back");
	driver.navigate().back();
desktop.getOwncomputer().click();
logger.log(Status.INFO,"User click on owncomputer");
desktop.getAddtoCompareList().click();
List<WebElement> remove=driver.findElements(By.xpath("//input[@value='Remove']"));
for (WebElement element:remove) {
	try {
element.click();
	}
	catch(StaleElementReferenceException e) {
		e.getMessage();		
	}

		
}	}

}
