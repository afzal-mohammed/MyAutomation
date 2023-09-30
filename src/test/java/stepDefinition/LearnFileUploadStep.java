package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import page.LearnFileUploadPage;


public class LearnFileUploadStep {

	LearnFileUploadPage alertPage = new LearnFileUploadPage();
	
	@Given("I launch omayo website")
	public void i_launch_omayo_website() throws InterruptedException {
		alertPage.launchURL();
	}

	@When("I click on Choose file button and upload a file")
	public void i_click_on_choose_file_button() {
		alertPage.uploadFile();
	}


	@Then("my file should be uploaded")
	public void my_file_should_be_uploaded() {
	    Assert.assertTrue(alertPage.verifyFileUploaded());
	}
}
