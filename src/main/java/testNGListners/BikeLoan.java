package testNGListners;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BikeLoan {
	
@Test

	public void NewCarLoan()
	{
	System.out.println("New Car");

	}

	@Test(enabled=true)
	public void OldCarLoan()
	{
		System.out.println("Old Car");
		
	}
	@Parameters({"URL", "UserName"})
	@Test
	
	public void RentedCarLoan(String urlname, String Keys )
	{
		
		System.out.println("Rented Car");
		System.out.println(urlname);
		System.out.println(Keys);
		
		
	}
   @Test
	
	public void ReselCarLoan()
	{
		System.out.println("Resel Car");
		
	}
	}

