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
import pom.ProfilePageFaceBook;

public class ProfilePageTestNg extends Browser{
	
	private WebDriver driver ;
	private LoginPageFaceBook loginPageFaceBook;
	private ProfilePageFaceBook profilePage;
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
		profilePage = new ProfilePageFaceBook(driver);
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
		driver.manage().window().maximize();
		
	// loginPageFaceBook = new LoginPageFaceBook(driver);
		
		 loginPageFaceBook.sendEmailId();
		 loginPageFaceBook.sendPassword();
		 loginPageFaceBook.clickOnLoginButton();
	}
	
	@Test
	public void profilePageOperation() throws InterruptedException {
		System.out.println("ProfilePageOperation");
		
		//  profilePage = new ProfilePageFaceBook(driver);
		    
		    profilePage.clickOnMyProfile();
		    Thread.sleep(5000);
		    profilePage.clickOnEditCoverPhoto();
		    Thread.sleep(5000);
		    profilePage.clickOnSelectPhoto();
		    Thread.sleep(5000);
		    profilePage.clickOnSelectPhotoCancelButton();
		    Thread.sleep(5000);
		    profilePage.clickOnAddToStory();
		    Thread.sleep(5000);
		    profilePage.clickOnCancelStory();
		    Thread.sleep(5000);
		    profilePage.clickOnEditProfile();
		    Thread.sleep(5000);
		    profilePage.clickOnCancelEditProfile();
		    Thread.sleep(5000);
		    profilePage.clickOnPosts();
		    Thread.sleep(5000);
		    profilePage.clickOnAbout();
		    Thread.sleep(5000);
		    profilePage.clickOnFriends();
		    Thread.sleep(5000);
		    profilePage.clickOnPhotos();
		    Thread.sleep(5000);
		    profilePage.clickOnVideos();
		    Thread.sleep(5000);
		    profilePage.clickOnChecksIn();
		    Thread.sleep(5000);
		    profilePage.clickOnMore();
		    Thread.sleep(5000);
		    profilePage.clickOnSports();
		    Thread.sleep(5000);
		    profilePage.clickOnMore();
		    Thread.sleep(5000);
		    profilePage.clickOnMusic();
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
		profilePage = null;
	    logOutFacebook = null;
	   
   }
//   public void closeBrowser() {
//	  	System.out.println("CloseBrowser");
//	    	
//	     driver.close();
//	    
//        }
   
   @AfterTest
   public void closeBrowser() {
	  	System.out.println("CloseBrowser");
	    	
	     driver.close();
	     driver = null;
	     System.gc();
	    
       }

}
