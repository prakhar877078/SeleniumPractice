package practiceofselenium03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IcognitoBrowser {

	public static void main(String[] args) {
		
 
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.facebook.com/");
		
	}

}
