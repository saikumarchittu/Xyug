package X_YUG;

import org.testng.annotations.Test;
import GenericUtility.Base;
import ObjectRepository.X_YugDashBoard;
import ObjectRepository.X_Yug_VfxVideoEditing;

public class X_Yug_VFX_VideoEditing extends Base{

	@Test
	public void PerformeVFX() throws Exception {
		X_YugDashBoard yb=new X_YugDashBoard(driver);
		X_Yug_VfxVideoEditing ve=new X_Yug_VfxVideoEditing(driver);
		yb.ClickVFX(driver);
		ve.performeVFXOperations(driver);
	}
}