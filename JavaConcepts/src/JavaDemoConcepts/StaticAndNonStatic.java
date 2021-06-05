package JavaDemoConcepts;

public class StaticAndNonStatic {
	
	//global vars : the scope of global vars
	
	String name = "Dhoni"; //non static global var
	static int age = 25; //static global var

	public static void main(String[] args) {

		//how to call static methods and vars?
		//1. Direct calling :
		sum();
		
		//2.Calling by classname :
		StaticAndNonStatic.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonStatic.age);
		
		//how to call non-static methods and vars?
		StaticAndNonStatic obj = new StaticAndNonStatic();
		obj.sendmail();
		System.out.println(obj.name);
		
		//can i access static methods by using object reference ? Yes
		obj.sum();
		System.out.println(obj.age);    //[But not recommended]
	}

	public void sendmail() {
		System.out.println("Send mail method");
	}
	
	public static void sum() {
		System.out.println("Sum method");
	}
	
}
