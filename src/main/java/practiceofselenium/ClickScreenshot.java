package practiceofselenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClickScreenshot {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		getPageScreenShot(driver,"hubspot");
		
		WebElement email = driver.findElement(By.id("username"));
		WebElement pwd = driver.findElement(By.id("password"));
		
		getElementScreenShot(email, "email");
		
		getElementScreenShot(pwd, "pwd");

		

	}
	
	/**
	 * this method is used to take screenshot of the entire page.
	 * @param driver
	 * @param filename
	 */
	public static void getPageScreenShot(WebDriver driver, String filename) {
		File filesrc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(filesrc, new File("./target/screenshots/"+filename+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * this method is used to Screenshot of a single WebElement
	 * @param element
	 * @param filename
	 */
	public static void getElementScreenShot(WebElement element, String filename) {
		File srcfile = ((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcfile, new File("./target/screenshots/"+filename+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
