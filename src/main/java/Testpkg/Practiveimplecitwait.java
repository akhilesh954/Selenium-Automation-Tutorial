package Testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practiveimplecitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\'content\']/a[2]")).click();
		WebDriverWait w=new WebDriverWait (driver,5);
		w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\'results\']"))));
		 System.out.println(driver.findElement(By.id("results")).getText());

	}

}
