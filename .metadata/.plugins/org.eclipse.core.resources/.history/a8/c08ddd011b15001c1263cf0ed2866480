package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingOnDD {

	public static void main(String[] args) {
		boolean flag = false;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sneha\\Work\\Automation\\Automation jar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();

		WebElement country = driver.findElement(By.id("countries"));

		Select op = new Select(country);

		List<WebElement> options = op.getOptions();

		for (WebElement ops : options) {
			if (ops.getText().equals("India")) {
				op.selectByVisibleText("India");
				flag = true;
				break;
			}
		}
		if (flag == true) {
			System.out.println("option selected");

		} else {
			System.out.println("incorrect option selected");
		}
		// by value
		for (WebElement ops : options) {
			if (ops.getAttribute("value").equals("Australia")) {
				op.selectByValue("Australia");
				flag = true;
				break;
			}
		}
		if (flag == true) {
			System.out.println("option selected");

		} else {
			System.out.println("incorrect option selected");
		}

	}
}
