package stepDefinition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class myntraStep {

	WebDriver driver;

	@Given("user launches myntra site")
	public void user_launches_myntra_site() {
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		driver = new ChromeDriver();
		driver.get("https://myntra.com");
	}

	@When("user clicks on women menu option")
	public void user_clicks_on_women_menu_option() {
		WebElement womenOption = driver.findElement(By.linkText("Women"));
		womenOption.click();
	}

	@Then("user should be navigated to womens page")
	public void user_should_be_navigated_to_womens_page() {
		String title = driver.getTitle();
		assertTrue(title.contains("Women"));
		driver.quit();
	}

	@When("user clicks on men menu option")
	public void user_clicks_on_men_menu_option() {
		WebElement menMenu = driver.findElement(By.linkText("Men"));
		menMenu.click();

	}

	@Then("user should be navigated to mens page")
	public void user_should_be_navigated_to_mens_page() {
		String title = driver.getTitle();
		assertTrue(title.contains("Men"));
		driver.quit();

	}
}
