package Inheritance;

public class Dog extends Animal{
		
		public static void main(String[] args) {
			
			Dog obj = new Dog();
			obj.Sound();
			obj.sara();
			obj.saran();
		}
	
		public void Sound() {
			System.out.println("Whow Whow");
		}
		
		public void sara() {
			System.out.println("Velu");
		}
}
