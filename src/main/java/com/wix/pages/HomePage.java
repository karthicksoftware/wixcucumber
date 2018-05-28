package com.wix.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.wix.core.PageObject;

public class HomePage extends PageObject{
	
	
	By getStarted = By.xpath("//div[@class='_3qwzM']//a[text()='Get Started'][1]");
	
	
	public void openApplication() {
		getDriver().get("https://www.wix.com");
	}
	
	public void verifyGetStartedButton(){
		Assert.assertTrue("Get started button is not found", element(getStarted).isCurrentlyVisible());
	}
	
	public void verifyPageTitle(String expectedTitle){
		System.out.println("title:"+getDriver().getTitle());
		Assert.assertTrue("PageTitle text is mismatched", getDriver().getTitle().contains(expectedTitle));
	}
	
}
