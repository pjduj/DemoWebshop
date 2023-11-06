package login;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ItextListener;
@Listeners(ItextListener.class)

public class DWS_ProducttoCart_03_Test extends BaseClass {
	@Test(groups="IT")
	public void add_products_to_cart() {
		product.getLaptop().click();
		logger.log(Status.INFO,"User click on laptop link");
		product.getLapaddToCart();
		logger.log(Status.INFO,"User able to add cart");
		product.getShopcart().click();
	}

}
