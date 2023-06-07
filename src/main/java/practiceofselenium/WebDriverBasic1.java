package practiceofselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverBasic1 {

public static void main(String[] args) {

        //WebDriver driver;
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prakhar Pandey\\Downloads\\Driver\\chromedriver.exe");
//WebDriver driver = new ChromeDriver();
//driver.get("https://www.udemy.com/");

      //  ChromeOptions option = new ChromeOptions();
       // option.addArguments("--remote-allow-origins=*");

        //WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
        driver.get("https://www.udemy.com/");
}

}