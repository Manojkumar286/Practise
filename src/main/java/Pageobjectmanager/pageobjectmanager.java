package Pageobjectmanager;

import org.openqa.selenium.WebDriver;

import insta.com.baseclass.Baseclass;
import insta.com.locators.Instagram;

public class pageobjectmanager extends Baseclass{
	
	public pageobjectmanager(WebDriver xdriver) {
	this.driver=xdriver;
	}
	
	private Instagram instagram;

	public Instagram getInstagram() {
		if (instagram==null) {
			instagram=new Instagram(driver);
		}
		return instagram;
	}
	
}
