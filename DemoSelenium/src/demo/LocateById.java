package demo;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateById {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Sneha\\Work\\Automation\\Automation jar\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
	WebElement a=driver.findElement(By.id("login1"));
	a.sendKeys("fsgafg");
	driver.findElement(By.id("password")).sendKeys("sjhhh");
	driver.findElement(By.name("proceed")).click();
	
	String acterror=driver.findElement(By.cssSelector("div#div_login_error>b")).getText();
	if(acterror.equals("Wrong username and password combination.")) {
		System.out.println("pass");
	}else {
		System.out.println("fail");
	}
}
}
