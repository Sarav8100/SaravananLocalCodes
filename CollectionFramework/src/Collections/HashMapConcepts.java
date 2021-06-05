package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapConcepts {

	
	public static void main(String[] args) {

		//1st Concepts
		HashMap<String, String> capitalCities = new HashMap<String, String> ();

		capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    System.out.println(capitalCities); 
	    
	    String s = capitalCities.get("England");
	    System.out.println(s);
	    
	    int j = capitalCities.size();
	    System.out.println(j);
	    
	    System.out.println(capitalCities.remove("Norway"));
	    System.out.println(capitalCities);
	    
	    System.out.println("************************************");
	    
	    for(String w: capitalCities.keySet()) {
	    	System.out.println(w);
	    	
	    System.out.println("*********************************");
	    
	    for (String q: capitalCities.values()) {
	    	System.out.println(q);
	    	
	    System.out.println("*********************************");
	    
	    for (String u: capitalCities.keySet()) {
	    	System.out.println("Key : " + u + "Value = " + capitalCities.get(u));
	    	
	    System.out.println("****************************************");
	    
	    //2nd Concepts
	    HashMap<String, Integer> people = new HashMap <String, Integer>();
	    
	    people.put("John", 25);
	    people.put("Arul", 36);
	    people.put("Suresh", 41);
	    people.put("Dinesh", 45);
	    
	    for (String f: people.keySet()) {
	    	System.out.println("Name : "+ f + " Age: " + people.get(f));
	    }
	    System.out.println("**********************************************");
	    
	    //3rd Concepts
	    HashMap map = new HashMap<>();
	    
	    map.put("Sarav", 12);
	    map.put("Velu", 56);
	    map.put("Dhoni",36);
	    map.put("Ms Dhoni", 89);
	    
	    
	    System.out.println(map);
	    
	    if (map.containsKey("Dhoni")) {
	    	System.out.println("Age of Dhoni is " + map.get("Dhoni"));
	    }
	    System.out.println("Size of HashMap is " + map.size());
	    System.out.println("Is Hashmap is empty ? " + map.isEmpty());
	    
	    if(map.containsKey("Ms Dhoni")) {
	    	System.out.println(map.get("Ms Dhoni"));
	    	
	    Set <String> keys = map.keySet();
	    
	    for (String var:keys) {
	    	System.out.println("Key -->" + var + " Value is --> " + map.get(var));
	    }
	    
	    //4th Concepts
	    
	    Map <String, List<String>> map1 = new HashMap<String, List<String>> ();
	    
	    List<String> listofElements = new ArrayList<String>();
	    
	    listofElements.add("sarav1006@gmail.com");
	    listofElements.add("sarav0512@gmail.com");
	    listofElements.add("ksaravana.rocks512@gmail.com");
	    listofElements.add("sarav.krishr15@gmail.com");
	    
	    map1.put("email", listofElements); 
	    
	    
	    
	    }
	    
	    }
	    
	    
	    }
	    	
	    }
	 
	    
	}

}
