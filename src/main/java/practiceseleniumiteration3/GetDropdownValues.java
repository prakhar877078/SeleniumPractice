package practiceseleniumiteration3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetDropdownValues {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		getDropdownValues(day);
		getDropdownValues(month);
		getDropdownValues(year);


		
	}
	
	public static void getDropdownValues(WebElement element) {
		Select select = new Select(element);
		List<WebElement>list = select.getOptions();
		
		for(int i=0; i<list.size(); i++) {
			String text = list.get(i).getText();
			System.out.println(text);
		}
	}

}
