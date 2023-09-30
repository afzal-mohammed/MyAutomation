package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFileUploadPage {
	WebDriver driver;
	
	public LearnFileUploadPage() {
		System.out.println("Inside constructor");
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
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
