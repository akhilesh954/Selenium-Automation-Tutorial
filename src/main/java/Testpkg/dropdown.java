package Testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://book.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("div#divpaxinfo.paxinfo")).click();
		Select s=new Select(driver.findElement(By.xpath("//select[@class='wMed1s required guests']")));
		s.selectByValue("6");
		//s.selectByIndex(4);
		//s.selectByVisibleText("2 adults");
		System.out.println(driver.findElement(By.cssSelector("div#divpaxinfo.paxinfo")).getText());
}
}


/*driver.findElement(By.id("divpaxinfo")).click();

Thread.sleep(2000L);

int i=1;

while(i<5)

{

driver.findElement(By.id("hrefIncAdt")).click();//4 times

i++;

}

System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

for(int i=1;i<5;i++)

{

driver.findElement(By.id("hrefIncAdt")).click();

}

driver.findElement(By.id("btnclosepaxoption")).click();

Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

System.out.println(driver.findElement(By.id("divpaxinfo")).getText();*/