package popuphandle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopUpHandle {

	public static void main(String[] args) {

        //https://the-internet.herokuapp.com/basic_auth		
		WebDriver driver = new ChromeDriver();
		
		String username = "admin";
		String password = "admin";
		
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
	}

}
