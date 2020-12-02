package testNGConceptAnotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class HomeLoan {
	
	@BeforeClass
	public void BeforeClass()
	{
	System.out.println("BeforeClass execution");

	}

	@AfterClass
	public void AfterClass()
	{
	System.out.println("AfterClass execution");

	}

	@BeforeMethod
	public void NewPropertyLoan()
	{
	System.out.println("Fresh Home");

	}
	@AfterMethod
	public void OldPropertyLoan()
	{
		System.out.println("Old Home");
		
	}
	@AfterTest
	
	public void OldShopLoan()
	{
		System.out.println("Old Shop");
		
	}
	@Test
	
	public void NewShopLoan()
	{
		System.out.println("New Shop");
		
	}
	}

