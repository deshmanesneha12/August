package demo;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.BrowserOfWeb;

public class LoacateByTag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=BrowserOfWeb.openBrowser("https://www.google.com/");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("no of links are"+links.size());
		
		for(WebElement e:links) {
			System.out.println(e.getText());
		}
	}

}
