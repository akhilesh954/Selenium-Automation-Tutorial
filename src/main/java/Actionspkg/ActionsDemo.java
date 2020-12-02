package Actionspkg;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		// move to specific element
		a.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList"))).build().perform();
		
		WebElement move=driver.findElement((By.cssSelector("#nav-link-accountList")));
		
		//right click on any element by automation
		a.moveToElement(move).contextClick().build().perform();
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("LED TV");
		
		//send in capital letter
		
	
		
		a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("led small tv").build().perform();
		
		//Select all item by double click by using actions class
		
		a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("Televison").doubleClick().build().perform();

	
	}
	
	

}
