package day28;

import org.testng.annotations.Test;

public class InvocationCountDemo 
{

	//want to execute test method 10 times
	@Test(invocationCount=10)
	void test()
	{
		System.out.println("testing....");
	}
}
