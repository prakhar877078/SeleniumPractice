package practiceseleniumiteration2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AuthPopupHandle {

	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(co);
		
		String uname = "admin";
		String pwd = "admin";
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
		

		
	}

}
