package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessengerPageFaceBook {
	
	@FindBy (xpath="(//div[@aria-label='Messenger'])[1]")
	private WebElement messenger;
	
	@FindBy (xpath="//input[@placeholder='Search Messenger']")
	private WebElement searchBar ;
	
	@FindBy (xpath="(//span[text()='Vivek Rathod'])[1]")  //(//li[@class='scb9dxdr qt6c0cv9 dflh9lhu jb3vyjys'])[1]
	private WebElement vivekRathod ;
	//
	@FindBy (xpath="//p[@class='kvgmc6g5 oygrvhab']")
	private WebElement message;
	
	@FindBy (xpath="//div[@aria-label='Press Enter to send']")
	private WebElement messegeSendButton;
	
	@FindBy (xpath="//div[@aria-label='Close chat']")
	private WebElement closeChat ;
	
	public MessengerPageFaceBook(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnMessenger ()
	{
		messenger.click();
	}
	
	public void sendDataOnSearchBar ()
	{
		searchBar.sendKeys("vivek rathod");
		
	}
	
	public void sendDataOnVivekRathod ()
	{
		vivekRathod.click();
	}
	
	public void sendMessage()
	{
		message.sendKeys("hello");
	}
	
	public void clickOnMessegeSendButton()
	{
		messegeSendButton.click();
	}
	
	public void clickOnCloseChat ()
	{
		closeChat.click();
	}

}
