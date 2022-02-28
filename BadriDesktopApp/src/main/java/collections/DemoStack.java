package collections;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class DemoStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack();//generic
		
		Stack<Integer> stack1 = new Stack<Integer>();//non generic
		
		List stack2 = new Stack();
		
		stack.push("Jhonny");stack.push(50);
		stack.push(60.1);stack.push("3");
		
		// stack1 can only accept numaric values(integer)
		
		//List did not have the method in the stack2
		
		Iterator<Object> it = stack.iterator();
		
		//Iterator is used to Itarate over Stack
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		System.out.println(stack.peek());
		
//		stack.clear();
		
		System.out.println(stack.isEmpty());
		
		System.out.println(stack.search("Jhonny"));
		System.out.println(stack.search(false));
		

	}

}
