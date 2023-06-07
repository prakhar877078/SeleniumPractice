package practiceofselenium03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		List<WebElement>linklist = driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
		
		for(int i=0; i<linklist.size(); i++) {
			String text = linklist.get(i).getText();
			System.out.println(text);
		}

	}

}
