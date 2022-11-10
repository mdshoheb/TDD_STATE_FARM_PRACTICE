package auto;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import base.BaseClass;

public class AutoTest extends BaseClass {
	@Test
	public void autoQuoteTest() {
		homePage.autoSteps("11368");
		personalInfo.personalInfoSteps("Shezwah", "F", "Hasan", "9610 57th Ave", "17F", "02-23-1967");
	}
	
	@Parameters({"zip", "firstN", "middleIn", "lastN", "address", "apt", "dob"})
	@Test
	public void autoQuoteParameter(String zipCode, String firstName, String middleN, String lastN, String address, String apt, String dob ) {
		homePage.autoSteps(zipCode);
		personalInfo.personalInfoSteps(firstName, middleN, lastN, address, apt, dob);
	}
	

}
