package Testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://www.google.com/");
driver.findElement(By.xpath("//*[@id=\'tsf\']/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Akhilesh");
driver.manage().window().maximize();

System.out.println(driver.getTitle());
//driver.wait(5);
 //System.out.println(driver.getTitle());
 System.out.println(driver.getCurrentUrl());
 //System.out.println(driver.getPageSource());

//driver.get("https://yahoo.com");
//driver.navigate().back();
 //driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("akhilesh954@gmail.com");
 //driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("AKH(9892509231)");
 //driver.findElement(By.xpath("//*[@id=\'u_0_b\']")).click();
 //driver.switchTo().frame("0");                                                                                                                                                                               
 //driver.findElement(By.xpath("//*[@id=\'mount_0_0\']/div/div[1]/div[1]/div[2]/div[4]/div[1]/span/div/div[1]/div")).click();

//driver.close();
	}

}
