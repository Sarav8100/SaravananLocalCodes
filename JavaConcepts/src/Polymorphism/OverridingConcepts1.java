package Polymorphism;

public class OverridingConcepts1 {

	/* Types of Overriding name in Polymorphism
	1.Overriding
	2.Run time
	3.Dynamic binding
	4.Late binding
	
	 Different classes (with inheritance applied) we have methods with same signature	
	*/	
	
	public double getHomeLoanROI () {
		return 8.5;
	}
	
	public double getCarLoanROI() {
		
		return 10.5;
	}
	 
	public static void Sarav() {
		System.out.println("Velu");
		
	}
	
	public static void main(String[] args) {

		OverridingConcepts1 concept = new OverridingConcepts1();
		
		

	}

}
