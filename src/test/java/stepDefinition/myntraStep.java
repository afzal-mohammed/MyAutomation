package stepDefinition;

import static org.junit.Assert.assertTrue;

import java.text.spi.DecimalFormatSymbolsProvider;

import org.hamcrest.core.StringContains;
import org.openqa.selenium.Alert;
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
		driver.manage().window().maximize();
		driver.get("https://myntra.com");
	}

	@When("user clicks on women menu option")
	public void user_clicks_on_women_menu_option() {
		WebElement womenOption = driver.findElement(By.linkText("Women"));
		womenOption.click();
	}
	
	@When("clicks on {string} menu")
	public void clickOption(String option) throws InterruptedException {
		WebElement optionElement = driver.findElement(By.linkText(option));
		optionElement.click();
		Thread.sleep(5000);
	}
	
	@Then("user should be navigated to womens page")
	public void user_should_be_navigated_to_womens_page() {
		String title = driver.getTitle();
		assertTrue(title.contains("Women"));
		driver.quit();
	}
	
	@Then("I should be navigated to {string} page")
	public void i_should_be_navigated_to_page(String expectedTitle) {
		String title = driver.getTitle();
		assertTrue(title.contains(expectedTitle));
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

	@When("user clicks on wishlist option")
	public void user_clicks_on_wishlist_option() {
		WebElement wishListOption = driver
				.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[2]/a[1]/span[1]"));
		wishListOption.click();
	}

	@Then("user should be navigated to wishlist page")
	public void user_should_be_navigated_to_wishlist_page() {

		String title = driver.getTitle();
		assertTrue(title.contains("Wishlist"));
		driver.quit();

	}

	@When("user enters watches in search bar")
	public void user_enters_watches_in_search_bar() {
		WebElement searchBar = driver.findElement(By.className("desktop-searchBar"));
		searchBar.sendKeys("watches");

	}

	@When("user clicks on search button")
	public void user_clicks_on_search_button() {
		WebElement clickSearch = driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/a/span"));
		clickSearch.click();

	}

	@Then("watches page should be displayed")
	public void watches_page_should_be_displayed() {

		String title = driver.getTitle();
		assertTrue(title.contains("Watches"));
		driver.quit();
	}

	@When("user clicks on kids option")
	public void user_clicks_on_kids_option() {
		WebElement kidsOption = driver.findElement(By.linkText("Kids"));
		kidsOption.click();

	}

	@Then("kids page should be displayed")
	public void kids_page_should_be_displayed() {
		String title = driver.getTitle();
		assertTrue(title.contains("Kids"));
		driver.quit();

	}

	@When("user clicks on home & living option")
	public void user_clicks_on_home_living_option() {

		WebElement homeAndLivingMenu = driver.findElement(By.linkText("Home & Living"));
		homeAndLivingMenu.click();

	}

	@Then("home & living page should be displayed")
	public void home_living_page_should_be_displayed() {

		String title = driver.getTitle();
		assertTrue(title.contains("Living"));
		driver.quit();

	}

	@When("user clicks on beauty option")
	public void user_clicks_on_beauty_option() {

		WebElement beautyMenu = driver.findElement(By.linkText("Beauty"));
		beautyMenu.click();

	}

	@Then("beauty page should be displayed")
	public void beauty_page_should_be_displayed() {

		String title = driver.getTitle();
		assertTrue(title.contains("Personal"));
		driver.quit();

	}

}
