package testNGDataProvider;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BikeLoan {
	
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
	@Test(dataProvider="getData")

	public void RentedCarLoan(String UserName, String Password)
	{
		
		System.out.println("Rented Car");
		System.out.println( UserName);
		System.out.println(Password);
	}
   @Test
	
	public void ReselCarLoan()
	{
		System.out.println("Resel Car");
		
	}
   @DataProvider
	   public Object[][] getData()
	   {
	   //1. Pass 1st user name and pwd
	   //2. Pass 2nd user name and pwd
	   //3. Pass 3 user name and pwd
	   Object[][] data = new Object[3][2];
	   
	   // 1st Set data
	   data[0][0]="userName";
	   data[0][1]="Password";
	   // 2nd Set data
	   data[1][0]="userName";
	   data[1][1]="Password";
	   
	  //3r set data
	   data[2][0]="userName";
	   data[2][1]="Password";
	   return data;
   }
}


