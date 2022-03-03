package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;


/*
 * 
 * ArrayList: Not a thread safe(asynchronous)
 * Vector	: Thread safe (synchronous)
 * 
 * add
 * add(pos,obj)
 * addAll
 * 
 * set(pos,obj)
 * 
 * remove(obj)
 * 
 * remove(pos)
 * 
 * get(pos)
 * 
 * removeAll
 * retainAll
 * 
 * Collections:
 * sort
 * max
 * min
 * reverse
 * replaceAll
 * 
 */


public class DemoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> array = new ArrayList<String>();
		
		array.add("badrinathan");array.add("zoho");array.add("you");
		array.add("will");array.add("never");array.add("join");
		
		System.out.println("ArrayList:"+array);
		Vector<String> list2=new Vector<String>();
		list2.addAll(array);
		
		System.out.println("Vector:\n"+list2);
		
		array.set(4, "12.76");
		list2.remove("9.1");
		
		System.out.println("ArrayList:\n"+array);
		System.out.println("Vector:\n"+list2);
		
		System.out.println(list2.get(4));
	
		//Collections:
		Collections.sort(array);
		System.out.println("ArrayList:\n"+array);
		Collections.reverse(list2);
		System.out.println("Vector:\n"+list2);
		System.out.println(Collections.min(array));
		System.out.println(Collections.max(array));
		Collections.replaceAll(array, "8.9", "76.1");
		Collections.replaceAll(list2, "8.9", "0.1");
	}

}
