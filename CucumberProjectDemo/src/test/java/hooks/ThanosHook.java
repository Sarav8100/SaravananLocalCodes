package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ThanosHook {
	
		@Before
		public void beforeSnapping() {
			System.out.println("Thanos collecting the infinity stones");
		}

		@After
		public void afterSnapping() {
			System.out.println("After killing everyone, taking rest on Garden");
		}
		
}
