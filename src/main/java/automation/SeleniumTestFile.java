package automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTestFile {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Users\\abc\\git\\MyAutomation\\src\\main\\resources\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.quit();

	}

}
