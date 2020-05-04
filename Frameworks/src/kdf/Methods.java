package kdf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {

	static WebDriver driver;
	
	public static void openBrowser() {
		driver =new ChromeDriver();
	}
		
		public static void maxBrowser() {
			driver.manage().window().maximize();
	}
		public static void impWait() {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
		public static void navtoApp(String url) {
			driver.get("url");
	}
		public static void enterUserid (String loc, String locValue, String userID) {
			if (loc.equals("id")) {
			driver.findElement(By.id(locValue)).sendKeys(userID);
	}
			else if (loc.equals("name")) {
				driver.findElement(By.name(locValue)).sendKeys(userID);
			}
	}
		public static void enterPassword(String loc,String locValue, String pass ) {
			if (loc.equals("id")) {
			driver.findElement(By.id("locValue")).sendKeys(pass);
			}
			else if (loc.equals("name")) {
				driver.findElement(By.name("locValue")).sendKeys("pass");
			}
	}
		public static void clickLogin(String loc,String locVal) {
			if (loc.equals("id")) {
			driver.findElement(By.id("locVal")).click();
			}
			else if (loc.equals("name")) {
				driver.findElement(By.name(locVal)).click();
			}
	}
		public static String verifyErrMsg(String locVal) {
			String errormsg =driver.findElement(By.cssSelector(locVal)).getText();
			return errormsg;
	}
		public static void closeBrowser() {
			driver.close();
		}

		
}

