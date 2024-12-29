package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {

	
	@Test
	public void ploan()
	{
		System.out.println("good");
	}
	
	@Test(groups={"Smoke"})
	public void webloan()
	{
		System.out.println("How are you");
		
	}
	
	@BeforeMethod
	public void Bf()
	{
		System.out.println("Before every method in Day2");
	}
	
	@AfterMethod
	public void Af()
	{
		System.out.println("After every method in Day2");
	}
	
	
	
	@BeforeTest
	public void prerequistic()
	{
		
	System.out.println("I Will Execute First");

	}
	
	@AfterSuite
	public void Afsuite()
	{
		System.out.println("I am always last to run");
	}
	
	
}
