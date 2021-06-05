package ContrsuctorsDemo;

public class thisDemo {
	
	int rollNumber;
	String name ;
	String standard;
	
	public thisDemo (int rollNumber, String name, String standard) {
		
		this.rollNumber = rollNumber;
		this.name = name;
		this.standard = standard;
		
	}
	
	public void seperate () {
		
		System.out.println("Student roll number : " + rollNumber + " Name is: " + name+" Standard is : " + standard);
	}

	public static void main(String[] args) {

		thisDemo demo = new thisDemo (10,"Sarav","5th");
		thisDemo demo1 = new thisDemo (20,"Dhoni","12th");
		
		demo.seperate();
		demo1.seperate();

	}

}
