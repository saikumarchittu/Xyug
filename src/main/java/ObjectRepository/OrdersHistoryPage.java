package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrdersHistoryPage {

	//Find WebElements By Using @FindBy, @FindBys, @FindAll Annotations
	
	@FindBy (xpath = "//select[@class='formselect-gold-value']") private WebElement SelectOrderTypeDropDown;
	
	@FindBy (xpath = "//option[.='BUY']") private WebElement BuyOption;
	
	@FindBy (xpath = "//option[.='BOOK']") private WebElement BookOption;
	
    @FindBy (xpath = "(//img[@class='googleplay'])[1]")private WebElement GooglePlayLnk;
	
	@FindBy (xpath = "(//img[@class='googleplay'])[2]")private WebElement AppStroreLnk;
	
	@FindBy (xpath = "//a[.=' X-YUG Technologies']")private WebElement Xyug;
    
	@FindBy (xpath = "//i[@class='fa-brands fa-facebook']")private WebElement FacebookLnk;
	
	@FindBy (xpath = "//i[@class='fa-brands fa-instagram']")private WebElement InstagramLnk;
	
	@FindBy (xpath = "//i[@class='fa-brands fa-linkedin']")private WebElement Linkeinlnk;
	
	@FindBy (xpath = "//i[@class='fa-brands fa-twitter']")private WebElement TwitterLnk;
	
	//Creating A Constructor To Initialize These WebElements
	
	public OrdersHistoryPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	//Using Getters To Get Those WebElements
	
	public WebElement getSelectOrderTypeDropDown()
	{
		return SelectOrderTypeDropDown;
	}
	public WebElement getBuyOption()
	{
		return BuyOption;
	}
	public WebElement getBookOption()
	{
		return BookOption;
	}
	
	public WebElement getGooglePlayLnk()
	{
		return GooglePlayLnk;
	}

	public WebElement getAppStroreLnk()
	{
		return AppStroreLnk;
	}

	public WebElement getXyug() 
	{
		return Xyug;
	}
	public WebElement getFacebookLnk() 
	{
		return FacebookLnk;
	}
	public WebElement getInstagramLnk() 
	{
		return InstagramLnk;
	}
	public WebElement getLinkeinlnk() 
	{
		return Linkeinlnk;
	}
	public WebElement getTwitterLnk() 
	{
		return TwitterLnk;
	}
	
	//Creating Business Libraries To Perform The Action What We Need
	
}
