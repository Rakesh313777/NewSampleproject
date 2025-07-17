package SmokeTestCases;

import java.time.Duration;

import Allpages.loginPage;
import BaseP.BaseC;
import GenericMethodP.GenericMethodC;

public class TC_01_Login extends loginPage {

	public static void main(String[] args) throws InterruptedException {

		BaseC.browserInitialization(BaseC.browser, BaseC.url);

		loginPage.email_Input(loginPage.emailXpath, "testing@gmail.com");
		loginPage.Password_Input(loginPage.passwordXpath, "Rakesh");

//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		GenericMethodC.implicit_Wait(10);  //implicit_Wait

		Thread.sleep(3000);
		loginPage.button_Login();
		GenericMethodC.javascriptExecutor_Click(loginPage.buttonXpath);

//		GenericMethodC.explicit_Wait(buttonXpath, 10); //explicit_Wait
//		browser_Close();
		
		
		

	}

}
