package testNGDataProvider;

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
	
	@Test
	public void PayRent()
	{
		System.out.println("Pay Rent");
		
	}
	@Test
	
	public void PayLoan()
	{
		System.out.println("Pay Loan");
		
	}
}
