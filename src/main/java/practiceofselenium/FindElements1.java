package practiceofselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//total image on the page

public class FindElements1 {

	public static void main(String[] args) {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.amazon.in");
		List<WebElement>imagelist = driver.findElements(By.tagName("img"));
		System.out.println(imagelist.size());
		
		for(int i=0; i<imagelist.size(); i++) {
			String imgurl = imagelist.get(i).getAttribute("src");
			System.out.println(imgurl);
		}
	}

}
