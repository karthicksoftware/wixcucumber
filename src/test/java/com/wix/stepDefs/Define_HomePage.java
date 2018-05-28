package com.wix.stepDefs;

import com.wix.steps.HomePageSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Define_HomePage {

	HomePageSteps homePageSteps = new HomePageSteps();

	@Given("^the browser is successfully launched$")
	public void the_browser_is_successfully_launched() throws Throwable {
		homePageSteps.open_browser();
	}

	@When("^the user lands on the homepage$")
	public void the_user_lands_on_the_homepage() throws Throwable {
		homePageSteps.verify_get_started_button_is_visible();
	}

	@Then("^the user should validate the current page title '(.*)'$")
	public void the_user_should_validate_the_current_page_title_It_All_Starts_with_Your_Stunning_Website(String keyword) throws Throwable {
		homePageSteps.verify_the_title_of_the_homepage(keyword);
	}

}
