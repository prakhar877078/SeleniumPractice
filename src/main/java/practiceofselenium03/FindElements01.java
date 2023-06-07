package practiceofselenium03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements01 {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		List<WebElement>imgurl = driver.findElements(By.tagName("img"));
		System.out.println(imgurl.size());
		
		for(int i=0; i<imgurl.size(); i++) {
			String url = imgurl.get(i).getAttribute("src");
			System.out.println(url);
		}
	}

}
