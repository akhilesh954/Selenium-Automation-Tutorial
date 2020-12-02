package Getlinks;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkverification {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
	    	
	    	 driver.get("http://qaclickacademy.com/practice.php");
	    	 driver.manage().window().maximize();
	    	 //1. working Link verification
	    //String url=driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
	    
	    //2. working Link verification
	    	 
	    //String url=driver.findElement(By.cssSelector("a[href*='https://www.udemy.com']")).getAttribute("href");
	    
	    //3. Braking link verification
	    
	    	 String url=driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
	    
	  HttpsURLConnection conn=(HttpsURLConnection)new URL(url).openConnection();
	  conn.setRequestMethod("HEAD");
	  conn.connect();
	  int respCode=conn.getResponseCode();
	  System.out.println(respCode);
	    
	  // this is non broken link
	    	 
	}

}
