package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOfWeb {

	public static WebDriver openBrowser(String url) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sneha\\Work\\Automation\\Automation jar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}

	public static void verifyTitle(WebDriver driver, String expTitle) {
		if (driver.getTitle().equals(expTitle)) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
	}
	
	public static void titleContains(WebDriver driver, String expTitle) {
		if (driver.getTitle().contains(expTitle)) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
	}
	
	
}
