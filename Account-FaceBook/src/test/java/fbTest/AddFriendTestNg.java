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

import pom.AddFriendFaceBook;

import pom.LogOutFaceBook;
import pom.LoginPageFaceBook;


public class AddFriendTestNg {
	
   	private WebDriver driver ;
	private LoginPageFaceBook loginPageFaceBook ;
	private LogOutFaceBook logOutFacebook ;
	private AddFriendFaceBook addFriend ;
	
	 @BeforeTest
	 @Parameters("browser")
		public void launchBrowser(String browserName) {
			System.out.println("LaunchBrowser");
			if(browserName.equals("Chrome"))
			{
			System.setProperty("webdriver.chrome.driver","F:\\Velocity\\Selenium\\chromedriver.exe");
			
		    driver = new ChromeDriver();
			}
			
			if(browserName.equals("Edge"))
			{
			System.setProperty("webdriver.edge.driver","F:\\Velocity\\msedgedriver.exe");
			
		    driver = new EdgeDriver();
			}
//			if(browserName.equals("Firefox"))
//			{
//			System.setProperty("webdriver.gecko.driver","F:\\Velocity\\Selenium\\geckodriver.exe");
//			
//		    driver = new FirefoxDriver();
//			}
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	    }
	 
	 @BeforeClass
	 public void ceateObject() {
	 loginPageFaceBook = new LoginPageFaceBook(driver);
	 addFriend = new AddFriendFaceBook(driver);
	 logOutFacebook = new LogOutFaceBook(driver);
	 }
//	@BeforeClass
//	public void launchBrowser() {
//		System.out.println("LaunchBrowser");
//		
//		System.setProperty("webdriver.chrome.driver","F:\\Velocity\\Selenium\\chromedriver.exe");
//		
//	    driver = new ChromeDriver();
//	
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	
//	}
	
	@BeforeMethod
	public void loginToFaceBook() {
		System.out.println("LoginToFaceBook");
		driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		
	 //loginPageFaceBook = new LoginPageFaceBook(driver);
		
		 loginPageFaceBook.sendEmailId();
		 loginPageFaceBook.sendPassword();
		 loginPageFaceBook.clickOnLoginButton();
	}
	
	@Test
	public void addFriendOperation() throws InterruptedException {
		System.out.println("AddFriendOperation");
	  // addFriend = new AddFriendFaceBook(driver);
		 
		addFriend.clickOnSearchBar();
		Thread.sleep(6000);
		addFriend.clickOnSelectName();
		Thread.sleep(6000);
		addFriend.moveOnNameImage();
		Thread.sleep(6000);
		addFriend.clickOnAddFriend();
		Thread.sleep(6000);
		addFriend.clickOnCancelFriendRequest();
		Thread.sleep(6000);
	}
	
    @AfterMethod
    public void logOutFaceBook() {
	    System.out.println("LogOutFaceBook");
	    	
	// logOutFacebook = new LogOutFaceBook(driver);
			
		logOutFacebook.clickOnAccountLogo();
		logOutFacebook.clickOnLogout();
	    }
    @AfterClass
    public void clearPOMObject() {
    	loginPageFaceBook = null;
    	addFriend = null;
    	logOutFacebook = null;
    }	
//   @AfterClass
//   public void closeBrowser() {
//	  	System.out.println("CloseBrowser");
//	    	
//	     driver.close();
//	    
//        }
	
    @AfterTest
    public void closeBrowser() {
    	System.out.println("CloseBrowser");
    	
    	driver.quit();
    	driver = null;
    	System.gc();
    }

}
