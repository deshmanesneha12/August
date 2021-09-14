package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingOnRadiosXpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sneha\\Work\\Automation\\Automation jar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		
		
		//List<WebElement> radios = driver.findElements(By.cssSelector("td[class='table5']>input[name=group1]"));
		
		List<WebElement> radios = driver.findElements(By.xpath("//input[@name='group1']"));
		
		if (radios.size() > 0) {
			for (WebElement rb : radios) {
				if (rb.getAttribute("value").equalsIgnoreCase("milk")) {
					rb.click();
					break;
				}
			}
		} else
			System.out.println("Elemets not found");
	}

		
}
