package pages.auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.CommonWaits;
import utils.data.AutoData;

import static common.CommonActions.*;

public class PersonalInfo {
	
	CommonWaits waits;
	
	public PersonalInfo(WebDriver driver) {
		waits = new CommonWaits(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "first_name")
	WebElement firstNamElement;
	@FindBy(id = "middle_name")
	WebElement middleNamElement;
	@FindBy(id = "last_name")
	WebElement lastNamElement;
	//@FindBy(id = "suffix_name")
	//WebElement suffixElement;
	@FindBy(id = "street1")
	WebElement streetAddressElement;
	@FindBy(id = "street2")
	WebElement aptElement;
	@FindBy(id = "date_of_birth")
	WebElement dobElement;
	@FindBy(xpath = "//label[text()='I have read and acknowledge this disclosure. ']")
	WebElement checkBoxElement;
	//@FindBy(xpath = "//button[@id='btnContinue']")
	//WebElement nextElement;
	
	public void personalInfoSteps(String fName, String mName, String lastName, String address, String apt, String dob) {
		input(firstNamElement, fName);
		input(middleNamElement, mName);
		input(lastNamElement, lastName);
		//selectDropDown(suffixElement, suffix);
		input(streetAddressElement, address);
		input(aptElement, apt);
		input(dobElement, dob);
		click(checkBoxElement);
		//waits.waitUntilClickable(nextElement);
		//click(nextElement);
	}
	public void personalInfoSteps(AutoData autoData) {
		input(firstNamElement, autoData.getFirstName());
		input(middleNamElement, autoData.getMiddleInit());
		input(lastNamElement, autoData.getLastName());
		//selectDropDown(suffixElement, suffix);
		input(streetAddressElement, autoData.getAddress());
		input(aptElement, autoData.getApt());
		input(dobElement, autoData.getDob());
		click(checkBoxElement);
		//waits.waitUntilClickable(nextElement);
		//click(nextElement);
	}
}
