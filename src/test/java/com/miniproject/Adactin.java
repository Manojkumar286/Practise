package com.miniproject;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Manoj\\eclipse-workspace\\Selenium_Project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/search?q=adactin+hotel+reservation&oq=&aqs=chrome.0.35i39i362j69i59i450l7.710258121j0j15&sourceid=chrome&ie=UTF-8");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//h3[text()='Adactin.com - Hotel Reservation System']")).click();
		driver.findElement(By.id("username")).sendKeys("Hieveryone");
		driver.findElement(By.name("password")).sendKeys("Hi@123");
		driver.findElement(By.xpath("//input[@class='login_button']")).click();
		Select a = new Select(driver.findElement(By.cssSelector("[name='location']")));
		a.selectByVisibleText("Los Angeles");
		Select b = new Select(driver.findElement(By.cssSelector("#hotels")));
		b.selectByVisibleText("Hotel Sunshine");
		Select c = new Select(driver.findElement(By.cssSelector("[name='room_type']")));
		c.selectByVisibleText("Double");
		Select d = new Select(driver.findElement(By.xpath("//select[@id='room_nos']")));
		d.selectByValue("1");
		driver.findElement(By.xpath("//input[@id='datepick_in']")).sendKeys("26/11/2022");
		driver.findElement(By.xpath("//input[@id='datepick_out']")).sendKeys("27/11/2022");
		Select e = new Select(driver.findElement(By.id("adult_room")));
		e.selectByValue("1");
		Select f = new Select(driver.findElement(By.id("child_room")));
		f.selectByValue("0");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("first_name")).sendKeys("Kumar");
		driver.findElement(By.id("last_name")).sendKeys("Moorthy");
		driver.findElement(By.id("address")).sendKeys("4th avenue ,anna nagar ,chennai.");
		driver.findElement(By.id("cc_num")).sendKeys("9876543211234567");
		Select g = new Select(driver.findElement(By.xpath("//select[@name='cc_type']")));
		g.selectByVisibleText("VISA");
		Select h = new Select(driver.findElement(By.xpath("//select[@name='cc_exp_month']")));
		h.selectByVisibleText("July");
		Select i = new Select(driver.findElement(By.xpath("//select[@name='cc_exp_year']")));
		i.selectByVisibleText("2022");
		driver.findElement(By.id("cc_cvv")).sendKeys("456");
	    driver.findElement(By.id("book_now")).click();
	    Thread.sleep(5000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File aa = ts.getScreenshotAs(OutputType.FILE);
		File bb = new File("C:\\Users\\Manoj\\eclipse-workspace\\Selenium_Project\\Screen\\Booking.png");
		FileUtils.copyFile(aa, bb);
	    driver.findElement(By.id("logout")).click();
	
	
	
	
	}
}
