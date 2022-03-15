package fbTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import pom.HeaderPageFaceBook;
import pom.LogOutFaceBook;
import pom.LoginPageFaceBook;

public class HeaderPageTestNg {
	
	private WebDriver driver ;
	private LoginPageFaceBook loginPageFaceBook ;
    private HeaderPageFaceBook headerPageFaceBook ;
    private LogOutFaceBook logOutFacebook ;
	
    @BeforeTest
    @Parameters("browser")
	public void launchBrowser(String browserName) {
		System.out.println("LaunchBrowser");
		if(browserName.equals("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver","F:\\Velocity\\Selenium\\chromedriver.exe");
		
	    driver = new ChromeDriver();
		}
		
//		if(browserName.equals("Firefox"))
//		{
//		System.setProperty("webdriver.gecko.driver","F:\\Velocity\\Selenium\\geckodriver.exe");
//		
//	    driver = new FirefoxDriver();
//		}
		if(browserName.equals("Edge"))
		{
		System.setProperty("webdriver.edge.driver","F:\\Velocity\\msedgedriver.exe");
		
	    driver = new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
    }
	@BeforeClass
	 public void ceateObject() {
	loginPageFaceBook = new LoginPageFaceBook(driver);
	headerPageFaceBook = new HeaderPageFaceBook(driver);
	logOutFacebook = new LogOutFaceBook(driver);
//	public void launchBrowser() {
//		System.out.println("LaunchBrowser");
//		
//		System.setProperty("webdriver.chrome.driver","F:\\Velocity\\Selenium\\chromedriver.exe");
//		
//	    driver = new ChromeDriver();
//	
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}
	
	@BeforeMethod
	public void loginToFaceBook() {
		System.out.println("LoginToFaceBook");
		driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		
	// loginPageFaceBook = new LoginPageFaceBook(driver);
		
		 loginPageFaceBook.sendEmailId();
		 loginPageFaceBook.sendPassword();
		 loginPageFaceBook.clickOnLoginButton();
	}
	
	@Test
	public void faceBookHeaderPage() throws InterruptedException {
		System.out.println("FaceBookHeaderPage");
	//headerPageFaceBook = new HeaderPageFaceBook(driver);

		headerPageFaceBook.clickOnfacebook();
		Thread.sleep(6000);
		headerPageFaceBook.sendDataOnSearchBar();
		Thread.sleep(6000);
		headerPageFaceBook.clickOnHome();
		Thread.sleep(6000);
		headerPageFaceBook.clickOnWatch();
		Thread.sleep(6000);
		headerPageFaceBook.clickOnMarketPlace();
		Thread.sleep(6000);
		headerPageFaceBook.clickOnGroups();
		Thread.sleep(6000);
		headerPageFaceBook.clickOnGaming();
		Thread.sleep(6000);
		headerPageFaceBook.clickOnMenu();
		Thread.sleep(6000);
		headerPageFaceBook.clickOnMessenger();
		Thread.sleep(6000);
		headerPageFaceBook.clickOnNotifications();
		Thread.sleep(6000);
		//headerPageFaceBook.clickOnAccount();
	}
	
    @AfterMethod
    public void logOutFaceBook() {
    	System.out.println("LogOutFaceBook");
    	
    //   logOutFacebook = new LogOutFaceBook(driver);
		
		logOutFacebook.clickOnAccountLogo();
		logOutFacebook.clickOnLogout();
    }
	
    @AfterClass
    public void clearPOMObject() {
    	loginPageFaceBook = null;
    	headerPageFaceBook = null;
    	logOutFacebook = null;
    }
//    public void closeBrowser() {
//    	System.out.println("CloseBrowser");
//    	
//    	driver.close();
//    }
    
    @AfterTest
    public void closeBrowser() {
    	System.out.println("CloseBrowser");
    	
    	driver.quit();
    	driver = null;
    	System.gc();
    }
    

}
