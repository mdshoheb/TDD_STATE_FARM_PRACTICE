package pages.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.CommonWaits;
import utils.data.AutoData;

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
	
	public void autoSteps(String zipCode) {
		input(zipCodElement, zipCode);
		click(startQuoteElement);
		
		waits.waitUntilVisible(continuElement);
		if(isPresent(continuElement) && isDisplayed(continuElement)) {
			click(continuElement);
		}
	}
	
	public void autoSteps(AutoData autoData) {
		input(zipCodElement, autoData.getZipCode());
		click(startQuoteElement);
		
		waits.waitUntilVisible(continuElement);
		if(isPresent(continuElement) && isDisplayed(continuElement)) {
			click(continuElement);
		}
	}
	

}
