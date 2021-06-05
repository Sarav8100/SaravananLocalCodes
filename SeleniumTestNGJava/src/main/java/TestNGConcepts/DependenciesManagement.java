package TestNGConcepts;

import org.testng.annotations.Test;

public class DependenciesManagement {

	
		//Problem1 : You have to Admit a student to Enginnering
		//Problem2 : You have to Admit a student to Higher Secondary
		
		@Test(enabled = true)
		public void highSchool() {
			System.out.println("High School");
		}
		@Test(dependsOnMethods = "highSchool")
		public void higherSecondary() {
			System.out.println("Higher Secondary");
		}
		@Test(dependsOnMethods = "higherSecondary")
		public void engineering() {
			System.out.println("College");
		}
		
		@Test
		public void sarav() {
			
		}
		
		
}
