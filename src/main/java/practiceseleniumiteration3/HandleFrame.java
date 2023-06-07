package practiceseleniumiteration3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrame {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		driver.switchTo().frame("main");
		WebElement text = driver.findElement(By.cssSelector("body h3:nth-child(1)"));
		System.out.println(text.getText());
		
		driver.switchTo().defaultContent();

		
	}

}
