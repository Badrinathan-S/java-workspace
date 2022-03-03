package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

/*
 * HashSet: random order
 * TreeSet: ascending
 * 
 * add
 * 
 * remove(obj)
 * 
 * retainAll
 * removeAll
 * 
 * contains
 * 
 */


public class DemoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> array = new ArrayList<String>();
		
		array.add("badrinathan");array.add("zoho");array.add("you");
		array.add("will");array.add("never");array.add("join");
		
		HashSet hash = new HashSet<>();
		
		hash.addAll(array);
		
		System.out.println(hash);
		
		TreeSet tree = new TreeSet<>();
		
		tree.addAll(array);
		
		System.out.println(tree);
		
		
		tree.remove("8.9");
		hash.remove("2.3");
		
		System.out.println(hash.contains("zoho"));
		System.out.println(tree.contains("2.3"));
		
		System.out.println("HAsh:\n"+hash);
		System.out.println("Tree:\n"+tree);
		

	}

}
