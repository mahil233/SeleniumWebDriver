package day26.pack1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {
	
	@Test
	void abc()
	{
		System.out.println("This is abc from class 1");
	}
	
	@BeforeTest
	void m()
	{
		System.out.println("This is before test method...");
	}

}

/* O/P-
This is before test method...
This is xyz from class 2
This is abc from class 1
This is after test method
This is before test method...
This is xyz from class 2
This is abc from class 1
This is after test method
 
 */
