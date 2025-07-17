package stepDefinations;

import java.io.IOException;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import Allpages.loginPage;
import BaseP.BaseC;
import GenericMethodP.GenericMethodC;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class loginStepDefination extends loginPage {

	@Given("user should be on login page")
	public static void user_should_be_on_login_page() throws IOException {

		browserInitialization(BaseC.browser, BaseC.url);
		ExtentCucumberAdapter.addTestStepLog("browser has launched");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodC.captureScreenshot());
	}

//----------------------------------------------------------------->
	// for single entry--------------------->
	@When("user enters valid username {string}")
	public static void user_enters_valid_username(String emailId) throws IOException {
		loginPage.email_Input(loginPage.emailXpath, emailId);
		ExtentCucumberAdapter.addTestStepLog("enter the valid username");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodC.captureScreenshot());
	}

	@And("user enters password {string}")
	public static void user_enters_password(String pass) throws IOException {
		loginPage.Password_Input(loginPage.passwordXpath, pass);
		ExtentCucumberAdapter.addTestStepLog("enter the valid password");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodC.captureScreenshot());
	}

	// for multiple entry-------------------->
	@When("^user enters valid username1 \"([^\"]*)\"$")
	public static void user_enters_valid_username1(String username) throws IOException {
		loginPage.email_Input(loginPage.emailXpath, username);
		ExtentCucumberAdapter.addTestStepLog("User is entered emailid" + username);
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodC.captureScreenshot());
	}

	@And("^user enters password1 \"([^\"]*)\"$")
	public static void user_enters_password1(String password) throws IOException {
		loginPage.Password_Input(loginPage.passwordXpath, password);
		ExtentCucumberAdapter.addTestStepLog("User is entered password" + password);
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodC.captureScreenshot());
	}

	// ------------------------------------------------------------->
	@And("clicks on submitbutton")
	public static void clicks_on_submit() throws IOException {
		loginPage.button_Login();
		GenericMethodC.javascriptExecutor_Click(loginPage.buttonXpath);
		ExtentCucumberAdapter.addTestStepLog("clicks on submit");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodC.captureScreenshot());
	}

	@And("close the browser")
	public static void close_the_browser() {
		browser_Close();
	}
}
