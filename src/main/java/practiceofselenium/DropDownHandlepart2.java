package practiceofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandlepart2 {

	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.facebook.com/signup");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		selectfromdropdownusingtext(day,"11");
		selectfromdropdownusingtext(month,"Oct");
		selectfromdropdownusingtext(year,"1994");


		
	}
	
	
	/**
	 * this method is used to select value from dropdown on the basis of visible text.
	 * @param element
	 * @param value
	 */
	public static void selectfromdropdownusingtext(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
	
	/**
	 * this method is used to select value from dropdown using index.
	 * @param element
	 * @param value
	 */
	public static void selectdropdownusingindex(WebElement element, int value) {
		Select select = new Select(element);
		select.selectByIndex(value);
	}

}
