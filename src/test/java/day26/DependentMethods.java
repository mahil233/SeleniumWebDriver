package day26;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependentMethods 
{
	@Test(priority=1)
    void openapp()
    {
    	//if u want to make failure, intentionally we have to put some validations
		Assert.assertTrue(true);
    }
    
	//before executing login method,test NG will check this method (openapp) is pass or not
	//if openapp is pass then login method will execute otherwise login will be skip
	
	
	@Test(priority=2, dependsOnMethods={"openapp"})
    void login()
    {
		//it is basic assertion to make test method pass or fail
		Assert.assertTrue(false); //suppose if i want to make test method fail then we can pass false in argument
    	
    }
    
	
	
	@Test(priority=3, dependsOnMethods= {"login"})
    void search()
    {
		Assert.assertTrue(true);
    }
    
	
	//if both method(login, search) should be pass then advance search will execute). if one of them is failed then advsearch will skip
	
	@Test(priority=4, dependsOnMethods= {"login","search"})
    void advsearch()
    {
		Assert.assertTrue(true);
    }
	
	@Test(priority=5, dependsOnMethods={"login"})
	void logout()
	{
		Assert.assertTrue(true);
	}
	
}


/* search, advsearch, logout is skip or not executed because of dependency method
 * search is depend on login method & login is failed thats why search will skip
 * 
 * 
 * 
 * 
 * 
 * 
 */
