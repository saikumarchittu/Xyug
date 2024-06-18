package X_YUG;

import org.testng.annotations.Test;

import GenericUtility.Base;
import ObjectRepository.X_YugDashBoard;
import ObjectRepository.X_Yug_Metaverse;

public class X_YugMetavrse extends Base{

	@Test
	public void clickMetaverse() throws Exception {
		X_YugDashBoard yb=new X_YugDashBoard(driver);
		X_Yug_Metaverse ym=new X_Yug_Metaverse(driver);
		yb.ClickMetaverse(driver);
		ym.PerformanceInMetaverse(driver);
	}
}
