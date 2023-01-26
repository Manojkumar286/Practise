package insta.com.stepdefinition;

import org.junit.Assert;

import Pageobjectmanager.pageobjectmanager;
import insta.com.baseclass.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Insta_Steps extends Baseclass {
	pageobjectmanager pom = new pageobjectmanager(driver);

	@Given("User enter browser launch")
	public void user_enter_browser_launch() {
		browserLaunch("edge");

	}

	@Given("User get url")
	public void user_get_url() {
		getUrl("https://www.facebook.com/");

	}

	@Given("User verify land on loginpage")
	public void user_verify_land_on_loginpage() {
		Assert.assertTrue(isdisplayed(pom.getInstagram().Insta_logo));

	}

	@Given("User enter valid username")
	public void user_enter_valid_username() {
		elementsendkeys(pom.getInstagram().Username, "Manoj");

	}

	@Given("User enter valid password")
	public void user_enter_valid_password() {
		elementsendkeys(pom.getInstagram().Password, "Kumar@123");

	}

	@Then("User click login button")
	public void user_click_login_button() {
		elementclick(pom.getInstagram().Submit);

	}

}
