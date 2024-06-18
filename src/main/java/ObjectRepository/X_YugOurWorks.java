package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class X_YugOurWorks {

	//Find WebElements By Using @FindBy, @FindBys, @FindAll Annotations	
	
	@FindBy (xpath = "(//div[@class='cards1'])[1]") private WebElement PaySikkaLink;
	
	@FindBy (xpath = "(//div[@class='cards1'])[2]") private WebElement GoldSikkaLink;
	
	@FindBy (xpath = "(//div[@class='cards1'])[3]") private WebElement GoldBharathLink;
	
	@FindBy (xpath = "(//div[@class='cards1'])[4]") private WebElement MatrikaGoldLink;
	
	@FindBy (xpath = "(//div[@class='cards1'])[5]") private WebElement NoBadGoldLink;
	
    //Creating A Constructor To Initialize These WebElements
	
	public X_YugOurWorks(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}

    //Using Getters To Get Those WebElements
	
	public WebElement getPaySikkaLink() 
	{
		return PaySikkaLink;
	}
	public WebElement getGoldSikkaLink() 
	{
		return GoldSikkaLink;
	}
	public WebElement getGoldBharathLink() 
	{
		return GoldBharathLink;
	}
	public WebElement getMatrikaGoldLink() 
	{
		return MatrikaGoldLink;
	}
	public WebElement getNoBadGoldLink() 
	{
		return NoBadGoldLink;
	}
 
	//Creating Business Libraries To Perform The Action What We Need

	
}
