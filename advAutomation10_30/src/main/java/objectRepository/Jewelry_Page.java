package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jewelry_Page {
public Jewelry_Page(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
@FindBy(xpath="//a[@href='https://demowebshop.tricentis.com/jewelry?price=0-500]")
private WebElement filterprice;

@FindBy(linkText="Black & White Diamond Heart")
private WebElement diamondJwel;

public WebElement getFilterprice() {
	return filterprice;
}

public WebElement getDiamondJwel() {
	return diamondJwel;
}

public WebElement getAddtowishlist() {
	return addtowishlist;
}
@FindBy(id="add-to-wishlist-button-14")
private WebElement addtowishlist;






}
