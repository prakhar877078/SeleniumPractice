package practiceofselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class GetDropdownValues {

	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.facebook.com/signup");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		getvaluesfromdropdown(day);
		getvaluesfromdropdown(month);
		getvaluesfromdropdown(year);

		
	}
	
	/**
	 * this method is used to read values from a dropdown
	 * @param element
	 */
	public static void getvaluesfromdropdown(WebElement element) {
		Select select = new Select(element);
		List<WebElement>droplist = select.getOptions();
		
		System.out.println(droplist.size());
		
		for(int i=0; i<droplist.size(); i++) {
			String text = droplist.get(i).getText();
			System.out.println(text);
		}
	}

}
