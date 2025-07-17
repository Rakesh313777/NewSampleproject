package SmokeTestCases;

import Allpages.loginPage;
import Allpages.signupPage;
import BaseP.BaseC;

public class TC01_signup extends signupPage{
	
	
	public static void main(String[] args) {
		
		BaseC.browserInitialization(BaseC.browser, BaseC.url);
		
		loginPage.clickOnCreateAccount(loginPage.createButton);
		
		enter_FirstName(firstNameXpath, "rakesh");
		enter_LastName(lastNameXpath, "chir");
		enter_SelectDay(selectDayXpath, "24"); //enter value 1 to 31
		enter_SelectMonth(selectMonthXpath, "mar"); // enter visibleText of month of first 3characters
		enter_SelectYear(selectYearXpath, "1998"); // enter value 1905 to 2020 which grater than 5 years from current year
		enter_Gender(genderXpath, "male");
//		enter_Gender(genderXpath, "custom");  // while using custom
//		enter_SelectCustomGender_AndNameOptional(selectCustomGenderXpath, 1, customgenderNameOptionalXpath, "gay"); // select index 1 to 3
		enter_EmailOrMobileNumber(EmailOrMobileNumberXpath, "R@gmail.com"); // enter valid email or mobile number
		enter_Password(passwordXpath, "12345");
		enter_Submit(signupButtonXpath);
		
	}

	
	
	
}
