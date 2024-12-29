package Test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Day3 {

	@Parameters({"URL"})
	@Test
	public void webloginCarloan(String Urlname)
	{
		//Selenium
		System.out.println("webloginCarloan");
		System.out.println(Urlname);
	}
	
	@Test
	public void MobileLogInCarLoan()
	{
		//Appium
		System.out.println("MobileLogInCarLoan");
	}
	
	@Test
	public void MobileSigninLoan()
	{
		//Appium
		System.out.println("MobileSigninLoan");
	}
	
	@Test
	public void MobileSignoutLoan()
	{
		//Appium
		System.out.println("MobileSignoutLoan");
	}
	@Test(groups={"Smoke"})
	public void LoginApiCarLoan()
	{
		//Restapiautomation
		System.out.println("LoginApiCar");
	}

	@BeforeSuite
	public void Bfsuite()
	{
		System.out.println("I am no 1");
	}




}
