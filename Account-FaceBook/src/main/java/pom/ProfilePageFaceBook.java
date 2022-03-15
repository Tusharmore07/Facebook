package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePageFaceBook {

	@FindBy(xpath="//span[text()='Tushar More']")
	private WebElement myProfile  ;
	
	@FindBy(xpath="//div[@aria-label='Edit Cover Photo']//i")
	private WebElement editCoverPhoto ;
	
	@FindBy(xpath="//span[text()='Select photo']")
	private WebElement selectPhoto ;
	
	@FindBy(xpath="//div[@aria-label='Select photo']//i")
	private WebElement selectPhotoCancelButton ;
	
	@FindBy(xpath="//span[text()='Add to Story']")
	private WebElement addToStory ;
	
	@FindBy(xpath="//div[@class='pedkr2u6 pmk7jnqg kp4lslxn ms05siws pnx7fd3z nf1dmkjp s0qqerhg']")
	private WebElement cancelStory ;
	
	@FindBy(xpath="//span[text()='Edit Profile']")
	private WebElement editProfile ;
	
	@FindBy(xpath="(//div[@aria-label='Close'])[2]")
	private WebElement cancelEditProfile ;
	
	@FindBy(xpath="(//span[text()='Posts'])[1]")
	private WebElement posts ;
	
	@FindBy(xpath="//span[text()='About']")
	private WebElement about ;
	
	@FindBy(xpath="//div[@data-pagelet='ProfileTabs']//a[4]")
	private WebElement friends ;
	
	@FindBy(xpath="//span[text()='Photos']")
	private WebElement photos ;
	
	@FindBy(xpath="//span[text()='Videos']")
	private WebElement videos ;
	
	@FindBy(xpath="//span[text()='Check-ins']")
	private WebElement checksIn ;
	
	@FindBy(xpath="(//span[text()='More'])[1]")
	private WebElement more ;
	
	@FindBy(xpath="//span[text()='Sports']")
	private WebElement sports ;
	
	@FindBy(xpath="//span[text()='Music']")
	private WebElement music ;
	
	@FindBy(xpath="//span[text()='Films']")
	private WebElement films ;
	
	@FindBy(xpath="//span[text()='TV Programmes']")
	private WebElement tvProgrammes ;
	
	@FindBy(xpath="//span[text()='Books']")
	private WebElement books ;
	
	@FindBy(xpath="//span[text()='Apps and Games']")
	private WebElement appsAndGames ;
	
	@FindBy(xpath="//span[text()='Likes']")
	private WebElement likes ;
	
	@FindBy(xpath="//span[text()='Events']")
	private WebElement events  ;
	
	public ProfilePageFaceBook (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnMyProfile ()
	{
		myProfile.click();
	}
	
	public void clickOnEditCoverPhoto ()
	{
		editCoverPhoto.click();
	}
	
	public void clickOnSelectPhoto ()
	{
		selectPhoto.click();
	}
	
	public void clickOnSelectPhotoCancelButton ()
	{
		selectPhotoCancelButton.click();
	}
	
	public void clickOnAddToStory ()
	{
		addToStory.click();
	}
	
	public void clickOnCancelStory ()
	{
		cancelStory.click();
	}
	
	public void clickOnEditProfile ()
	{
		editProfile.click();
	}
	
	public void clickOnCancelEditProfile ()
	{
		cancelEditProfile.click();
	}
	
	public void clickOnPosts ()
	{
		posts.click();
	}
	
	public void clickOnAbout()
	{
		about.click();
	}
	
	public void clickOnFriends ()
	{
		friends.click();
	}
	
	public void clickOnPhotos ()
	{
		photos.click();
	}
	
	public void clickOnVideos()
	{
		videos.click();
	}
	
	public void clickOnChecksIn()
	{
		checksIn.click();
	}
	
	public void clickOnMore ()
	{
		more.click();
	}
	
	public void clickOnSports ()
	{
		sports.click();
	}
	
	public void clickOnMusic ()
	{
		music.click();
	}
	
	public void clickOnFilms ()
	{
		films.click();
	}
	
	public void clickOnTvProgrammes ()
	{
		tvProgrammes.click();
	}
	
	public void clickOnBooks ()
	{
		books.click();
	}
	
	public void clickOnAppsAndGames ()
	{
		appsAndGames.click();
	}
	
	public void clickOnLikes ()
	{
		likes.click();
	}
	
	public void clickOnEvents ()
	{
		events.click();
	}

}
