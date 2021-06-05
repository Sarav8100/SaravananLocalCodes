package TestNGConcepts;

import org.testng.annotations.Test;

public class DriveACar {
	
		//Requirement - Once car is there, 1st you have to start, 2nd Then move, 3rd change the gear and move to 80kmh
		
		@Test(priority=0)
		public void startTheCare() {
			System.out.println("Start the car");
		}
		@Test(priority=1)
		public void putFirstGear () {
			System.out.println("First Gear");
		}
		@Test(priority=2)
		public void putSecondGear () {
			System.out.println("Second Gear");
		}
		@Test(priority=3)
		public void putThirdGear() {
			System.out.println("Third Gear");
		}
		@Test(priority=4)
		public void putFourthGear() {
			System.out.println("Fourth Gear");
		}
		
		
		
}
