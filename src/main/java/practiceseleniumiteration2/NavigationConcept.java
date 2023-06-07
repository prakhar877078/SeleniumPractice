package practiceseleniumiteration2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NavigationConcept {

	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(co);
		driver.navigate().to("https://www.facebook.com/");
		
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		
		System.out.println(driver.getCurrentUrl());

		driver.navigate().forward();
		
		System.out.println(driver.getCurrentUrl());

		driver.quit();
		
		
	}

}
