package com.guppypond;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.base.BaseObjectPage;

public class googleHome extends BaseObjectPage {
	
	private String googleLocator = "https://www.google.com";
	By googleAboutLocator = By.xpath("/html/body//a[@href='https://about.google/?fg=1&utm_source=google-US&utm_medium=referral&utm_campaign=hp-header']");
	
	public googleHome(WebDriver driver) {
		super(driver);
	}
	
	public void open() {
		openURL(googleLocator);
	}
	
	public void openGoogleAbout() {
		find(googleAboutLocator).click();
	
	}
	
	public void verifyGoogle() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "Google";
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}

}
