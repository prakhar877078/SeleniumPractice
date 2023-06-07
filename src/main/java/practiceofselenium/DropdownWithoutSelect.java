package practiceofselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DropdownWithoutSelect {

	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("-remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		
		driver.get("https://www.facebook.com/signup");
		String day = "//select[@id = 'day']/option";
		String month ="//select[@id = 'month']/option";
		String year = "//select[@id = 'year']/option";
		
		selectDropdownValueWithoutUsingSelect(driver,day,"11");
		selectDropdownValueWithoutUsingSelect(driver,month,"Oct");
		selectDropdownValueWithoutUsingSelect(driver,year,"1994");



	}
	
	/**
	 * this method is used to select dropdown value without using select class
	 * @param driver
	 * @param locator
	 * @param value
	 */
	public static void selectDropdownValueWithoutUsingSelect(WebDriver driver1, String locator, String value ) {
		
		List<WebElement>list = driver1.findElements(By.xpath(locator));
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
