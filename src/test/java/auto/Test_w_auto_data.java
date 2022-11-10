package auto;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import base.BaseClass;
import utils.data.AutoData;

public class Test_w_auto_data extends BaseClass {
	
	AutoData autoData = new AutoData("11369", "Abdul", "I", "Mannan", "3115 87th Street", "01", "02-28-19986");
	
	@Test
	public void autoQuoteWithAutoData() {
		homePage.autoSteps(autoData);
		personalInfo.personalInfoSteps(autoData);
	}

}
