package practiceseleniumiteration2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DropDownHandleUsingCustomMethod {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.facebook.com/signup");
		
		String Day = "//select[@id='day']/option";
		String Month = "//select[@id='month']/option";
		String Year = "//select[@id='year']/option";
		
		selectValuesFromDropDownWithoutSelect(driver, Day, "26");
		selectValuesFromDropDownWithoutSelect(driver, Month, "Dec");
		selectValuesFromDropDownWithoutSelect(driver, Year, "1994");
		
		Thread.sleep(2000);
		
		driver.quit();

		
	}
	
	public static void selectValuesFromDropDownWithoutSelect(WebDriver driver, String locator, String value) {
		List<WebElement>droplist = driver.findElements(By.xpath(locator));
		//droplist.size();
		
		for(int i=0; i<droplist.size(); i++) {
			String text = droplist.get(i).getText();
			System.out.println(text);
			
			if(text.equals(value)) {
				droplist.get(i).click();
				break;
			}
		}
		
	}

}
