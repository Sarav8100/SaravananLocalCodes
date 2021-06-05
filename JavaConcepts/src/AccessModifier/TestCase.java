package AccessModifier;

public class TestCase {

		
	public static void main(String[] args) {

		
		ClassA s = new ClassA();
		System.out.println(s.publicVariable);
		//System.out.println(s.privateVaribale);  --> Private is cannot work in outside the class
		System.out.println(s.protectedVariable);
		System.out.println(s.defaultVaibale);
		
		
	}

}
