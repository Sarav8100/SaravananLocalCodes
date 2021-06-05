package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListConcepts {

	public static void main(String[] args) {
		
		//1st Concept
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    cars.add("BMW");
	    
	    ArrayList<Integer> car = new ArrayList<>();
	     car.add(6);
	     
	    System.out.println(cars);
	    System.out.println(cars.get(0));
	 
	    for (int j = 0; j < cars.size(); j++) {
	      System.out.println(cars.get(j));
	    }
	    System.out.println("******************************************");
	    ArrayList<Integer> mylist = new ArrayList<Integer>();
	    mylist.add(25);
	    mylist.add(10);
	    mylist.add(55);
	    mylist.add(20);
	    mylist.add(25);
	    
	    System.out.println(mylist);
	    
	    Collections.sort(mylist);
	    
	  
	    for (int k : mylist);{
	    System.out.println(mylist);
	    }
	    System.out.println("**********************************************");
	    
	    
	    //2nd Concept 
	    
	    //add & size
	    ArrayList list = new ArrayList ();
	    
	    list.add(10);
	    list.add("Raman");
	    list.add(10.55669);
	    list.add('f');
	    list.add(true);
	    list.add(null);
	    list.add("Sarav");
	    
	    System.out.println(list);
	    System.out.println(list.size());
	    
	    //how to fetch the value from a list
	    
	    System.out.println(list.get(0));
	    System.out.println(list.get(3));
	    
	    //remove
	    
	    list.remove(3);
	    System.out.println(list);
	    System.out.println(list.size());
	    
	    for(int i=0; i<list.size() ; i++) {
	    	System.out.println(list.get(i));
	    }
	    
	    System.out.println("******************************************");
	    
	    for ( Object var: list) {
	    	System.out.println(var);
	    }
	    
	    System.out.println("***********************************************");
	    
	    //3rd Concept
	    //Iterator
	    
	    Iterator itr = list.iterator();
	    
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	    
	    System.out.println("******************************************");
	    //4th Concept
	    //Generic
	    List<Integer>lists = new ArrayList<Integer> ();
	    lists.add(10);
	    lists.add(null);
	    
	    int i = lists.get(0);
	    
	    System.out.println(i);
		}
	
		

	}


