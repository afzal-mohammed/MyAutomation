package stepDefinition;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.LearnAlertPage;

public class LearnAlertStep {

	LearnAlertPage alertPage = new LearnAlertPage();
	
	@When("I click on show alert button")
	public void i_click_on_show_alert_button() {
		alertPage.clickOnAlertButton();
	}

	@Then("I should be able to read alert content")
	public void i_should_be_able_to_read_alert_content() {
		String result = alertPage.readTextContents();
		Assert.assertNotNull(result);
	}
}
