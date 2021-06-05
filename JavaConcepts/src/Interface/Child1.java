package Interface;

public class Child1 extends ParentClass1 implements Parent1, Parent2 {

	
		@Override
		public void show() {

		System.out.println("Child Show");
		
		}
	
	
		public static void main(String[] args) {
			
			
			ParentClass1 c = new ParentClass1();
			c.show();	
			
		}

	

}
