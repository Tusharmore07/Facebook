package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddFriendFaceBook {

	@FindBy(xpath="//label[contains(@class,'lzcic4wl gs1a9yip br7hx1')]")
	private WebElement searchBar ;
	
	@FindBy(xpath="//span[text()='Search for ']")
	private WebElement selectName ;
	
	@FindBy(xpath="(//a[@role='presentation'])[1]")
	private WebElement nameImage ;
	
	@FindBy(xpath="//span[text()='Add Friend']")
	private WebElement addFriend ;
	
	@FindBy(xpath="//span[text()='Cancel Request']")
	private WebElement cancelRequest ;
	
	private WebDriver driver;
	private Actions actions;
	
	public AddFriendFaceBook(WebDriver driver)
	{
			PageFactory.initElements(driver, this);
			actions = new Actions(driver);
			this.driver=driver;
	}
	
	public void clickOnSearchBar()
	{
		searchBar.sendKeys("narendra mote");
		searchBar.click();
	}
	
	public void clickOnSelectName()
	{
		selectName.click();
	}
	
	public void moveOnNameImage()
	{
		actions.moveToElement(nameImage).click().build().perform();
	}
	
	public void clickOnAddFriend()
	{
		addFriend.click();
	}
	
	public void clickOnCancelFriendRequest()
	{
		cancelRequest.click();
	}
}
