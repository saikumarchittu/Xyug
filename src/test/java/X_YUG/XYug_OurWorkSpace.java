package X_YUG;

import org.testng.annotations.Test;
import GenericUtility.Base;
import GenericUtility.Webdriverutility;
import ObjectRepository.X_YugDashBoard;
import ObjectRepository.X_Yug_OurWorkspage;

public class XYug_OurWorkSpace extends Base {

	@Test	
	public void DashboardHome() throws Exception {
		Webdriverutility wu=new Webdriverutility();
		X_YugDashBoard db=new X_YugDashBoard(driver);
		X_Yug_OurWorkspage ow=new X_Yug_OurWorkspage(driver);
		db.ClickOurWorks(driver);
		wu.thread(driver);
		ow.PerformedActions(driver);

}

}