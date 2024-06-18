package X_YUG;

import org.testng.annotations.Test;
import GenericUtility.Base;
import GenericUtility.Webdriverutility;
import ObjectRepository.X_YugAboutPage;
import ObjectRepository.X_YugDashBoard;

public class X_Yug_AboutPage extends Base{

	    @Test
	    public void PerformeAbout() throws Exception {
		Webdriverutility wu=new Webdriverutility();
		X_YugDashBoard xb=new X_YugDashBoard(driver);
		X_YugAboutPage ap=new X_YugAboutPage(driver);
		xb.clickAbout(driver);
		wu.thread(driver);
		ap.performeOperations(driver);		
	}
}