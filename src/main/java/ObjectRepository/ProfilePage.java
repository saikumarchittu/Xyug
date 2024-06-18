package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

        public class ProfilePage {
 
	    //Find WebElements By Using @FindBy, @FindBys, @FindAll Annotations
	
	    @FindBy (xpath = "//p[.='KYC']") private WebElement KycLnk;
	
	    @FindBy (xpath = "//p[.='Orders']")private WebElement OrdersLnk;
	
	    @FindBy (xpath = "//p[.='Log Out']")private WebElement LogOutLnk;
	
	    //Creating A Constructor To Initialize These WebElement

	    public ProfilePage(WebDriver driver) 
	    {
		PageFactory.initElements(driver,this);
	    }
	
	    //Using Getters To Get Those WebElements
	
	    public WebElement getKycLnk() 
	    {
		return KycLnk;
	    }
     	public WebElement getOrdersLnk() 
     	{
		return OrdersLnk;
	    }
	    public WebElement getLogOutLnk() 
	    {
		return LogOutLnk;
	    }
	
	 //Business Library	
}