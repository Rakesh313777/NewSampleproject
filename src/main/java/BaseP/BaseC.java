package BaseP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseC {

	// browser initialization
	// webDriver driver initialization
	// browser close
	// database connection

	public static String browser = "chrome";
	public static String url = "https://www.fb.com";
	public static WebDriver driver;

	public static void browser_Close() {
		driver.close();
	}

	public static void browserInitialization(String browser, String url) {
		switch (browser) {

		case ("chrome"): {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(url);
			break;
		}
		case ("edgebrowser"): {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get(url);
			break;
		}
		case ("IE"): {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			driver.get(url);
			break;
		}
		case ("firefox"): {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get(url);
			break;
		}
		}

	}

}
