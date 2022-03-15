package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFaceBook {
	
	@FindBy ( xpath = "//input[@id='email']")  //email
	private WebElement emailId ;  
	
	@FindBy ( xpath = "//input[@type='password']")  //password
	private WebElement password ;
	
	@FindBy ( xpath = "//button[text()='Log In']")  //loginbutton
	private WebElement login ;
	
	@FindBy ( xpath = "//div[@id='u_0_p_BH']")    //password button
	private WebElement passEyeButton ;
	
	
	public LoginPageFaceBook(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void sendEmailId() {
		emailId.sendKeys("tushar.more35@gmail.com");
	}
	
	public void sendPassword() {
		password.sendKeys("Tushar@2731");
	}
	
	public void clickOnLoginButton() {
		login.click();
	}


}
