package practiceseleniumiteration2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle {

	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.facebook.com/signup");
		
		WebElement Day = driver.findElement(By.id("day"));
		WebElement Month = driver.findElement(By.id("month"));
		WebElement Year = driver.findElement(By.id("year"));
		
	    Select select = new Select(Day);
	    select.selectByVisibleText("26");
	    
	    Select select1 = new Select(Month);
	    select1.selectByVisibleText("Dec");
	    
	    Select select2 = new Select(Year);
	    select2.selectByVisibleText("1994");
	    
	    driver.quit();

	}

}
