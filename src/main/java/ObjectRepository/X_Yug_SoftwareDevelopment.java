package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.Webdriverutility;

public class X_Yug_SoftwareDevelopment {

	
	@FindBy (xpath = "//a[.='Read More']") private WebElement ReadMoreBtn;
	@FindBy (xpath = "//a[.='Angular']") private WebElement AngularLnk;
	@FindBy (xpath = "//a[.='React.js']") private WebElement ReactJsLnk;
	@FindBy (xpath = "//a[.='Laravel']") private WebElement LarvelLnk;
	@FindBy (xpath = "//a[.='Node.js']") private WebElement NodeJsLnk;
	@FindBy (xpath = "//a[.='Php']") private WebElement PhpLnk;
	@FindBy (xpath = "//a[.='Python']") private WebElement PythonLnk;
	@FindBy (xpath = "//a[.='JavaScript']") private WebElement JavaScriptLnk;
	@FindBy (xpath = "//a[.='TypeScript']") private WebElement TypeScriptLnk;
	@FindBy (xpath = "//a[.='Java']") private WebElement JavaLnk;
	@FindBy (xpath = "//a[.='C++']") private WebElement CPlusLnk;
	@FindBy (xpath = "//a[.='Vue.js']") private WebElement ValueJsLnk;
	
	public X_Yug_SoftwareDevelopment(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	public WebElement getReadMoreBtn() 
	{
		return ReadMoreBtn;
	}
	public WebElement getAngularLnk() 
	{
		return AngularLnk;
	}
	public WebElement getReactJaLnk() 
	{
		return ReactJsLnk;
	}
	public WebElement getLarvelLnk() 
	{
		return LarvelLnk;
	}
	public WebElement getNodeJsLnk() 
	{
		return NodeJsLnk;
	}
	public WebElement getPhpLnk() {
		return PhpLnk;
	}
	public WebElement getPythonLnk() 
	{
		return PythonLnk;
	}
	public WebElement getJavaScriptLnk() 
	{
		return JavaScriptLnk;
	}
	public WebElement getTypeScriptLnk() 
	{
		return TypeScriptLnk;
	}
	public WebElement getJavaLnk() 
	{
		return JavaLnk;
	}
	public WebElement getCPlusLnk() 
	{
		return CPlusLnk;
	}
	public WebElement getValueJsLnk() 
	{
		return ValueJsLnk;
	}
	
	public void Performeoperations(WebDriver driver) throws Exception {
		Webdriverutility wu=new Webdriverutility();
		wu.takeScreenShot(driver, "SoftwareDevelopment");
		ReadMoreBtn.click();
		wu.thread(driver);
		wu.takeScreenShot(driver, "ReadMorePage");
		wu.thread(driver);
		wu.scrolldown(driver);
		wu.thread(driver);
		wu.takeScreenShot(driver, "Angular");
		wu.thread(driver);
        ReactJsLnk.click();
        wu.thread(driver);
		wu.takeScreenShot(driver, "React");
		wu.thread(driver);
		LarvelLnk.click();
		wu.thread(driver);
		wu.takeScreenShot(driver, "larvel");
		wu.thread(driver);
		NodeJsLnk.click();
		wu.thread(driver);
		wu.takeScreenShot(driver, "NODEJS");
		wu.thread(driver);
		PhpLnk.click();
		wu.thread(driver);
		wu.takeScreenShot(driver, "PHP");
		wu.thread(driver);
		PythonLnk.click();
		wu.takeScreenShot(driver, "Python");
		wu.thread(driver);
		JavaScriptLnk.click();
		wu.thread(driver);
		wu.takeScreenShot(driver, "JavaScript");
	    wu.thread(driver);
	    TypeScriptLnk.click();
	    wu.thread(driver);
	    wu.takeScreenShot(driver, "TypeScript");
	    wu.thread(driver);
	    JavaLnk.click();
	    wu.thread(driver);
	    wu.takeScreenShot(driver, "Javalnk");
	    wu.thread(driver);
	    CPlusLnk.click();
	    wu.thread(driver);
	    wu.takeScreenShot(driver, "Cplus");
	    wu.thread(driver);
	    ValueJsLnk.click();
	    wu.thread(driver);
	    wu.takeScreenShot(driver, "Value.Js");
	}
	
}
