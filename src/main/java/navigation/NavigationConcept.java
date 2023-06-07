package navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcept {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://cpanel.grab.in/Admin/index");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
        driver.navigate().forward();
		System.out.println(driver.getTitle());

	}

}
