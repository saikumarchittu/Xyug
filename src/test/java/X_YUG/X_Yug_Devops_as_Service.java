package X_YUG;

import org.testng.annotations.Test;
import GenericUtility.Base;
import ObjectRepository.X_YugDashBoard;
import ObjectRepository.X_Yug_DevopsAsService;

public class X_Yug_Devops_as_Service extends Base{
	@Test
	public void performeDevops() throws Exception {
		X_YugDashBoard yb=new X_YugDashBoard(driver);
		X_Yug_DevopsAsService ds=new X_Yug_DevopsAsService(driver); 
		yb.ClickDevops(driver);
		ds.performeDevops(driver);		
	}
}