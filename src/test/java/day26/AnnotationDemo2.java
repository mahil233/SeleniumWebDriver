package day26;

// How to use @BeforeClass & @AfterClass

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationDemo2 {

	
		
		@BeforeClass
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
		
		@AfterClass
		void logout()
		{
			System.out.println("logout");
		}
	}

	//o/p:-
    /* Login
       search
       advance search
       logout 
     */


