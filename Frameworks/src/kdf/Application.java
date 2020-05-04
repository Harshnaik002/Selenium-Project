package kdf;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import utils.GenericMethods;

public class Application {
	
	@Test
	public void VerifyInvalidLogin() throws IOException {
		
		String[][] data = GenericMethods.getData("C:\\Users\\Foram\\Desktop\\QA Testing Classes\\Selenium\\JAVA Projects\\TestData2.xlsx", "Sheet1");
		for (int i=1; i<data.length;i++) {
			switch (data [i][3]) {
		
			case "openBrowser":
				Methods.openBrowser();
				break;
			case "maxBrowser":
				Methods.openBrowser();
				break;
			case "impWait":
				Methods.impWait();
				break;
			case "navtoApp":
				Methods.navtoApp(data [i][6]);
				break;
			case "enterUserid":
				Methods.enterUserid(data [i][4],data [i][5], data [i][6]);
				break;
			case "enterPassword":
				Methods.enterPassword(data [i][4],data [i][5], data [i][6]);
				break;
			case "clickLogin":
				Methods.clickLogin(data [i][4],data [i][5]);
				break;
			case "verifyErrMsg":
				String actualMsg = Methods.verifyErrMsg(data [i][5]);
				String expectedMsg = data [i][6];
				Assert.assertEquals(expectedMsg, actualMsg);
				break;
			case "closeBrowser":
				Methods.closeBrowser();
				break;
				
				
		}
	}

}
}