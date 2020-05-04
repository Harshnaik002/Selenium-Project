package com.demoaut.newtour.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy (name = "userName")
	private WebElement uname;
	
	@FindBy (name ="password")
	private WebElement pass;
	
	@FindBy (name = "login")
	private WebElement signin;
	
	public LoginPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Applicationlogin(String Username, String Password) {
		uname.clear();
		uname.sendKeys(Username);
		pass.sendKeys(Password);
		signin.click();
	}
}



