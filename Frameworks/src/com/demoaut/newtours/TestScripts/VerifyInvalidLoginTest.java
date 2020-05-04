package com.demoaut.newtours.TestScripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoaut.newtour.Pages.LoginPage;
import com.demoaut.newtour.Pages.SignonPage;

import utils.GenericMethods;

public class VerifyInvalidLoginTest {

	
	WebDriver driver;
	@BeforeClass
	public void OpenApplication () {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
}
	@Test
	public void VerifyInvalidLoginTests() throws IOException {
		LoginPage lp = new LoginPage(driver);
		SignonPage so = new SignonPage(driver);
		String[][] data = GenericMethods.getData("C:\\Users\\Foram\\Desktop\\QA Testing Classes\\Selenium\\JAVA Projects\\TestData.xlsx", "Sheet1");
		
		for (int i=1;i<data.length;i++) {
		lp.Applicationlogin(data [i][0],data[i][1]);
		boolean Signon = so.Signonlinkvisible();
		Assert.assertTrue(Signon);
		driver.navigate().back();
	}
	}
	@AfterClass
	public void CloseApplication() {
	driver.close();
}
}
