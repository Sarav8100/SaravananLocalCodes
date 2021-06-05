package ContrsuctorsDemo;

public class Students {
	
		/*
		 * Constructors have same name as of the ClassName
		 * 
		 * Types of cons :
		 * 
		 * default cons
		 * no-arg cons
		 * parameterized cons
		 * 
		 */

	public Students () {    //1. Default constructor
		
		System.out.println("Calling constructor");
		
		System.out.println("Hi, i am contructor");
		
	}
	
	int rollNumber;
	String name;
	  
	public Students (int i, String n) {   //2. Parameterized constructor
		
		rollNumber = i;
		name = n;
	}
	
	public void display () {
		
		System.out.println("rollNumber is " + rollNumber + " and Name is " + name);
	}
	
	public static void main(String[] args) {
		
		Students st = new Students();
		
		Students std1 = new Students (10, "James");
		Students std2 = new Students(20, "Natalia");
		
		std1.display();
		std2.display();
		
		
			
			
	}
	
}
