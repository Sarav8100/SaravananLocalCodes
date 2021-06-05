package Polymorphism;

public class RBI {
	
	/* Types of Overloading name in Polymorphism
	1.Overloading
	2.Compile time
	3.Static binding
	4.Early binding
	
	 Same method name and different signature in same class
	*/	
	int amount = 10;
	String bankName = "SBI";
	
	public void getHomeLoanROI() {
		
	}
	
	public void getHomeLoanROI(String bankName) {
		
		
	}
	
	public void getHomeLoanROI(String bankName, int amount) {
		
		
	}
	
	public static void main(String[] args) {
		
		RBI rbi = new RBI ();
		rbi.getHomeLoanROI("KVB");
		rbi.getHomeLoanROI("sara", 10);
	}
	

}
