package practiceofselenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverBasic2 {

	public static void main(String[] args) {


		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.udemy.com/");
	}

}
