package testNGAnotationsGroups;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class HomeLoan {
	
	@Test
	public void BeforeClass()
	{
	System.out.println("BeforeClass execution");

	}

	@Test
	public void AfterClass()
	{
	System.out.println("AfterClass execution");

	}

	@Test
	public void NewPropertyLoan()
	{
	System.out.println("Fresh Home");

	}
	@Test
	public void OldPropertyLoan()
	{
		System.out.println("Old Home");
		
	}
	@Test(groups= {"smoke"})
	
	public void OldShopLoan()
	{
		System.out.println("Old Shop");
		
	}
	
	@Test(dependsOnMethods= {"NewPropertyLoan"})
	
	public void NewShopLoan()
	{
		System.out.println("New Shop");
		
	}
	}

