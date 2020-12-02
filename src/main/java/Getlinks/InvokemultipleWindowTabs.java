package Getlinks;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;

public class InvokemultipleWindowTabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		//driver.switchTo().new Window(WindowType.TAB);
		Set <String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
	String parentWindow=it.next();
	String childWindow=it.next();
	driver.switchTo().window(childWindow);
	}

}
