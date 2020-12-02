package Testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElements(By.xpath(" //input[@type='checkbox']")).size();
		System.out.println(driver.findElements(By.xpath(" //input[@type='checkbox']")).size());
		Assert.assertFalse(driver.findElement(By.xpath("//*[@id=\'checkBoxOption1\']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//*[@id=\'checkBoxOption1\']")).isSelected());
		driver.findElement(By.xpath("//*[@id=\'checkBoxOption1\']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\'checkBoxOption1\']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//*[@id=\'checkBoxOption1\']")).isSelected());
		driver.findElement(By.xpath("//*[@id=\'checkBoxOption1\']")).click();
		Assert.assertFalse(driver.findElement(By.xpath("//*[@id=\'checkBoxOption1\']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//*[@id=\'checkBoxOption1\']")).isSelected());
}


}
