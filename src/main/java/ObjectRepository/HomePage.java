package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class HomePage {

	//Find WebElements By Using @FindBy, @FindBys, @FindAll Annotations
	
	@FindBy (xpath = "//button[.=' Register ']")private WebElement RegisterBtn;
	
	@FindBy (xpath = "//button[.='Login']")private WebElement LoginBtn;
	
	//Creating A Constructor To Initialize These WebElements
	
	public HomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}

	//Using Getters To Get Those WebElements
	
	public WebElement getRegisterBtn() 
	{
		return RegisterBtn;
	}
	public WebElement getLoginBtn() 
	{
		return LoginBtn;
	}
	
	//Creating Business Libraries To Perform The Action What We Need
	
	public void clickregister() 
	{
		RegisterBtn.click();
	}
	public void clicklogin() 
	{
		LoginBtn.click();
	}
}
