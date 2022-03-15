package fbTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.AddFriendFaceBook;
import pom.HeaderPageFaceBook;
import pom.LogOutFaceBook;
import pom.LoginPageFaceBook;
import pom.MessengerPageFaceBook;
import pom.ProfilePageFaceBook;

public class TestClassFacebook {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","F:\\Velocity\\Selenium\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		LoginPageFaceBook loginPageFaceBook = new LoginPageFaceBook(driver);
		
		 loginPageFaceBook.sendEmailId();
		 loginPageFaceBook.sendPassword();
		 loginPageFaceBook.clickOnLoginButton();
		 
	    ProfilePageFaceBook profilePage = new ProfilePageFaceBook(driver);
	    
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
	    Thread.sleep(5000);
	   /* profilePage.clickOnMore();
	    Thread.sleep(6000);
	    profilePage.clickOnFilms();
	    Thread.sleep(5000);
	    profilePage.clickOnMore();
	    Thread.sleep(5000);
	    profilePage.clickOnTvProgrammes();
	    Thread.sleep(5000);
	    profilePage.clickOnMore();
	    Thread.sleep(5000);
	    profilePage.clickOnBooks();
	    Thread.sleep(5000);
	    profilePage.clickOnMore();
	    Thread.sleep(5000);
	    profilePage.clickOnLikes();
	    Thread.sleep(5000);
	    profilePage.clickOnMore();
	    Thread.sleep(5000);
	    profilePage.clickOnEvents();
	    Thread.sleep(5000);
	    profilePage.clickOnMore();
	    Thread.sleep(5000);
	    profilePage.clickOnAppsAndGames();*/
	    
	   
	    
	    
		 
	 /*  MessengerPageFaceBook messenger = new MessengerPageFaceBook(driver);
		 
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
	   messenger.clickOnCloseChat();*/
		 
		 
		 
	/*	AddFriendFaceBook addFriend = new AddFriendFaceBook(driver);
		 
		addFriend.clickOnSearchBar();
		Thread.sleep(3000);
		addFriend.clickOnSelectName();
		Thread.sleep(3000);
		addFriend.moveOnNameImage();
		Thread.sleep(3000);
		addFriend.clickOnAddFriend();
		Thread.sleep(3000);
		addFriend.clickOnCancelFriendRequest();
		Thread.sleep(3000);*/
		
	  /*  HeaderPageFaceBook headerPageFaceBook = new HeaderPageFaceBook(driver);

		 headerPageFaceBook.clickOnfacebook();
		 Thread.sleep(3000);
		 headerPageFaceBook.sendDataOnSearchBar();
		 Thread.sleep(3000);
		 headerPageFaceBook.clickOnHome();
		 Thread.sleep(3000);
		 headerPageFaceBook.clickOnWatch();
		 Thread.sleep(3000);
		 headerPageFaceBook.clickOnMarketPlace();
		 Thread.sleep(4000);
		 headerPageFaceBook.clickOnGroups();
		 Thread.sleep(3000);
		 headerPageFaceBook.clickOnGaming();
		 Thread.sleep(3000);
		 headerPageFaceBook.clickOnMenu();
		 Thread.sleep(3000);
		 headerPageFaceBook.clickOnMessenger();
		 Thread.sleep(3000);
		 headerPageFaceBook.clickOnNotifications();
		 Thread.sleep(3000);
		//headerPageFaceBook.clickOnAccount();*/
		
	   LogOutFaceBook logOutFacebook = new LogOutFaceBook(driver);
		
		logOutFacebook.clickOnAccountLogo();
		logOutFacebook.clickOnLogout();
	}
}
