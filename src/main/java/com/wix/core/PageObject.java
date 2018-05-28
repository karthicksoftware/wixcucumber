package com.wix.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PageObject extends DriverFacade{
	
	
	WebElement element = null;
	
	protected PageObject element(By element) {
		this.element = getDriver().findElement(element);
		return this;
	}
	
	public boolean isCurrentlyVisible() {
		return this.element.isDisplayed();
	}
	
	public String getText() {
		return this.element.getText().trim();
	}

}
