package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.CommonWaits;

import static common.CommonActions.*;

public class HomePage {
	
	WebDriver driver;
	CommonWaits waits;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		waits = new CommonWaits(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='quote-main-zip-code-input']")
	WebElement zipCodElement;
	@FindBy(id = "quote-main-zip-btn")
	WebElement startQuoteElement;
	@FindBy(id = "nyLegacyCloseLinkId")
	WebElement continuElement;
	
	public void autoSteps() {
		input(zipCodElement, "11368");
		click(startQuoteElement);
		
		waits.waitUntilVisible(continuElement);
		if(isPresent(continuElement) && isDisplayed(continuElement)) {
			click(continuElement);
		}
	}
	

}
