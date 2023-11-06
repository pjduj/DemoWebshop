package genericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.BookPage;
import objectRepository.DesktopPage;
import objectRepository.Jewelry_Page;
import objectRepository.JwelAddWishlistPage;
import objectRepository.JweleryPage;
import objectRepository.LoginPage;
import objectRepository.ProductsPage;
import objectRepository.RegisterPage;
/**
 * @author ANAND PRASANTHI
 */
public class BaseClass implements IautoConstants{
	public static WebDriver driver;
	PropertyUtility property;
	public static	TaeScreenshot screenshot;
	public static ExtentTest logger;
    DatabaseUtility dbUtility;
	JavaUtility javaUtility;
	public static WebdriverUtility webdriverUtility;
	public static LoginPage loginpage;
	public static RegisterPage registerpage;
	public static DesktopPage desktop;
	public static BookPage book;
	public static ProductsPage product;
	public static JweleryPage jewel;
	public static Jewelry_Page jewel1;
	public static JwelAddWishlistPage jwel;
	
	
	//	public static TaeScreenshot uti;
	//	@BeforeMethod
	//	public static void demo() {
	//		WebDriverManager.chromedriver().setup();
	//		ChromeOptions options=new ChromeOptions();
	//		options.addArguments("--remote-allow-origins=*");
	//		
	//		 driver=new ChromeDriver(options);
	//		driver.manage().window().maximize();
	//		uti=new TaeScreenshot(driver);
	//}
	/**
	 * this method is used to launch the various browser
	 */
	@BeforeClass(alwaysRun=true)
	public void launchingBrowserAndNavigateToApp() {
		property=new PropertyUtility();
		if(BROWSER.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(options);
		}
		else if(BROWSER.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();

		}
		else {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();

		}

		driver.manage().window().maximize();

		driver.get(property.getDataFromPropertyFile("url"));
		webdriverUtility=new WebdriverUtility(driver);
		screenshot= new TaeScreenshot(driver);
		dbUtility=new DatabaseUtility();
		javaUtility= new JavaUtility();
		
	}
/**
 * this method used to login the application
 * 
 */
	@BeforeMethod(alwaysRun=true)
	public void loginToApplication() {
		loginpage=new LoginPage(driver);
		registerpage=new RegisterPage(driver);
		desktop=new DesktopPage(driver);
		book=new BookPage(driver);
		product=new ProductsPage(driver);
		jewel=new JweleryPage(driver);
		jewel1=new Jewelry_Page(driver);
		jwel=new JwelAddWishlistPage(driver);
		System.out.println("logged into application");
	}
	/**
	 * this method used to logout from application
	 */
	@AfterMethod(alwaysRun=true)

	public void logoutFromApplication() {
		System.out.println("logged out the application");
	}
	/**
	 * this method used to close the browser
	 */
	@AfterClass(alwaysRun=true)
	public void tearDownTheBrowser() {
		driver.quit();
	}
}













