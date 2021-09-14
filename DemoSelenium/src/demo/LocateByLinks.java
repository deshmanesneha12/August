package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.BrowserOfWeb;

public class LocateByLinks {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\Sneha\\Work\\Automation\\Automation jar\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("https://www.google.com/");
//
//		driver.manage().window().maximize();
//		driver.findElement(By.linkText("Gmail")).click();
//		
//		if(driver.getTitle().equals("Gmail-Email from Google")) {
//			System.out.println("pass");
//		}
	
	
	//by using utility package
	 
	WebDriver driver=BrowserOfWeb.openBrowser("https://www.google.com/");
	driver.findElement(By.linkText("Gmail")).click();
	BrowserOfWeb.verifyTitle(driver, "Gmail - Email from Google");

}
}
