package practiceofselenium03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.findElement(By.name("uploadfile_0")).sendKeys("C:\\Users\\Admin\\Desktop\\others.txt");
		driver.findElement(By.name("send")).click();

		
	}

}
