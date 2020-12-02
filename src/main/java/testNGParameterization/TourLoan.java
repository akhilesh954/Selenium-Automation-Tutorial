package testNGParameterization;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TourLoan {

	@Test
	public void PayCCBill()
	{
	System.out.println("Pay CC Bill");

	}
	@Test
	public void prerequvisit()
	{
		System.out.println("Am the first");
	}
	
	@Parameters({"URL", "UserName"})
	
	@Test
	public void PayRent(String urlName, String Keys)
	{
		System.out.println("Pay Rent");
		System.out.println(urlName);
		System.out.println(Keys);
	}
	@Test
	
	public void PayLoan()
	{
		System.out.println("Pay Loan");
		
	}
}
