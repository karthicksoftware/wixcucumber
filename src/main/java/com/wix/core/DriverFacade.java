package com.wix.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFacade {

	public static ThreadLocal<WebDriver> drivers = new ThreadLocal<WebDriver>();
	private WebDriver driver = null;

	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		setDriver(driver);
		getDriver().manage().window().maximize();
	}
	
	public void openFirefoxBrowser() {
		System.setProperty("webdriver.gecko.driver", "src/test/resources/Drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		setDriver(driver);
		getDriver().manage().window().maximize();
	}

	public WebDriver getDriver() {
		return drivers.get();
	}

	protected void setDriver(WebDriver driver) {
		drivers.set(driver);
	}
	
	public void closeBrowser() {
		getDriver().close();
	}

}
