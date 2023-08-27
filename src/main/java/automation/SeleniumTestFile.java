package automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTestFile {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"src\\main\\resources\\drivers\\chromedriver.exe");
//		System.setProperty("webdriver.http.factory", "jdk-http-client");
		ChromeDriver driver = new ChromeDriver();
		try {
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			System.out.println("Browser has been launched");
			Thread.sleep(3000);
		}catch(Exception e) {
			//TO:DO
		}finally {
			driver.quit();
		}

	}

}
