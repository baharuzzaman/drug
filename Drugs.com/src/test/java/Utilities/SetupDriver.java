package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupDriver {
	public static WebDriver chromeDriver;

	public static void setupChromeDriver() {
		WebDriverManager.chromedriver().setup();
		chromeDriver = new ChromeDriver();
	}

	public static void quitChromeDriver() {
		chromeDriver.quit();
	}


}
