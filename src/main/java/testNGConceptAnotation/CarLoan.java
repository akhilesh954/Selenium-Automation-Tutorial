package testNGConceptAnotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CarLoan {

	@Test
	public void NewCarLoan()
	{
	System.out.println("New Car");

	}
	@Test
	public void OldCarLoan()
	{
		System.out.println("Old Car");
		
	}
	@Test
	
	public void RentedCarLoan()
	{
		System.out.println("Rented Car");
		
	}
	@Test
	
	public void ReselCarLoan()
	{
		System.out.println("Resel Car");
		
	}
	}

