package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.CommonActions;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='quote-main-zip-code-input']")
	WebElement zipCodElement;
	
	public void autoSteps() {
		CommonActions.input(zipCodElement, "11368");
	}
	

}
