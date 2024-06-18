package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardBeforeLoginFullElementsPage {

	  //Find WebElements By Using @FindBy, @FindBys, @FindAll Annotations
	
		@FindBy (xpath = "//button[.=' Register ']")private WebElement RegisterBtn;
		
		@FindBy (xpath = "//button[.='Login']")private WebElement LoginBtn;
		
		@FindBy (xpath = "//li[.='About Us']")private WebElement AboutUsLnk;
		
		@FindBy (xpath = "//li[.=' Booking ']")private WebElement BookingLnk;
		
		@FindBy (xpath = "//li[.=' Chart ']")private WebElement ChartLnk;
		
		@FindBy (xpath = "//li[.=' Live Rates ']")private WebElement LiveRateLnk;
		
		@FindBy (xpath = "//li[.=' Locate Us ']")private WebElement LocateUsLink;
		
		@FindBy (xpath = "//li[.=' Margin ']")private WebElement MarginLnk;
		
		@FindBy (xpath = "//li[.=' Privacy Policy ']")private WebElement PrivacyPolicyLnk;
		
		@FindBy (xpath = "//li[.='Products']")private WebElement ProductsLnk;
		
		@FindBy (xpath = "//li[.=' Rate Alert ']")private WebElement RateAlertLnk;
		
		@FindBy (xpath = "(//img[@class='googleplay'])[1]")private WebElement GooglePlayLnk;
		
		@FindBy (xpath = "(//img[@class='googleplay'])[2]")private WebElement AppStroreLnk;
		
		@FindBy (xpath = "//a[.=' X-YUG Technologies']")private WebElement Xyug;
		 
		@FindBy (xpath = "//i[@class='fa-brands fa-facebook']")private WebElement FacebookLnk;
		
		@FindBy (xpath = "//i[@class='fa-brands fa-instagram']")private WebElement InstagramLnk;
		
		@FindBy (xpath = "//i[@class='fa-brands fa-linkedin']")private WebElement Linkeinlnk;
		
		@FindBy (xpath = "//i[@class='fa-brands fa-twitter']")private WebElement TwitterLnk;
		
		//Creating A Constructor To Initialize These WebElements
		
		public DashBoardBeforeLoginFullElementsPage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		
		 //Using Getters To Get Those WebElements
		
		public WebElement getRegisterBtn() {
			return RegisterBtn;
		}
		public WebElement getLoginBtn() {
			return LoginBtn;
		}
		public WebElement getAboutUsLnk() {
			return AboutUsLnk;
		}
		public WebElement getBookingLnk() {
			return BookingLnk;
		}
		public WebElement getChartLnk() {
			return ChartLnk;
		}
		public WebElement getLiveRateLnk() {
			return LiveRateLnk;
		}
		public WebElement getLocateUsLink() {
			return LocateUsLink;
		}
		public WebElement getMarginLnk() {
			return MarginLnk;
		}
		public WebElement getPrivacyPolicyLnk() {
			return PrivacyPolicyLnk;
		}
		public WebElement getProductsLnk() {
			return ProductsLnk;
		}
		public WebElement getRateAlertLnk() {
			return RateAlertLnk;
		}
		public WebElement getGooglePlayLnk() {
			return GooglePlayLnk;
		}
		public WebElement getAppStroreLnk() {
			return AppStroreLnk;
		}
		public WebElement getXyug() {
			return Xyug;
		}
		public WebElement getFacebookLnk() {
			return FacebookLnk;
		}
		public WebElement getInstagramLnk() {
			return InstagramLnk;
		}
		public WebElement getLinkeinlnk() {
			return Linkeinlnk;
		}
		public WebElement getTwitterLnk() {
			return TwitterLnk;
		}
		//Creating Business Libraries To Perform The Action What We Need
}





















