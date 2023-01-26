package insta.com.locators;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import insta.com.baseclass.Baseclass;

public class Instagram extends Baseclass{

	public Instagram(WebDriver xdriver) {
		this.driver=xdriver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//img[@alt='Facebook']")
	public WebElement Insta_logo;
	
	@FindBy(name = "email")
	public WebElement Username;
	
	@FindBy(name = "pass")
	public WebElement Password;
	
	@FindBy(name = "login")
	public WebElement Submit;
}
