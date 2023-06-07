package practiceseleniumiteration2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandleWithUtil {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.facebook.com/signup");
		
		WebElement Day = driver.findElement(By.id("day"));
		WebElement Month = driver.findElement(By.id("month"));
		WebElement Year = driver.findElement(By.id("year"));

		selectValuesFromDropDown(Day, "26");
		selectValuesFromDropDown(Month, "Dec");
		selectValuesFromDropDown(Year, "1994");

		Thread.sleep(2000);
		
		driver.quit();
		
	}

	public static void selectValuesFromDropDown(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
		
	}
	
}
