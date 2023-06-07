package practiceofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleFrame {

	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		driver.switchTo().frame("main");
		WebElement text = driver.findElement(By.cssSelector("body h3:nth-child(1)"));
		System.out.println(text.getText());
		
		driver.switchTo().defaultContent();

		
	}

}
