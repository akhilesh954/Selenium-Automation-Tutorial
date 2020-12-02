package Testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://book.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='select_CTXT']")).click();
		driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[10]/a")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();// use indexing value to locate particular element
		
		driver.findElement(By.xpath("//*[@id=\'ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1\']//a[@value='HYD']")).click();// alternate way to select child xpath without using indexing value by parent child relationship

		//Select s=new Select(driver.findElement(By.xpath("//select[@class='wMed1s required guests']")));
		//s.selectByValue("6");
		//s.selectByIndex(4);
		//s.selectByVisibleText("2 adults");
		//System.out.println(driver.findElement(By.cssSelector("div#divpaxinfo.paxinfo")).getText());
	}

}
