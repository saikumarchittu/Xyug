package X_YUG;

import org.testng.annotations.Test;
import GenericUtility.Base;
import ObjectRepository.X_YugDashBoard;
import ObjectRepository.X_Yug_DigitalMarketing;

public class X_Yug_Digital_Marketing extends Base{

	@Test
	public void clickDigitalMarketing() throws Exception {
		X_YugDashBoard yb=new X_YugDashBoard(driver);
		yb.ClickDigitalMarketing(driver);
		X_Yug_DigitalMarketing dm=new X_Yug_DigitalMarketing(driver);
		dm.ClickReadMore(driver);
	}
}