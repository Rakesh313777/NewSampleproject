package GenericMethodP;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseP.BaseC;

public class GenericMethodC extends BaseC {

	// TakesScreenshot------------Interface------------------------->

	public static String captureScreenshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) BaseC.driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\chirumalla\\Documents\\narestitxlfiles\\captures\\" + "Screenshot"
				+ System.currentTimeMillis() + ".png");
		FileUtils.copyFile(src, des);
		return des.getAbsolutePath();

	}

	// wait------------------------------------------------------->

	// implicit wait
	public static void implicit_Wait(int timeout) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
	}

	// explicit wait
	public static void explicit_Wait(By elementXpath, int timeout) {
		WebElement web = driver.findElement(elementXpath);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.elementToBeClickable(elementXpath));
		web.click();
	}

	// checkBox-------------------------------------------------------->
	// count the number of checkBoxes
	public static void checkBoxesCount(By checkboxXpath) {
		List<WebElement> link = driver.findElements(checkboxXpath);
		System.out.println(link.size());
	}

	// checkBoxes names
	public static void checkboxesNames(By checkboxXpath) {
		List<WebElement> link = driver.findElements(checkboxXpath);
		for (WebElement web : link) {

			System.out.println(web.getAttribute("value"));
//				if (web.getText().isEmpty()) {
//					System.out.println(web.getAttribute("value"));
//				} else {
//					System.out.println(web.getText());
//				}
		}
	}

	// checkBoxes is checked or not
	public static void checkboxesCheckedOrNot(By checkboxXpath) {
		List<WebElement> link = driver.findElements(checkboxXpath);
		for (WebElement web : link) {
			if (web.isSelected()) {
				System.out.println("it is already selected");
			} else {
				web.click();
			}
		}
	}

	// check particular check box by name;
	public static void checkboxesParticularName(By checkboxXpath, String checkBoxName) {
		List<WebElement> link = driver.findElements(checkboxXpath);
		for (WebElement web : link) {
			if (checkBoxName.equals(web.getAttribute("value"))) {
				web.click();
			}
		}
	}

	// RadioButton-------------------------------------------------------->
	// by enter name
	public static void radioButtonName(By genderXpath, String gender) {
		List<WebElement> web = driver.findElements(genderXpath);
		for (int i = 0; i < web.size(); i++) {
			if (web.get(i).getText().equalsIgnoreCase(gender)) {
				web.get(i).click();
				break;
			}
		}
	}

	// count the number of RadioButton
	public static void radiobuttonCount(By radioXpath) {
		List<WebElement> link = driver.findElements(radioXpath);
		System.out.println(link.size());
	}

	// RadioButton names
	public static void radioBUttonNamesPrint(By radioXpath) {
		List<WebElement> link = driver.findElements(radioXpath);
		for (WebElement web : link) {
			System.out.println(web.getAttribute("value"));
//				if (web.getText().isEmpty()) {
//					System.out.println(web.getAttribute("value"));
//				} else {
//					System.out.println(web.getText());
//				}
		}
	}

	// Select drop down---------------------------------------------------->
	// By index
	public static void selectIndex(By xpathlink, int index) {
		WebElement web = driver.findElement(xpathlink);
		Select sc = new Select(web);
		sc.selectByIndex(index);
	}

	// By value
	public static void selectValue(By xpathlink, String valueName) {
		WebElement web = driver.findElement(xpathlink);
		Select sc = new Select(web);
		sc.selectByValue(valueName);
	}

	// By visibleText
	public static void selectVisibletext(By xpathlink, String textName) {
		WebElement web = driver.findElement(xpathlink);
		Select sc = new Select(web);
		sc.selectByVisibleText(textName);
	}

	// By getOption of particular
	public static void selectParticularElement(By xpathlink, String textName) {
		WebElement web = driver.findElement(xpathlink);
		Select sc = new Select(web);
		List<WebElement> list = sc.getOptions();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getText().equalsIgnoreCase(textName)) {
				list.get(i).click();
			}
		}

	}

	// By getOptions
	public static void selectGetAllOptions(By xpathlink) {
		WebElement web = driver.findElement(xpathlink);
		Select sc = new Select(web);
		List<WebElement> list = sc.getOptions();

		for (WebElement li : list) {
			System.out.println(li.getText());
		}
	}

