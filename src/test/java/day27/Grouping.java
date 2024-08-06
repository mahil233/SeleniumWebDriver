package day27;

import org.testng.annotations.Test;

/*
 loginByEmail    -sanity & regression
 loginByFacebook -sanity
 loginByTwitter  -sanity
 
 signupbyemail -sanity & regression-
 signupbyfacebook-regression
 signupbytwitter-regression
 
 paymentindollar -sanity & regression
 paymentinrupeess -sanity
 paymentreturnbybank -regression
 
 */

public class Grouping 
{
	      //this method comes under both groups sanity & regression
	
	      @Test(priority=1, groups= {"sanity","regression"})
          void loginByEmail()
          {
        	  System.out.println("This is login by email");
          }
	      
	      
          
	      @Test(priority=2, groups= {"sanity"})
          void loginByFacebook()
          {
        	  System.out.println("This is login by facebook");
          }
	      
	      
	      
          
	      @Test(priority=3, groups={"sanity"})
          void loginByTwitter()
          {
        	  System.out.println("This is login by twitter");
          }
          
	      
	      
	      @Test(priority=4, groups= {"sanity", "regression"})
          void signUpByEmail()
          {
        	  System.out.println("Sign up by email");
          }
          
	      
	      
	      @Test(priority=5,groups= {"regression"})
          void signUpByFacebook()
          {
        	  System.out.println("Sign up by facebook");
          }
          
	      
	      
	      @Test(priority=6, groups= {"regression"})
          void signUpByTwitter()
          {
        	  System.out.println("Sign up by twitter");
          }
          
	      
	      
	      @Test(priority=7,groups= {"sanity","regression"})
          void paymentindollar()
          {
        	  System.out.println("This is payment by dollar method");
          }
          
	      
	      
	      @Test(priority=8, groups={"sanity"})
          void paymentinrupees()
          {
        	  System.out.println("This is payment by rupees method");
          }
          
	      
	      
	      @Test(priority=9, groups= {"regression"})
          void paymentReturnByBank()
          {
        	  System.out.println("Payment return by bank");
          }
}
