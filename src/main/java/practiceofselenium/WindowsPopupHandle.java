package practiceofselenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowsPopupHandle {

	public static void main(String[] args) {


		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://demo.guru99.com/popup.php");
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String>handles = driver.getWindowHandles();
		
		/*
		 * this will create one set object inside the memory, but it doesn't follow any
		 * order also Set doesn't stores any duplicate values.
		 */		
		
		Iterator<String>it = handles.iterator();
		String parentwindowid = it.next();
		
		System.out.println(parentwindowid);
		
		String childwindowid = it.next();
		System.out.println(childwindowid);
		
		driver.switchTo().window(childwindowid);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentwindowid);
		System.out.println(driver.getTitle());
	}

}
