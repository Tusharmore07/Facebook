package fbTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.Browser;
import pom.LogOutFaceBook;
import pom.LoginPageFaceBook;
import pom.MessengerPageFaceBook;

public class MessengerPageTestNg extends Browser {
	
	private WebDriver driver;
	private LoginPageFaceBook loginPageFaceBook;
	private MessengerPageFaceBook messenger;
	private LogOutFaceBook logOutFacebook;
	
	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browserName) {
		System.out.println("LaunchBrowser");
		
		System.out.println("LaunchBrowser");
		if(browserName.equals("Chrome"))
		{
			driver = launchChromeBrowser();
//		System.setProperty("webdriver.chrome.driver","F:\\Velocity\\Selenium\\chromedriver.exe");
//		
//	    driver = new ChromeDriver();
		}
		
		if(browserName.equals("Edge"))
		{
			driver = launchEdgeBrowser();
//		System.setProperty("webdriver.edge.driver","F:\\Velocity\\msedgedriver.exe");
//		
//	    driver = new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@BeforeClass
	public void createObject() {
		loginPageFaceBook = new LoginPageFaceBook(driver);
		messenger = new MessengerPageFaceBook(driver);
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
	public void messengerOperation() throws InterruptedException {
		System.out.println("MessengerOperation");
		
		// messenger = new MessengerPageFaceBook(driver);
		 
		   messenger.clickOnMessenger();
		   Thread.sleep(5000);
		   messenger.sendDataOnSearchBar();
		   Thread.sleep(5000);
		   messenger.sendDataOnVivekRathod();
		   Thread.sleep(5000);
		   messenger.sendMessage();
		   Thread.sleep(5000);
		   messenger.clickOnMessegeSendButton();
		   Thread.sleep(5000);
		   messenger.clickOnCloseChat();
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
		messenger = null;
	    logOutFacebook = null;
   }
//   public void closeBrowser() {
//	  	System.out.println("CloseBrowser");
//	    	
//	     driver.close();
//	    
 //       }
   
   @AfterTest
   public void closeBrowser() {
	  	System.out.println("CloseBrowser");
	    	
	     driver.close();
	     driver = null;
	     System.gc();
	    
       }
   
	

}
