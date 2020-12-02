package Getlinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTablegrid {

	public static void main(String[] args) {
		int sum=0;
		int i=0;
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver.exe");
		 
        WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
		WebElement table=driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int rowcount=driver.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-itms")).size();
		int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		for(i=0;i<count-2;i++)
		{
	  String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
	  int valueinteger= Integer.parseInt(value);
	  //System.out.println(value);
	 sum=sum+valueinteger;
	  //System.out.println(sum);
		}	
		String Extras=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int ExtrasValue=Integer.parseInt(Extras);
		System.out.println(Extras);
		int TotalSumValue=sum+ExtrasValue;
		System.out.println(TotalSumValue);
	}
}

//		WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
//		int rowcount= table.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-itms")).size();
//		int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
//
//		for(int i=0;i<count-2;i++)
//		{
//		String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
//		int valueinteger=  Integer.parseInt(value);
//		sum=sum+valueinteger;//103
//		}
//		//System.out.println(sum);
//
//		String Extras=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
//		int extrasValue=Integer.parseInt(Extras);
//		int TotalSumValue=sum+extrasValue;
//		System.out.println(TotalSumValue);
//
//
//		String ActualTotal=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
//		int ActualTotalVAlue=Integer.parseInt(ActualTotal);
//		if(ActualTotalVAlue==TotalSumValue)
//		{
//		System.out.println("Count Matches");
//		}
//		else
//		{
//		System.out.println("count fails");
//		}
//		}
//
//	}
//
