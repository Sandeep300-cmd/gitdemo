package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {

	
	@Test(dependsOnMethods={"websigninHomeloan"})
	public void webloginHomeloan()
	{
		//Selenium
		System.out.println("webloginHomeloan");
	}
	
	@Parameters({"URL"})
	@Test
	public void websigninHomeloan(String Urlname)
	{
		//Selenium
		System.out.println(Urlname);
		System.out.println("signinHomeloan");
	}
	
	@Test
	public void MobileLogInHomeLoan()
	{
		//Appium
		System.out.println("MobileLogInHomeLoan");
	}
	
	@Test
	public void LoginApiCarLoan()
	{
		System.out.println("LoginApiHome");
	}
}
