package practiceseleniumiteration2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {

	public static void main(String[] args) {


		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(co);
		
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		
	}

}
