package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.BrowserOfWeb;

public class WorkingOnFrame {

	public static void main(String[] args) {
		
		WebDriver driver=BrowserOfWeb.openBrowser("https://demoqa.com/frames");
		
		//frame(String arg)-id/name
		
		driver.switchTo().frame("frame1");
		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		driver.close();
		
		
		//frame(Webelement arg)-webelement identified with valid locator
		
		driver=BrowserOfWeb.openBrowser("https://demoqa.com/nestedframes");
		
		driver.switchTo().frame("frame1");
		//System.out.println(driver.findElement(By.cssSelector("html>body>p")).getText());
		
		WebElement childfarme=driver.findElement(By.tagName("iframe"));
		
		
		driver.switchTo().frame(childfarme);
		System.out.println(driver.findElement(By.cssSelector("html>body>p")).getText());
		driver.close();
		
		
		
		
		
		
		
		
		
	}

}
