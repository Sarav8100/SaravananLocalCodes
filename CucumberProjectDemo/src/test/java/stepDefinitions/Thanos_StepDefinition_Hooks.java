package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Thanos_StepDefinition_Hooks {
	
	
	@Given("^Thanos has the Infinity stones$")
	public void thanos_has_the_Infinity_stones() throws Throwable {
		System.out.println("Thanos has the Infinity stones");
	}
	
	@When("^Thanos snaps his fingers$")
	public void thanos_snaps_his_fingers() throws Throwable {
		System.out.println("Thanos snaps his fingers");
	}

	@Then("^half of the living things died$")
	public void half_of_the_living_things_died() throws Throwable {
		System.out.println("Half of the living things died");
	}
		

}
