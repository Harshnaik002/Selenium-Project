package com.demoaut.newtour.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignonPage {
	
	@FindBy (linkText = "SIGN-ON")
	private WebElement signon;
	
	public SignonPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public boolean Signonlinkvisible() {
		
		boolean signonVisible = signon.isDisplayed();
		return signonVisible;
		}
	

}	
