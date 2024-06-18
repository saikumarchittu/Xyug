package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.Webdriverutility;

public class X_Yug_DevopsAsService {

	@FindBy (xpath = "//button[.='Read More']") private WebElement ReadMoreBtn;
	
	public X_Yug_DevopsAsService(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getReadMoreBtn() 
	{
		return ReadMoreBtn;
	}
	public void performeDevops(WebDriver driver) throws Exception {
		Webdriverutility wu=new Webdriverutility();
		wu.waitforloadelements(driver);
		wu.thread(driver);
		wu.takeScreenShot(driver, "Devops As Service Home Page");
		ReadMoreBtn.click();
		Thread.sleep(5000);
		wu.takeScreenShot(driver, "Devops As Service Read More Page");
		wu.thread(driver);
	}
	
}
