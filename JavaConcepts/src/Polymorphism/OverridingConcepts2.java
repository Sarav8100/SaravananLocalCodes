package Polymorphism;

public class OverridingConcepts2 extends OverridingConcepts1{

	public double getHomeLoanROI () {
		return 8.5;
	}
	
	public double getCarLoanROI() {
		
		return 11.5;
	}	
	
	public static void Velu () {
		System.out.println("Saravana Velu");
	}
	
	public static void main(String[] args) {
			
			OverridingConcepts2 over = new OverridingConcepts2();
			System.out.println(over.getCarLoanROI());
			
			
			
		}
		
}
