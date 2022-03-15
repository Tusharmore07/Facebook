package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPageFaceBook {
	
	@FindBy(xpath="//a[@aria-label='Facebook']")
	private WebElement facebook ;
	
	@FindBy(xpath="//div[@class='k4urcfbm']//label")
	private WebElement searchbar ;
	
	@FindBy(xpath="//a[@aria-label='Home']")
	private WebElement home ;
	
	@FindBy(xpath="(//span[@class='l9j0dhe7'])[2]")
	private WebElement watch ;
	
	@FindBy(xpath="(//a[@aria-label='Marketplace']//span)[1]")
	private WebElement marketplace ;
	
	@FindBy(xpath="(//a[@aria-label='Groups']//span)[1]")
	private WebElement groups ;
	
	@FindBy(xpath="//a[@aria-label='Gaming']")
	private WebElement gaming ;
	
	@FindBy(xpath="//div[@aria-label='Menu']")
	private WebElement menu ;
	
	@FindBy(xpath="(//div[@aria-label='Messenger'])[1]")
	private WebElement messenger ;
	
	@FindBy(xpath="//a[contains(@aria-label,'Notifications')]")
	private WebElement notify ;
	
	@FindBy(xpath="//div[@aria-label='Account']")
	private WebElement account ;
	
	public HeaderPageFaceBook(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnfacebook ( )
	{
		facebook.click();
	}
	
	public void sendDataOnSearchBar ( )
	{
		searchbar.sendKeys("Saurabh Ghodke");
	}
	
	public void clickOnHome ( )
	{
		home.click();
	}
	
	public void clickOnWatch ( )
	{
		watch.click();
	}
	
	public void clickOnMarketPlace ( )
	{
		marketplace.click();
	}
	
	
	public void clickOnGroups( )
	{
		groups.click();
	}
	
	public void clickOnGaming ( )
	{
		gaming.click();
	}
	
	public void clickOnMenu ( )
	{
		menu.click();
	}
	
	public void clickOnMessenger( )
	{
		messenger.click();
	}

	public void clickOnNotifications( )
	{
		notify.click();
	}
	
	public void clickOnAccount ( )
	{
		account.click();
	}


}
