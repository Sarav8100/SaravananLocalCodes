	package stepDefinitions;
	
	import cucumber.api.java.en.Given;
	
	public class ExpressionStepDef {
		
			// Regular expression
		
		@Given("^I have (\\d+) laptop$")        	// Integer - \d+
			public void I_have_1_laptop(int count) {
				System.out.println("Laptop count " + count);
		}
		
		@Given("^I have (\\d+\\.\\d+) CGPA$")		// float - \\d+\\.\\d+
		public void i_have_CGPA(float num) throws Throwable {
		    System.out.println("CGPA is " + num);
		}
		
		@Given("^ \"(.*?)\" is elder to \"(.*?)\" and \"(.*?)\" $")
		public void is_elder_to_and(String name1, String name2, String name3) throws Throwable {
		    System.out.println(name1+ "is elder to " +name2 + "and " +name3);

		}
		
		
}
