package practiceseleniumiteration3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUsingSystemSetProp {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\MultipleD\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.facebook.com");

		
	}

}
