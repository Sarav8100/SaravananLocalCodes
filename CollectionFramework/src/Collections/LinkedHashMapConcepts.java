package Collections;

import java.util.LinkedHashMap;

public class LinkedHashMapConcepts {

	public static void main(String[] args) {

			LinkedHashMap map = new LinkedHashMap<>();

			map.put("Sarav", 12);
		    map.put("Velu", 56);
		    map.put("Dhoni",36);
		    map.put("Ms Dhoni", 89);
		    map.putIfAbsent("Sara", 52);
		    
		    System.out.println(map);
		    System.out.println(map.containsKey("Sara"));
		    
		    if (map.containsKey("Dhoni")) {
		    	System.out.println("Age of Dhoni is " + map.get("Dhoni"));
		    }
		    System.out.println("Size of HashMap is " + map.size());
		    System.out.println("Is Hashmap is empty ? " + map.isEmpty());

	}

}
