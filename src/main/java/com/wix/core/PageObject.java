package com.wix.core;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PageObject extends DriverFacade{
	
	
	WebElement element = null;
	
	protected PageObject element(By element) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(element));
		this.element = getDriver().findElement(element);
		return this;
	}
	
	protected PageObject element(WebElement element) {
		this.element = element;
		return this;
	}
	
	public void shouldBeVisible() {
		Assert.assertTrue("Element is not visible",element.isDisplayed());
	}
	
	public String getText() {
		return element.getText().trim();
	}
	
	protected List<WebElement> elements(By locator) {
		return getDriver().findElements(locator);
	}
	
	protected PageObject waitUntilVisibile() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.visibilityOf(element));
		return this;
	}
	
	protected PageObject waitUntilClickable() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		return this;
	}
	
	protected void click() {
		element.click();
	}

}
