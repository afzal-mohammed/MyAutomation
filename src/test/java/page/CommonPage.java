package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonPage {
	static WebDriver driver;
	int x;
			
	public CommonPage(){		
		this(false); //CommonPage(boolean launch)
	}
	
	public CommonPage(boolean launch) {
		if(launch) {
			System.out.println("Inside constructor");
			System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");
			System.setProperty("webdriver.http.factory", "jdk-http-client");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
	}
	
	public void closeBrowser() {
		driver.quit();
	}
}
