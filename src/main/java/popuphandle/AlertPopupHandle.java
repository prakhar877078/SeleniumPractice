package popuphandle;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("12345");
		driver.findElement(By.name("submit")).click();
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(5000);
		
		alert.accept();
		
		Thread.sleep(5000);
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		
	}

}
