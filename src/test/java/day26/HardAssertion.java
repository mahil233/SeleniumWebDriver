package day26;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
	
	/*
	@Test
	void test1()
	
	{
	
		int x=10;
		int y=10;
	
	
	
	//scenario 1-it will compare two values if both r equal then my test method pass otherwise fail
	Assert.assertEquals(x,y); //this assertion will make my test method pass if x & y value r equal
	}
	*/
		
	/*
	//scenario 2
	@Test
	void test2()
	{
	Assert.assertTrue(true);   //this assertion will pass my test method
	Assert.assertTrue(false); //this assertion will fail my test method
	}
	*/
	
	/*
	//scenario 3
	void test3()
	{
	int a=10;
	int b=20;
	
	//Syntax:-   assert.assertEquals(actual,equal,description) -if any failure happen we can write description in console window.
	Assert.assertEquals(a>b,true,"a is not greater than b");

	*/
	
	/*
	//scenario 4
	@Test
	void test4()
	{
	String s1="abc";
	String s2="abc1";
	
	//assert equal will pass if s1, s2 are equal
	Assert.assertEquals(s1,s2,"string are not equal"); 
	
	//assert not equal will pass if s1 & s2 are not equal
	Assert.assertNotEquals(s1, s2);
	}
	*/
	
	
	//scenario 5
	
	//assert along with if -else condition
	@Test
	void test5()
	{
	if(true) 
	{
		Assert.assertTrue(true); //if condition is true then this assertion will execute
	}
	
	else
	{
		//Assert.assertTrue(false); //if condition is false then this assertion will execute
		//or
		Assert.fail();
	}
	}
}
	
	
	

