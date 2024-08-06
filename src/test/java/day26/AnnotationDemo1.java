package day26;

// How to use @BeforeMethod & @AfterMethod


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationDemo1 {
	
	@BeforeMethod
	void login()
	{
		System.out.println("Login");
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("search");
	}

	@Test(priority=2)
	void advancesearch()
	{
		System.out.println("advance search");
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("logout");
	}
}

/* o/p are given below
   Login
   search
   logout
   Login
   advance search
   logout
 */

