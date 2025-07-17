package Allpages;

import org.openqa.selenium.By;

import BaseP.BaseC;
import GenericMethodP.GenericMethodC;

public class loginPage extends BaseC {

	public static By emailXpath = By.xpath("//input[@id='email']");
	public static By passwordXpath = By.xpath("//input[@name='pass']");
	public static By buttonXpath = By.xpath("//button[@name='login']");
	public static By createButton = By.xpath("//a[text()='Create new account']");


	public static void email_Input(By emailXpath, String emailId) {
		driver.findElement(emailXpath).sendKeys(emailId);
	}

	public static void Password_Input(By passwordXpath, String password) {
		driver.findElement(passwordXpath).sendKeys(password);
	}

	public static void button_Login() {
		driver.findElement(buttonXpath);
	}
	
	public static void clickOnCreateAccount(By createbutton) {
		driver.findElement(createButton).click();
	
	}
	
}
