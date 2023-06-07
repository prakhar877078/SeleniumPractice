package practiceofselenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowsPopupHandle1 {

	public static void main(String[] args) throws InterruptedException {


		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		driver.findElement(By.id("newTabsBtn")).click();
		Set<String>handles = driver.getWindowHandles();
		Iterator<String>it = handles.iterator();
		
		String parentwindowid = it.next();
		System.out.println("parent window id is :"+parentwindowid);
		
		String childwindowid_1 = it.next();
		System.out.println("child window id 1 is :"+childwindowid_1);
		
		String childwindowid_2 = it.next();
		System.out.println("child window id 2 is :"+childwindowid_2);
		
		driver.switchTo().window(childwindowid_1);
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(3000);
		
		driver.switchTo().window(parentwindowid);
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(3000);
		
		driver.switchTo().window(childwindowid_2);
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(3000);
		
		driver.switchTo().window(parentwindowid);
		System.out.println(driver.getCurrentUrl());
		
		
	}

}
