package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://cpanel.grab.in/Admin/index");
		
		System.out.println(driver.getTitle());
		driver.manage().window().fullscreen();
	}

}
