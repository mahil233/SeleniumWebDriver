package day26;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertion
{

	//scenario-1
	
	void test_hardassertions()
	{
		System.out.println("testing...........");
		System.out.println("testing...........");
		System.out.println("testing...........");
		System.out.println("testing...........");
		
		Assert.assertEquals(1,2); //if assertion is failed then rest of statement will not executed in hard assertion
		System.out.println("Hard assertions completed");
	}
	
	//scenario-2
	
	void test_softassertions()
	{

		System.out.println("testing...........");
		System.out.println("testing...........");
		System.out.println("testing...........");
		System.out.println("testing...........");
		
		//to access soft assertions, we create object of Soft Assert
		SoftAssert sa=new SoftAssert();
		
		sa.assertEquals(1, 2); //if assertion is failed then rest of statement will be executed in soft assertion
		System.out.println("Soft assertions completed");
		sa.assertAll(); //Mandatory required at end of script
	}
	
	
	
	
	
	
}
