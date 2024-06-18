package X_YUG;

import org.testng.annotations.Test;
import GenericUtility.Base;
import ObjectRepository.X_YugDashBoard;
import ObjectRepository.X_Yug_UIUXDesign;

public class X_Yug_UIUxPage extends Base{
	@Test
	public void clickUiUx() throws Exception {
		X_YugDashBoard yb=new X_YugDashBoard(driver);
		X_Yug_UIUXDesign ud=new X_Yug_UIUXDesign(driver);
		yb.ClickUIUXDesign(driver);
		ud.PerformeUIUXPage(driver);
	}
}