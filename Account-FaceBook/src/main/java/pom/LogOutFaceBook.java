package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutFaceBook {
	
	
	@FindBy ( xpath = "//div[@aria-label='Account']")     //(//div[@role='button'])[3]
	private WebElement accountLogo;
	
	@FindBy ( xpath = "//span[text()='Log Out']")
	private WebElement logout ;
	
	private WebDriver driver ;
	private Actions actions;
	
	public LogOutFaceBook(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		actions = new Actions(driver);
	}
	
	public void clickOnAccountLogo() {
//		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(addr.get(0));
//		System.out.println(driver.getCurrentUrl());	
		accountLogo.click();
	}
	
	public void clickOnLogout() {
		actions.moveToElement(logout).click().build().perform();
	}

}
