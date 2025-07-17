package stepDefinations;

import java.io.IOException;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import Allpages.loginPage;
import Allpages.signupPage;
import BaseP.BaseC;
import GenericMethodP.GenericMethodC;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class signupStepDefination extends signupPage {

	@Given("user should be on signup page")
	public void user_should_be_on_signup_page() throws IOException {

		BaseC.browserInitialization(browser, url);
		loginPage.clickOnCreateAccount(loginPage.createButton);
		ExtentCucumberAdapter.addTestStepLog("browser launched and user is on signup page");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodC.captureScreenshot());
	}

//	 single entry----------------------------------------------------------------------------------->
	@When("user should enter all the required fields of firstName {string}")
	public void user_should_enter_all_the_required_fields_of(String fName) throws IOException {
		enter_FirstName(firstNameXpath, fName);
		ExtentCucumberAdapter.addTestStepLog("user enter firstName");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodC.captureScreenshot());
	}

	@And("user should enter lastName {string}")
	public void user_should_enter(String lName) throws IOException {
		enter_LastName(lastNameXpath, lName);
		ExtentCucumberAdapter.addTestStepLog("user enter the password");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodC.captureScreenshot());
	}

	@And("user should select dateOfBirth {string}")
	public void user_should_select_date_of_birth(String dob) throws IOException {
		enter_SelectDay(selectDayXpath, dob);
		ExtentCucumberAdapter.addTestStepLog("user select the day of birth");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodC.captureScreenshot());

	}

	@And("user should select monthOfBirth {string}")
	public void user_should_select_month_of_birth(String mob) throws IOException {
		enter_SelectMonth(selectMonthXpath, mob);
		ExtentCucumberAdapter.addTestStepLog("user select the month of birth");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodC.captureScreenshot());
	}

	@And("user should select yearOfBirth {string}")
	public void user_should_select_year_of_birth(String yob) throws IOException {
		enter_SelectYear(selectYearXpath, yob);
		ExtentCucumberAdapter.addTestStepLog("user select the month of birth");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodC.captureScreenshot());
	}

	@And("user should select gender {string}")
	public void user_should_select_gender(String gender) throws IOException {
		enter_Gender(genderXpath, gender);
		ExtentCucumberAdapter.addTestStepLog("user select the gender");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodC.captureScreenshot());
	}

//	-----------------------------------------------------------------> custom gender----------------
	@And("user should select customGender {string}")
	public void user_should_select_customGender(String customGender) throws IOException {
		enter_Gender(genderXpath, customGender);
		ExtentCucumberAdapter.addTestStepLog("user select the customGender");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodC.captureScreenshot());
	}

	@And("user should select SelectCustomGenderAndNameOptional {int} and {string}")
	public void user_should_select_SelectCustomGenderAndNameOptional_and(Integer index, String nameOptional)
			throws IOException {
		enter_SelectCustomGender_AndNameOptional(selectCustomGenderXpath, index, customgenderNameOptionalXpath,
				nameOptional);
		ExtentCucumberAdapter.addTestStepLog("user select the SelectCustomGenderAndNameOptional");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodC.captureScreenshot());
	}

//	------------------------------------------------------------------>
	@And("user should enter the emailOrMobileNumber {string}")
	public void user_should_enter_the_email_or_mobile_number(String emailOrMobile) throws IOException {
		enter_EmailOrMobileNumber(EmailOrMobileNumberXpath, emailOrMobile);
		ExtentCucumberAdapter.addTestStepLog("user enter the emailOrMobileNumber");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodC.captureScreenshot());
	}

	@And("user should enter the password {string}")
	public void user_should_enter_the_password(String password) throws IOException {
		enter_Password(passwordXpath, password);
		ExtentCucumberAdapter.addTestStepLog("user enter the password");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodC.captureScreenshot());
	}

	
	
	
//	 Multiple Entry------------------------------------------------------------------------------------->
	@When("^user should enter all the required fields of firstName1 \"([^\"]*)\"$")
	public void user_should_enter_all_the_required_fields_of_firstName1(String fName) throws IOException {
		enter_FirstName(firstNameXpath, fName);
		ExtentCucumberAdapter.addTestStepLog("user enter firstName");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodC.captureScreenshot());
	}

	@And("^user should enter lastName1 \"([^\"]*)\"$")
	public void user_should_enter_lastName1(String lName) throws IOException {
		enter_LastName(lastNameXpath, lName);
		ExtentCucumberAdapter.addTestStepLog("user enter the password");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodC.captureScreenshot());
	}

	@And("^user should select dateOfBirth1 \"([^\"]*)\"$")
	public void user_should_select_date_of_birth1(String dob) throws IOException {
		enter_SelectDay(selectDayXpath, dob);
		ExtentCucumberAdapter.addTestStepLog("user select the day of birth");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodC.captureScreenshot());

	}

	@And("^user should select monthOfBirth1 \"([^\"]*)\"$")
	public void user_should_select_month_of_birth1(String mob) throws IOException {
		enter_SelectMonth(selectMonthXpath, mob);
		ExtentCucumberAdapter.addTestStepLog("user select the month of birth");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodC.captureScreenshot());
	}

	@And("^user should select yearOfBirth1 \"([^\"]*)\"$")
	public void user_should_select_year_of_birth1(String yob) throws IOException {
		enter_SelectYear(selectYearXpath, yob);
		ExtentCucumberAdapter.addTestStepLog("user select the month of birth");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodC.captureScreenshot());
	}

	@And("^user should select gender1 \"([^\"]*)\"$")
	public void user_should_select_gender1(String gender) throws IOException {
		enter_Gender(genderXpath, gender);
		ExtentCucumberAdapter.addTestStepLog("user select the gender");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodC.captureScreenshot());
	}

	@And("^user should enter the emailOrMobileNumber1 \"([^\"]*)\"$")
	public void user_should_enter_the_email_or_mobile_number1(String emailOrMobile) throws IOException {
		enter_EmailOrMobileNumber(EmailOrMobileNumberXpath, emailOrMobile);
		ExtentCucumberAdapter.addTestStepLog("user enter the emailOrMobileNumber");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodC.captureScreenshot());
	}

	@And("^user should enter the password1 \"([^\"]*)\"$")
	public void user_should_enter_the_password1(String password) throws IOException {
		enter_Password(passwordXpath, password);
		ExtentCucumberAdapter.addTestStepLog("user enter the password");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodC.captureScreenshot());
	}
//-----------------------------------------------------------------------------------------
	
	@And("clicks on submit")
	public void clicks_on_submit() throws IOException {
		 enter_Submit(signupButtonXpath);
		ExtentCucumberAdapter.addTestStepLog("user clicks on submit");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(GenericMethodC.captureScreenshot());

	}
//
//	@And("close the browser")
//	public void close_the_browser() {
//		BaseC.browser_Close();
//	}

}
