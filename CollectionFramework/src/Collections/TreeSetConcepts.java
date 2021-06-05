package Collections;

import java.util.TreeSet;

public class TreeSetConcepts {

	public static void main(String[] args) {

		TreeSet<Integer> set = new TreeSet <Integer>();
		
		set.add(25);
		set.add(36);
		set.add(89);
		set.add(12);
		
		System.out.println(set);
		
		
		
		System.out.println("Set contains 12 ? " + set.contains(12));
		
		System.out.println("First element of TreeSet is " + set.first());
		System.out.println("Last element of TreeSer is " + set.last());
		
		System.out.println("Use of HeadSet is " + set.headSet(89));
		System.out.println("Use of TailSet is " + set.tailSet(89));
		System.out.println("Use of SubSet is " + set.subSet(10,100));
		
		set.clear();
		System.out.println(set);
		
	}

}
