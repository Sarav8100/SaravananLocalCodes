package Inheritance;

import com.sun.nio.sctp.SendFailedNotification;

public class BullDog extends Dog{

	public static void main(String[] args) {

		Dog bull = new BullDog();
		bull.Sound();
		
		Cat cat = new Cat();
		cat.Sarav();

		sum();
		BullDog.sum();
		
	}
	
	public void sendMail() {
		System.out.println("Send mail method");
	}
	
	public static void sum() {
		System.out.println("Sum Method");
	}

}
