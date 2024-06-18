package X_YUG;


import org.testng.annotations.Test;

import GenericUtility.Base;
import GenericUtility.Webdriverutility;
import ObjectRepository.X_YugDashBoard;
import ObjectRepository.X_Yug_Mobile_Application_Development;

public class Mobile_Application_Development extends Base{

	@Test
	public void mobile() throws Exception {
		Webdriverutility wu=new Webdriverutility();
		wu.waitforloadelements(driver);
		X_YugDashBoard xy=new X_YugDashBoard(driver);
		xy.ClickServicesmobileapp(driver);
		wu.thread(driver);
		X_Yug_Mobile_Application_Development md=new X_Yug_Mobile_Application_Development(driver);
		md.PerformeMobileApplication(driver);
	}
}
