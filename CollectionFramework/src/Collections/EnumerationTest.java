package Collections;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest {

	public static void main(String[] args) {
		
		//Create a vector and create a content
		Vector v = new Vector ();
		for (int i= 0; i < 10; i++)
		{
			v.addElement(i);
			System.out.println(i);
		}
		
		System.out.println(v);
		
		//At beginning e(Cursor) wil point to 
		//index just before the first element in v
		
		Enumeration e= v.elements();
		
		//Checking the next element availability
		
		while (e.hasMoreElements()) 
		{
			int i = (Integer)  e.nextElement();
			
//			System.out.println(i + " ");
		}
		
		
		
	}

}
