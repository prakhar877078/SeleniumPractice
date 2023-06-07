package practiceofselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//total links on the page
public class FindElements2 {

	public static void main(String[] args) {


		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.amazon.in");
		
		List<WebElement>linklist = driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
		
		for(int i = 0; i < linklist.size(); i++) {
			String text = linklist.get(i).getText();
			System.out.println(text);
		}
	}

}
