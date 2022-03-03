package collections;

import java.util.LinkedList;


/*
 * LinkedList: FiFo
 * add/ addLast
 * addFirst
 * add(pos,obj)
 * 
 * set(pos,obj)
 * 
 * remove/removeFirst
 * remove(pos)
 * removeLast
 * 
 * getLast
 * getFirst
 * get(pos)
 * 
 * indexOf(obj)
 * 
 * clear
 */

public class DemoLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList link = new LinkedList();
		link.add("Zealous");link.add(98);link.addLast(true);
		link.addFirst('R');link.add("Mayura");link.add(2,3.4);
		
		System.out.println(link);
		
		link.remove(3);
		
		link.getFirst();
		
		System.out.println(link.getFirst());
		
		link.clear();
		
		System.out.println(link);
	}

}
