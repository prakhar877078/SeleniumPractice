package practiceseleniumiteration3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandlePart2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		selectFromDropDownUsingValue(day, "26");
		selectFromDropDownUsingValue(month, "Dec");
		selectFromDropDownUsingValue(year, "1994");

	}
	
	public static void selectFromDropDownUsingValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}

}
