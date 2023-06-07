package practiceseleniumiteration2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowsPopupHandle {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://demo.guru99.com/popup.php");
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String>handles = driver.getWindowHandles();
		Iterator<String>it = handles.iterator();
		String parentwindowid = it.next();
		
		System.out.println(parentwindowid);
		
		String childwindowid = it.next();
		
		System.out.println(childwindowid);
		
		Thread.sleep(2000);
		
		driver.switchTo().window(parentwindowid);
		
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(2000);
		
		driver.switchTo().window(childwindowid);
		
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(2000);
		
        driver.switchTo().window(parentwindowid);
		
		System.out.println(driver.getCurrentUrl());
		
		
		

		
	}

}
