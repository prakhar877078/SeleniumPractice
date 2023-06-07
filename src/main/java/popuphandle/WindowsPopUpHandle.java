package popuphandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsPopUpHandle {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentwindowid = it.next();
		
		System.out.println("Parent Window Id :"+parentwindowid);
		
		String childwindowid = it.next();
		
		System.out.println("Child Window Id :"+childwindowid);
		
		driver.switchTo().window(childwindowid);
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(parentwindowid);
		System.out.println(driver.getCurrentUrl());
		
	}

}
