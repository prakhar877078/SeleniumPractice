package headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessBrowser {

	public static void main(String[] args) {

		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(co);
		
		driver.get("https://cpanel.grab.in/Admin/index");
		System.out.println(driver.getTitle());
		
		FirefoxOptions fo = new FirefoxOptions();
		fo.addArguments("--headless");
		WebDriver driver1 = new FirefoxDriver(fo);
		
		driver.get("https://cpanel.grab.in/Admin/index");
		
		System.out.println(driver.getCurrentUrl());
	}

}
