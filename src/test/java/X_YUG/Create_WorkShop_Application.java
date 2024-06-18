package X_YUG;

import org.testng.annotations.Test;

import GenericUtility.Base;
import GenericUtility.Webdriverutility;
import ObjectRepository.X_YugDashBoard;
import ObjectRepository.X_YugWorkShopPage;

public class Create_WorkShop_Application extends Base{
	@Test
	    public void WorkShop() throws Exception {
		Webdriverutility wu=new Webdriverutility();
		wu.waitforloadelements(driver);
		Thread.sleep(4000);
		wu.takeScreenShot(driver, "Home Page");
		X_YugDashBoard yb=new X_YugDashBoard(driver);
		X_YugWorkShopPage yws=new X_YugWorkShopPage(driver);
		yb.clickWorkShop(driver);
		wu.scrolldown1(driver);
		wu.thread(driver);
		wu.scrolldown1(driver);
		wu.takeScreenShot(driver, "WorkShop Page");
		yws.createWorkShopApplication(driver);
		wu.takeScreenShot(driver, "Successfull page");
		
	}

}
