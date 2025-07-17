package SmokeTestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Allpages.loginPage;
import BaseP.BaseC;
import GenericMethodP.GenericMethodC;

public class ExcelReadAndWrite extends BaseC {

	public static void main(String[] args) throws IOException, InterruptedException {

		String path = "C:\\Users\\chirumalla\\Documents\\narestitxlfiles\\test1.xlsx";

//		String s = path.substring(path.lastIndexOf("."), path.lastIndexOf("x") + 1);
////			System.out.println(s);
//
//		if (".xlsx".equals(s)) {

		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		// sheet.getLastRowNum()
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {

			String email = sheet.getRow(i).getCell(0).getStringCellValue();
			String password = sheet.getRow(i).getCell(1).getStringCellValue();

			System.out.println(email);
			System.out.println(password);

			BaseC.browserInitialization(BaseC.browser, BaseC.url);
			loginPage.email_Input(loginPage.emailXpath, email);
			loginPage.Password_Input(loginPage.passwordXpath, password);
			loginPage.button_Login();
			GenericMethodC.javascriptExecutor_Click(loginPage.buttonXpath);

			int count = sheet.getRow(i).getLastCellNum();
			XSSFCell cell = sheet.getRow(i).createCell(count+1);

			String actualtitle = driver.getTitle();
			String expectedtitle = "welcome to fb";

			if (expectedtitle.equals(actualtitle)) {
				cell.setCellValue("pass");
				System.out.println("pass");
			} else {
				cell.setCellValue("fail");
				System.out.println("fail");
			}

		}

		fis.close();
		FileOutputStream fos = new FileOutputStream(path, true);
		workbook.write(fos);
		fos.close();
//
//		} else {
//			System.out.println("File is not matched with - " + s);
//		}

	}
}