//		------------------------------------------------------------------------->

	// javaScriptExecutors-------Interface----------------------------------------------------->

	// window scrollBy
	public static void scrollUpAndDown() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-10000)");

	}

	// scroll in to view and click
	public static void scrollIntoViewAndClick(By xpathlink) {

		WebElement web = driver.findElement(xpathlink);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", web);
		js.executeScript("arguments[0].click();", web);
	}

	// enter text Without SendKeys
	public static void javascriptExecutor_Sendkeys(By xpathlink, String text) {
		WebElement web = driver.findElement(xpathlink);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='" + text + "';", web);
	}

	// with click
	public static void javascriptExecutor_Click(By xpathlink) {
		WebElement web = driver.findElement(xpathlink);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", web);
	}

//		------------------------------------------------------------------------->

//		Actions--------------------------------------------------------------------->
	// move to element
	public static void moveTOElement(By elementXpath) {
		WebElement link = driver.findElement(elementXpath);
		Actions act = new Actions(driver);
		act.moveToElement(link).build().perform();
	}

	// drag and drop
	public static void dragAndDrop(By sourceXpath, By destinationXpath) {
		WebElement link1 = driver.findElement(sourceXpath);
		WebElement link2 = driver.findElement(destinationXpath);
		Actions act = new Actions(driver);
		act.dragAndDrop(link1, link2).build().perform();
	}

	// double click
	public static void doubleClick(By elementXpath) {
		WebElement link = driver.findElement(elementXpath);
		Actions act = new Actions(driver);
		act.doubleClick(link).build().perform();
	}

	// right click
	public static void rightClick(By elementXpath) {
		WebElement link = driver.findElement(elementXpath);
		Actions act = new Actions(driver);
		act.contextClick(link).build().perform();
	}

	// copy and paste. just tab changing
	public static void copyAndPaste(By elementXpath, String sendKeyName) {
		driver.findElement(null).sendKeys(sendKeyName);
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	}

	// By using shift all capitals
	public static void usingShift(By elementXpath, String sendKeyname) {
		WebElement link = driver.findElement(elementXpath);
		Actions act = new Actions(driver);
		act.keyDown(link, Keys.SHIFT).sendKeys(sendKeyname).build().perform();
	}
	// ------------------------------------------------------------------------------------------------------------------------->
	// Alerts--------------------------------------------------------------------------------------->

	public static void alertText(String alertText) {

		if (alertText.equals(driver.switchTo().alert().getText())) {
			driver.switchTo().alert().accept();
		} else {
			driver.switchTo().alert().dismiss();
		}
	}

//		------------------------------------------------------------------------->

	// windowHandling--------------------------------------------------------------------->

	public static void windowHandling(String titleName, By bynameOfWantedwindow) {

		String parent = driver.getWindowHandle(); // unique code is in string format
		Set<String> allwindows = driver.getWindowHandles();

		for (String current : allwindows) {
			if (!current.equals(parent)) {

				driver.switchTo().window(current);
				if (titleName.equals(driver.getTitle())) {
					driver.findElement(bynameOfWantedwindow).click();
				}
			}

			if (current.equals(allwindows.size())) {
				System.out.println("title is not matched");
			}
		}
	}

	// switch to new
	// tab--------------------------------------------------------------------------->
	public static void switchNewTab(String text) {
		driver.switchTo().newWindow(WindowType.WINDOW.TAB).get(text);
	}

	// switch to new browser------------------------------------------------------>
	public static void switchNewWindow(String text) {
		driver.switchTo().newWindow(WindowType.WINDOW).get(text);
	}
	// ---------------------------------------------------------------------------------------------------------->

	// iframes--------------------------------------------------------------------------->

	// By index
	public static void frameByIndex(int frameIndex, By destinationXpath) {
		driver.switchTo().frame(frameIndex);
		driver.findElement(destinationXpath).click();
	}

	// By id or name
	public static void frameById(String frameIdOrName, By destinationXpath) {
		driver.switchTo().frame(frameIdOrName);
		driver.findElement(destinationXpath).click();
	}

	// By webElement
	public static void frameByWebElement(WebElement frameWebLink, By destinationXpath) {
		driver.switchTo().frame(frameWebLink);
		driver.findElement(destinationXpath).click();
	}

	// all frames by giving destination link
	public static void framesAll(By destinationXpath) {

		List<WebElement> list = driver.findElements(By.xpath("//iframe"));
		for (int i = 0; i < list.size(); i++) {
			driver.switchTo().frame(i);
			try {
				WebElement link = driver.findElement(destinationXpath);
				if (link.isEnabled()) {
					link.click();
				}
			} catch (Exception e) {
				driver.switchTo().defaultContent();
			}
		}
	}
	// ------------------------------------------------------------------------------------------------------->

}
