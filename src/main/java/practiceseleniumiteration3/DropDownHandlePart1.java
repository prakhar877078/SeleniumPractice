package practiceseleniumiteration3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandlePart1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select select = new Select(day);
		select.selectByVisibleText("26");
		
		Select select1 = new Select(month);
		select1.selectByVisibleText("Dec");
		
		Select select2 = new Select(year);
		select2.selectByVisibleText("1994");



		
	}

}
