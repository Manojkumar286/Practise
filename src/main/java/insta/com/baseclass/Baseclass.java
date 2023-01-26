package insta.com.baseclass;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;

	public static void browserLaunch(String option) {
		if (option.equals("chrome")) {
			//System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resource\\driver\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (option.equals("edge")) {
			//System.setProperty("webdriver.edge.driver", ".\\src\\test\\resource\\driver\\msedgedriver.exe");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		window_max();
	}

		public static void window_max() {
			driver.manage().window().maximize();
		}
		
		public static void getUrl(String Url) {
			driver.get(Url);
		}
		
		public static void elementsendkeys(WebElement element,String value) {
			element.sendKeys(value);
		}
		
		public static void elementclick(WebElement element) {
			element.click();
		}
		
		public static boolean isdisplayed(WebElement element) {
			boolean displayed = false;
			try {
				 displayed = element.isDisplayed();
			} catch (Exception e) {
				
			}
			return displayed;
		}
		
		public static String gettext(WebElement element) {
			String text=null;
			try {
				 text = element.getText();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return text;
		}
		
		public static void mousehover(WebElement element) {
			try {
				Actions a = new Actions(driver);
				a.moveToElement(element).build().perform();
			} catch (Exception e) {

			}
		}
		
		public static void dropdown(WebElement element,String option,String i) {
			Select s=new Select(element);
			if (option.equalsIgnoreCase("value")) {
				s.selectByValue(i);
			}else if (option.equalsIgnoreCase("text")) {
				s.selectByVisibleText(i);
			}else if (option.equalsIgnoreCase("index")) {
				s.selectByIndex(Integer.parseInt(i));
			}
		}
		
		public static void switchtowindow(String titlename) {
			Set<String> windowHandles = driver.getWindowHandles();
			for (String string : windowHandles) {
				String title = driver.switchTo().window(string).getTitle();
				if (titlename.equalsIgnoreCase(title)) {
					break;
				}
			}
		}
		
		public static void threadsleepforsec(int sec) throws InterruptedException {
			TimeUnit.SECONDS.sleep(sec);
		}
		
		public static void quit() {
			driver.quit();
		}
		
		
		
		
		
		
}
