package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day3 {
	
		@BeforeClass
		public void beforeclass ()
		{
			System.out.println("Before executing any method in the class");
		}
	
		@Test
		public void webloginCarLoan()
		{
			System.out.println("Web Login Car");
		}
		
		@Test(groups = ("Smoke"))
		public void MobileLoginCarLoan ()
		{
			System.out.println("Mobile Login Car");
		}
		
		@AfterClass
		public void afterclass()
		{
			System.out.println("After executing any method in the class");
		}
		
		
		@BeforeMethod
		public void beforeevery()
		{
			System.out.println("I will execute before every test method in day 3 class");
		}
		
		@AfterMethod
		public void afterevery ()
		{
			System.out.println("I will execute after every test method in day 3 class");
		}
		
		
		@Test(enabled=false)  // Enabled - I dont want to run this particular methods bcoz i knew already in this methods has bug
		public void MobileSigninCarLoan ()
		{
			System.out.println("Mobile Signin");
		}
		
		@BeforeSuite 
		public void BfSuite ()
		{
			System.out.println("I am no : 1");
		}
		
		@Test
		public void MobileSignoutCarLoan ()
		{
			System.out.println("Mobile Signout");
		}
		
		
		@Test(dependsOnMethods = ("webloginCarLoan")) //Depends - First execute this "webloginCarLoan" then only execute "ApicarLoan"
		public void ApicarLoan ()
		{
			System.out.println("Api Login Car");
		}
		

}
