package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFileUploadPage extends CommonPage{
	WebDriver driver;
	public LearnFileUploadPage() {
		super(true);
		driver = CommonPage.driver;
	}
	
	public void launchURL() throws InterruptedException {
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(5000);
	}
	
	public void uploadFile() {
		WebElement chooseFileButton = driver.findElement(By.name("anyfile"));
	    chooseFileButton.sendKeys("C:\\Users\\Admin\\Documents\\Slide information for GMO.docx");
	}
	
	
	public boolean verifyFileUploaded() {
		WebElement displayFileName = driver.findElement(By.name("anyfile"));
		return displayFileName.isDisplayed();
	}
}
