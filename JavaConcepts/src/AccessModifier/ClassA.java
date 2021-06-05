package AccessModifier;

public class ClassA {    //Public modifier --> u can use outside of the pkg
	
	
		public int publicVariable= 10;
		private int privateVaribale	= 20;
		protected int protectedVariable = 30;
			int defaultVaibale = 40;
			
			
		public static void main(String[] args) {
			
			ClassA a = new ClassA();
			
			System.out.println(a.publicVariable);
			System.out.println(a.privateVaribale);
			System.out.println(a.protectedVariable);
			System.out.println(a.defaultVaibale);
			
			
		}
		

}
