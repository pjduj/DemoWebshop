package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
	public ProductsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	
	}
	
	@FindBy(linkText="14.1-inch Laptop")
	private WebElement laptop;
	@FindBy(id="add-to-cart-button-31")
	private WebElement lapaddToCart;
	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement shopcart;
	public WebElement getLaptop() {
		return laptop;
	}
	public WebElement getLapaddToCart() {
		return lapaddToCart;
	}
	public WebElement getShopcart() {
		return shopcart;
	}
	
	}
