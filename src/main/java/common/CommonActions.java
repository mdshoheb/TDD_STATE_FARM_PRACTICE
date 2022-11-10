package common;

import static org.testng.Assert.*;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import reporting.Logs;

public class CommonActions {

	public static void click(WebElement element) {
		try {
			element.click();
			Logs.log(element + "<--- has been clicked");
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Logs.log("ELEMENT NOT FOUND------>" + element);
			fail();
		}
	}

	public static void input(WebElement element, String value) {
		try {
			element.sendKeys(value);
			Logs.log(value + " : has been passed to ---> " + element);
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Logs.log("ELEMENT NOT FOUND---> " + element);
			fail();
		}
	}

	public static boolean isPresent(WebElement element) {
		try {
			element.isEnabled();
			Logs.log(element + " <--- has been PRESENT");
			return true;
		} catch (NoSuchElementException | NullPointerException e) {
			Logs.log("ELEMENT NOT FOUND ---> " + element);
			return false;
		}
	}

	public static boolean isPresent(By byLocator, WebDriver driver) {
		List<WebElement> elements = driver.findElements(byLocator);
		if (elements.size() == 0) {
			Logs.log("ELEMENT NOT FOUND ---> " + elements);
			return false;
		} else {
			Logs.log(elements.get(0) + " <--- has been PRESENT");
			return true;
		}
	}

	public static boolean isDisplayed(WebElement element) {
		if (element.isDisplayed()) {
			Logs.log(element + " <--- is VISIBLE");
			return true;
		} else {
			Logs.log(element + " <--- NOT VISIBLE");
			return false;
		}
	}

	public static void selectDropDown(WebElement element, String value) {
		try {
			Select select = new Select(element);
			select.deselectByValue(value);
			Logs.log(value + " : has been selected for ---> " + element);
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
			Logs.log("ELEMENT NOT FOUND --> " + element);
		}
	}

	public static void assertGetText(WebElement element, String expected) {
		if (element != null) {
			Logs.log(element + " <--- has text = " + element.getText());
			assertEquals(element.getText(), expected);
		} else {
			Logs.log("ELEMENT NOT FOUND --> " + element);
		}
	}

}
