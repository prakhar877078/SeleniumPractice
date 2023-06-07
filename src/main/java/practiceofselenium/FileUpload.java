package practiceofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileUpload {

	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://demo.guru99.com/test/upload/");
		
		driver.findElement(By.name("uploadfile_0")).sendKeys("C:\\Users\\Admin\\Desktop\\Day7.txt");
		driver.findElement(By.id("submitbutton")).click();
		

		
	}

}
