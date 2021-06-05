package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	
	
		@Test(groups = ("Smoke"))
		public void ploan ()
		{
			System.out.println("Good");
		}
		
		@BeforeTest
		public void prerequisite ()
		{
			System.out.println("I will execute first");
		}
		
		
		

}
