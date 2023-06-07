package practiceofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionEvents {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		
		driver.get("https://app.hubspot.com/login");
		
        Thread.sleep(5000);
		
		WebElement emailId = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("loginBtn"));
		
		Actions action = new Actions(driver);
		
		action.sendKeys(emailId, "abc@gmail.com").build().perform();
		action.sendKeys(password, "Test@123").build().perform();
		action.click(loginButton).build().perform();


		
	}

}
