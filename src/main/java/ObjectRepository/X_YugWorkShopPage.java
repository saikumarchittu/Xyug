
package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.Excelutility;
import GenericUtility.Webdriverutility;

public class X_YugWorkShopPage {

	//Find WebElements By Using @FindBy, @FindBys, @FindAll Annotations	
	
		@FindBy (xpath = "//input[@placeholder=\"Candidate's Name\"]")private WebElement CandidateNameEdit;
		@FindBy (xpath = "//input[@placeholder='Email Id']")private WebElement EmailEdit;
		@FindBy (xpath = "//input[@placeholder='Contact No']")private WebElement ContactNumberEdit;
		@FindBy (xpath = " //select[@name='gender']")private WebElement GenderDropDown;
		@FindBy (xpath = "//option[.='Male']") private WebElement MaleOption;
		@FindBy (xpath = "//input[@placeholder='Education Qualification']")private WebElement EducationEdit;
		@FindBy (xpath = "//input[@placeholder='University']")private WebElement UniversityEdit;
		@FindBy (xpath = "//input[@placeholder='Year of Passout']")private WebElement YearEdit;
		@FindBy (xpath = "(//input[@type='radio'])[1]")private WebElement StudentRadioButn;
		@FindBy (xpath = "//input[@placeholder='Location']")private WebElement LocationEdit;
		@FindBy (xpath = "//input[@type='submit']")private WebElement SubmitButn;

		//Creating A Constructor To Initialize These WebElements
		
		public X_YugWorkShopPage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}

		
		//Creating A Constructor To Initialize These WebElements
		
		public WebElement getCandidateNameEdit() 
		{
			return CandidateNameEdit;
		}
		public WebElement getEmailEdit() 
		{
			return EmailEdit;
		}
		public WebElement getContactNumberEdit() 
		{
			return ContactNumberEdit;
		}
		public WebElement getGenderClick() 
		{
			return GenderDropDown;
		}
		public WebElement getMaleClick() 
		{
			return MaleOption;
		}
		public WebElement getEducationEdit() 
		{
			return EducationEdit;
		}
		public WebElement getUniversityEdit() 
		{
			return UniversityEdit;
		}
		public WebElement getYearEdit() 
		{
			return YearEdit;
		}
		public WebElement getStudentRadioButn() 
		{
			return StudentRadioButn;
		}
		public WebElement getLocationEdit() 
		{
			return LocationEdit;
		}
		public WebElement getSubmitButn() 
		{
			return SubmitButn;
		}
		
		
		//Creating Business Libraries To Perform The Action What We Need
		
		public void createWorkShopApplication(WebDriver driver) throws Exception {
		Excelutility eu=new Excelutility();
		Webdriverutility wu=new Webdriverutility();
		String CandidateName=eu.getdataFromExcel("Sheet2", 12, 4);
		String EmailId=eu.getdataFromExcel("Sheet2", 13, 4);
		String ContactNum=eu.getdataFromExcel("Sheet2", 14, 4);
		String EduQuali=eu.getdataFromExcel("Sheet2", 15, 4);
		String university=eu.getdataFromExcel("Sheet2", 16, 4);
		String Passout=eu.getdataFromExcel("Sheet2", 17, 4);
		String Loc=eu.getdataFromExcel("Sheet2", 18, 4);
		
		CandidateNameEdit.sendKeys(CandidateName);
		EmailEdit.sendKeys(EmailId);
		ContactNumberEdit.sendKeys(ContactNum);
		GenderDropDown.click();
		MaleOption.click();	
		EducationEdit.sendKeys(EduQuali);
		UniversityEdit.sendKeys(university);
		YearEdit.sendKeys(Passout);
		wu.scrolldown1(driver);
		StudentRadioButn.click();
		LocationEdit.sendKeys(Loc);
        SubmitButn.click();		

		
		}
	
}
