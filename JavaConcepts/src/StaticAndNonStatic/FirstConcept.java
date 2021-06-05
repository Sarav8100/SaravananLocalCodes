package StaticAndNonStatic;

public class FirstConcept {
	
	String name = "Tom";
	static int age = 25;

	public static void main(String[] args) {

		//How to call static methods and vars?
		//1. Direct calling:
		sum();
		//2.Calling by classname:
		FirstConcept.sum();
		
		System.out.println(age);
		System.out.println(FirstConcept.age);
		
		//How to call Non-static methods and vars?
		FirstConcept obj = new FirstConcept();
		obj.sendMail();
		System.out.println(obj.name);
		
	}
	
	public void sendMail() {
		System.out.println("Send mail methods");
	}
	
	public static void sum() {
		System.out.println("Sum Method");
	}

}
