package Test;

import org.testng.annotations.AfterTest;

import org.testng.annotations.Test;

public class Day1 {

	@Test(groups={"Smoke"})
	public void Demo()
	{
		
	System.out.println("Hello");

	}
	
	@AfterTest
	public void lastExcecute()
	{
		
	System.out.println("I Will Execute last");

	}
	
	
	@Test
	public void secondTest()
	{
		
	System.out.println("bye");

	}

}
