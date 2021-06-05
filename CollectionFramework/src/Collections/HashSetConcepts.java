package Collections;

import java.util.HashSet;
import java.util.Iterator;



public class HashSetConcepts {

	public static void main(String[] args) {
		//1st Concepts
		HashSet<String> cars = new HashSet<String>();
		cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("BMW");
	    cars.add("Mazda");	
	    
	    System.out.println(cars);
	    
	    boolean e = cars.contains("BMW");
		System.out.println(e);
		
		System.out.println(cars.size());
		
		for(String w: cars) {
			System.out.println(w);
			
		System.out.println("****************************");
		
		//2nd Concepts
		HashSet<Integer> numbers = new HashSet<Integer>();
		numbers.add(25);
		numbers.add(36);
		numbers.add(64);
		numbers.add(64);
		
//		numbers.remove(36);
		boolean p = numbers.contains(89);
		System.out.println(p);
		System.out.println(numbers);
		
		System.out.println("*************************");
		
		/*
		 * for(int i=25; i < 56; i++) { if(numbers.contains(i)) { System.out.println(i
		 * +"Found the value of "); }else System.out.println(i+
		 * "I was not found under this "); }
		 * 
		 * HashSet hash = new HashSet<>();
		 * 
		 * hash.add("sarav"); hash.add("Velu");
		 * 
		 * System.out.println(hash.add("dhoni"));
		 */
		
		//3rd Concepts
		HashSet<String> set = new HashSet<String>();
		
		set.add("Raman");
		set.add("Selenium");
		set.add("Dhoni");
		set.add("Sarav");
		set.add("Dhoni");
		
		System.out.println(set);
		/*
		 * for (int q=0; q<set.size(); q++) { System.out.println(q); }
		 */
		
		for (String var:set) {
			System.out.println(var);
		}
		
		System.out.println("*************************");
		
		//Another Concepts
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			
			String var = itr.next();
						
			if (var.equals("Sarav")) {
				
			System.out.println(var);
			
			}
		}
		
		
		}
	}

}
