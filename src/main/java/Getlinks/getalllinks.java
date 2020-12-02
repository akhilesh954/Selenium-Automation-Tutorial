package Getlinks;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getalllinks {

	public static void main(String[] args) throws InterruptedException {
		//int i=1;
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.tagName("a")).size());
		
 //1. get the links in only footer section
		//driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]")).click();
		WebElement footterdriver=driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]"));
		//System.out.println(footterdriver.findElements(By.tagName("a")).size());
		
//2.  how to get links in particular section in the footer
		
//3.  WebElement coolumndriver=driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul"));
		WebElement coolumndriver=footterdriver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul"));
		System.out.println(coolumndriver.findElements(By.tagName("a")).size());
		
//4. How to click on each and every link		
		for(int i=1; i<coolumndriver.findElements(By.tagName("a")).size();i++);
		String clicklinks=Keys.chord(Keys.CONTROL,Keys.ENTER);
		int i = 1;
		coolumndriver.findElements(By.tagName("a")).get(i).sendKeys(clicklinks);
		Thread.sleep(4000L);
		
//5. Captured all opened tabs title 		
		
		Set<String> abc=driver.getWindowHandles();
		Iterator<String> it=abc.iterator();
		
		while(it.hasNext())
			{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			}
		
		
		
	}

}
