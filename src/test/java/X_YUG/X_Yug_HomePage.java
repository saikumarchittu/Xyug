package X_YUG;

import org.testng.annotations.Test;
import GenericUtility.Base;
import GenericUtility.Webdriverutility;
import ObjectRepository.X_YugDashBoard;

public class X_Yug_HomePage extends Base{

	@Test
	public void performHomePage() throws Exception {
		Webdriverutility wu=new Webdriverutility();
		wu.waitforloadelements(driver);
		X_YugDashBoard xb=new  X_YugDashBoard(driver);
		wu.thread(driver);
		xb.Xyughome(driver);
	}
}
