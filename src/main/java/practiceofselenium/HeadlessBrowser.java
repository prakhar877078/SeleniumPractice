package practiceofselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {

	public static void main(String[] args) {


		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--headless");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.udemy.com/");
	    System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.getTitle());

	}

}
