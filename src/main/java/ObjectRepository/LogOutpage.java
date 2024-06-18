package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class LogOutpage {

    //Find WebElements By Using @FindBy, @FindBys, @FindAll Annotations	
    	
	@FindBy (xpath = "//button[.='Ok']") private WebElement OkBtn;
	
	@FindBy (xpath = "//button[.='Cancel']") private WebElement CancelBtn;
	
	//Creating A Constructor To Initialize These WebElements
	
	public LogOutpage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	//Using Getters To Get Those WebElements
	
	public WebElement getOkBtn() 
	{
		return OkBtn;
	}
	public WebElement getCancelBtn() 
	{
		return CancelBtn;
	}
	
	//Creating Business Libraries To Perform The Action What We Need
}
