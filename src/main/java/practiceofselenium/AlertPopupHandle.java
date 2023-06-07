package practiceofselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertPopupHandle {

	public static void main(String[] args) throws InterruptedException {


		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("12345");
		driver.findElement(By.name("submit")).click();
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(5000);
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(5000);
		System.out.println(alert.getText());
		alert.accept();
		
		
	}

}
