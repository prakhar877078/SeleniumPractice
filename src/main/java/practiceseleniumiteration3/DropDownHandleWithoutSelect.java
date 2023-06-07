package practiceseleniumiteration3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownHandleWithoutSelect {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		
		String day = "//select[@id = 'day']/option";
		String month ="//select[@id = 'month']/option";
		String year = "//select[@id = 'year']/option";
		
		selectFromDropdownWithoutUsingSelect(driver, day, "26");
		selectFromDropdownWithoutUsingSelect(driver, month, "Dec");
		selectFromDropdownWithoutUsingSelect(driver, year, "1994");


		
	}
	
	public static void selectFromDropdownWithoutUsingSelect(WebDriver driver, String locator, String value) {
		List<WebElement>list = driver.findElements(By.xpath(locator));
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++) {
			String text = list.get(i).getText();
			System.out.println(text);
			
			if(text.equals(value)) {
				list.get(i).click();
				break;
			}
		}
	}

}
