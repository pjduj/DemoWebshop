package genericUtilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
/**
 * @author ANAND PRASANTHI
 */

public class TaeScreenshot {
	WebDriver driver;
	TakesScreenshot ss;
	public TaeScreenshot(WebDriver driver) {
		this.driver=driver;
		ss=(TakesScreenshot) this.driver;
	}
	/**
	 * this method used to takesScreen shot of the webpage/webelement
	 * @param screenshotName
	 * @return
	 */
	public String capturingScreenshot(String screenshotName) {
		File photo=ss.getScreenshotAs(OutputType.FILE);
		String time=LocalDateTime.now().toString().replace(':','_');
		String directory=System.getProperty("user.dir");
		String path=""+directory+"./target/errorshot/"+screenshotName+" "+time+".png";
		File destination=new File(path);
		try {
			FileUtils.copyFile(photo,destination);
		}catch(IOException e) {
			e.printStackTrace();
		}
		return path;
	}
}
