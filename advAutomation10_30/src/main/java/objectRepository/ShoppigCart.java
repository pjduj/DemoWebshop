package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppigCart {
	public ShoppigCart(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
@FindBy(xpath="//span[text()='shopping cart']")
private WebElement shoppingcartbutton;
public WebElement getShoppingcartbutton() {
	return shoppingcartbutton;
}

}
