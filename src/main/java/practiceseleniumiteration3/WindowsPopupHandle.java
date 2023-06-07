package practiceseleniumiteration3;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsPopupHandle {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String>handles = driver.getWindowHandles();
		Iterator<String>it = handles.iterator();
		
		String parentWindowId = it.next();
		System.out.println(parentWindowId);

		String childWindowId = it.next();
		System.out.println(childWindowId);
		
		driver.switchTo().window(childWindowId);
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getCurrentUrl());


	}

}
