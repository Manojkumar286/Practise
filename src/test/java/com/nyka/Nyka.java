package com.nyka;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import insta.com.baseclass.Baseclass;

public class Nyka extends Baseclass {
	@Test
	private void Product_select() throws InterruptedException {
		browserLaunch("chrome");
		getUrl("https://www.nykaa.com/");
		elementsendkeys(driver.findElement(By.xpath("//input[@placeholder='Search on Nykaa']")), "Handwash\n");
		elementclick(driver.findElement(By.xpath("//div[@class='css-xrzmfa']")));
		switchtowindow(
				"Palmolive Naturals Black Orchid & Milk Hand Wash, Removes 99.9% Germs: Buy Palmolive Naturals Black Orchid & Milk Hand Wash, Removes 99.9% Germs Online at Best Price in India | Nykaa");
		elementclick(driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")));
		elementclick(driver.findElement(By.xpath("//button[@class='css-g4vs13']")));
		WebElement findElement = driver
				.findElement(By.xpath("//iframe[@src='/mobileCartIframe?ptype=customIframeCart']"));
		driver.switchTo().frame(findElement);
		elementclick(driver.findElement(By.xpath("//p[@data-test-id='select-quantity']")));
		elementclick(driver.findElement(By.xpath("(//div[@class='css-bfwsku'])[1]")));
		Thread.sleep(3000);
		elementclick(driver.findElement(By.xpath("(//button[@class='css-guysem e8tshxd0'])[2]")));
		elementclick(driver.findElement(By.xpath("//button[@class='css-v61n2j e8tshxd0']")));
		elementclick(driver.findElement(By.xpath("//div[@class='form-field-plain login-wrap']")));
		elementsendkeys(driver.findElement(By.xpath("//input[@name='emailMobile']")), "9677165561\n");
		Scanner s = new Scanner(System.in);
		System.out.println("enter otp"); 
		String nextLine = s.nextLine();
		System.out.println(nextLine);
		elementsendkeys(driver.findElement(By.xpath("//input[@name='otpValue']")), nextLine);
		elementclick(driver.findElement(By.xpath("//button[@type='submit']")));
		elementclick(driver.findElement(By.xpath("//button[@class='css-n7wnfc e8tshxd0']")));
	}
}
