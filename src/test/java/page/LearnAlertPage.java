package page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LearnAlertPage extends CommonPage {
	WebDriver driver;
	public LearnAlertPage() {
		super();
		driver = CommonPage.driver;
	}
	
	public void clickOnAlertButton() {
			
		WebElement alertButton = driver.findElement(By.id("alert1"));
		alertButton.click();
	}
	
	public String readTextContents() {
		
		Alert alert = driver.switchTo().alert();
		String content = alert.getText();
		alert.accept();
		return content;
	}
	
}
