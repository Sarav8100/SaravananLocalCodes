package TestNGConcepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsExample {
		
		String name = "Agni";
		boolean value= false;
		
		@Test	
		public void checkEqual() {
			/*
			 * if(name.equals("Agni")) { System.out.println("Name is equal"); }else {
			 * System.out.println("Name is NOT equal"); }
			 */
			
			Assert.assertEquals(name, "Agni");
			Assert.assertTrue(value, "This should not be true");
			
	}
		
		
	
		
		

}
