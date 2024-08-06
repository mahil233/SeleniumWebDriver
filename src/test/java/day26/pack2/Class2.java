package day26.pack2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Class2 
{

	@Test
	void XYZ()
	{
		System.out.println("This is xyz from class 2");
	}
	
	@AfterTest
	void n()
	{
		System.out.println("This is after test method");
	}
}
