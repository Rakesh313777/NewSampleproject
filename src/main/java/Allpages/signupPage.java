package Allpages;

import org.openqa.selenium.By;

import BaseP.BaseC;
import GenericMethodP.GenericMethodC;

public class signupPage extends BaseC {

	public static By firstNameXpath = By.xpath("//input[@name='firstname']");
	public static By lastNameXpath = By.xpath("//input[@name='lastname']");
	public static By selectDayXpath = By.xpath("//select[@title='Day']");
	public static By selectMonthXpath = By.xpath("//select[@title='Month']");
	public static By selectYearXpath = By.xpath("//select[@title='Year']");
	public static By genderXpath = By.xpath("//label[@class='_58mt']");
	public static By selectCustomGenderXpath = By.xpath("//select[@name='preferred_pronoun']");
	public static By customgenderNameOptionalXpath = By.xpath("//input[@name='custom_gender']");
	public static By EmailOrMobileNumberXpath = By.xpath("//input[@name='reg_email__']");
	public static By passwordXpath = By.xpath("//input[@type='password']");
	public static By signupButtonXpath = By.xpath("//button[@name='websubmit']");

	public static void enter_FirstName(By firstNameXpath, String firstName) {
		driver.findElement(firstNameXpath).sendKeys(firstName);
	}

	public static void enter_LastName(By lastNameXpath, String lastName) {
		driver.findElement(lastNameXpath).sendKeys(lastName);
	}

	public static void enter_SelectDay(By selectDayXpath, String enterDateValue) {
//		driver.findElement(selectDayXpath);
		GenericMethodC.selectValue(selectDayXpath, enterDateValue);
	}

	public static void enter_SelectMonth(By selectMonthXpath, String enterMonthValue) {
//		driver.findElement(selectMonthXpath);
//		GenericMethodC.selectVisibletext(selectMonthXpath, enterMonthValue);
		GenericMethodC.selectParticularElement(selectMonthXpath, enterMonthValue);
	}

	public static void enter_SelectYear(By selectYearXpath, String enterYearValue) {
//		driver.findElement(selectYearXpath);
		GenericMethodC.selectValue(selectYearXpath, enterYearValue);
	}

	public static void enter_Gender(By genderXpath, String genderName) {
		GenericMethodC.radioButtonName(genderXpath, genderName);
	}

	public static void enter_SelectCustomGender_AndNameOptional(By selectCustomGenderXpath, int customgenderIndex,
			By customgenderNameOptionalXpath, String customgenderNameOptional) {

		GenericMethodC.selectIndex(selectCustomGenderXpath, customgenderIndex);
		driver.findElement(customgenderNameOptionalXpath).sendKeys(customgenderNameOptional);
	}

	public static void enter_EmailOrMobileNumber(By EmailOrMobileNumberXpath, String EmailOrMobileNumber) {
		driver.findElement(EmailOrMobileNumberXpath).sendKeys(EmailOrMobileNumber);
	}

	public static void enter_Password(By passwordXpath, String password) {
		driver.findElement(passwordXpath).sendKeys(password);
	}

	public static void enter_Submit(By signupButtonXpath) {
		driver.findElement(signupButtonXpath).click();
	}
	
}
