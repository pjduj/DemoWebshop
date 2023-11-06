package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopPage {
	public DesktopPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
@FindBy(linkText="Computers")	
private WebElement computerClick;

@FindBy(linkText="Desktops")
private WebElement destopsitem;

@FindBy(linkText="Build your own cheap computer")
private WebElement cheapProduct;

@FindBy(linkText="Build your own computer")
private WebElement owncomputer;


@FindBy(xpath="//input[@value='Add to compare list']")
private WebElement addtoCompareList ;


public WebElement getComputerClick() {
	return computerClick;
}


public WebElement getDestopsitem() {
	return destopsitem;
}


public WebElement getCheapProduct() {
	return cheapProduct;
}


public WebElement getOwncomputer() {
	return owncomputer;
}


public WebElement getAddtoCompareList() {
	return addtoCompareList;
}

//@FindBy(xpath="//input[@value='Remove']")
//private WebElement removebutton;




}
