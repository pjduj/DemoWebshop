package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookPage {
public  BookPage(WebDriver driver) {
	PageFactory.initElements(driver,this);

}
@FindBy(linkText="Books")
private WebElement book;

@FindBy(linkText="Fiction")
private WebElement ficbook;

@FindBy(id="add-to-cart-button-45")
private WebElement ficcart;

public WebElement getBook() {
	return book;
}

public WebElement getFicbook() {
	return ficbook;
}

public WebElement getFiccart() {
	return ficcart;
}

}
