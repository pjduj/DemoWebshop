package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JweleryPage {
public JweleryPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	
}
@FindBy(xpath="//a[@href='https://demowebshop.tricentis.com/jewelry?price=0-500]")
private WebElement filterprice;

@FindBy(linkText="Jewelry")
private WebElement jwelery;

public WebElement getJwelery() {
	return jwelery;
}

public WebElement getFilterprice() {
	return filterprice;
}


}
