package com.wix.steps;

import com.wix.pages.HomePage;

public class HomePageSteps {
	
	HomePage homePage = new HomePage();

	public void open_application(){
		homePage.openApplication();
	}
	
	public void verify_get_started_button_is_visible(){
		homePage.verifyGetStartedButton();
	}
	
	public void verify_the_title_of_the_homepage(String expectedTitle){
		homePage.verifyPageTitle(expectedTitle);
	}
}
