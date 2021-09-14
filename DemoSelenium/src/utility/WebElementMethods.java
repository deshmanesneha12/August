package utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public interface WebElementMethods {

	public static void enterText(WebDriver driver, By locator, String text) {
		try {
			driver.findElement(locator).sendKeys(text);
		} catch (NoSuchElementException e) {
			System.out.println("Element not found " + e.getMessage());
		}
	}

	public static void clickElement(WebDriver driver, By locator) {
		try {
			driver.findElement(locator).click();
		} catch (NoSuchElementException e) {
			System.out.println("Element not found " + e.getMessage());
		}
	}

	public static void selectCheckbox(WebDriver driver, By locator, String option) {
		List<WebElement> chkboxes = driver.findElements(locator);
		if (chkboxes.size() > 0) {
			for (WebElement ch : chkboxes) {
				if (ch.getAttribute("value").equalsIgnoreCase(option) && (!ch.isSelected())) {
					ch.click();
					break;
				}
			}
		} else
			System.out.println("Elemets not found");
	}

	public static void selectRadio(WebDriver driver, By locator, String option) {
		List<WebElement> radios = driver.findElements(locator);
		if (radios.size() > 0) {
			for (WebElement rb : radios) {
				if (rb.getAttribute("value").equalsIgnoreCase(option)) {
					rb.click();
					break;
				}
			}
		} else
			System.out.println("Elemets not found");
	}

	public static void selectDDbytext(WebDriver driver, By locator, String option) {
		boolean flag = false;
		Select op = new Select(driver.findElement(locator));

		List<WebElement> options = op.getOptions();

		for (WebElement ops : options) {
			if (ops.getText().equals(option)) {
				op.selectByVisibleText(option);
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

	public static void selectDDbyvalue(WebDriver driver, By locator, String option) {
		boolean flag = false;
		Select op = new Select(driver.findElement(locator));

		List<WebElement> options = op.getOptions();

		for (WebElement ops : options) {
			if (ops.getText().equals(option)) {
				op.selectByValue(option);
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
