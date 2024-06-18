package X_YUG;


import org.testng.annotations.Test;
import GenericUtility.Base;
import GenericUtility.Webdriverutility;
import ObjectRepository.X_YugDashBoard;
import ObjectRepository.X_Yug_SoftwareDevelopment;

public class Software_Development extends Base{

	@Test
	 public void clickReadMore() throws Exception {
		 X_YugDashBoard yub=new X_YugDashBoard(driver);
		 X_Yug_SoftwareDevelopment sd=new X_Yug_SoftwareDevelopment(driver);
		 Webdriverutility wu=new Webdriverutility();
		 yub.ClickServices(driver);
		 wu.thread(driver);
		 sd.Performeoperations(driver);
	 }
}
