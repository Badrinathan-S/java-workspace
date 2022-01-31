package oops;

import java.util.Arrays;

public class DemoOverriding implements cosmos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		beta beta = new beta();
		
		beta.traverse();
		
		beta.finale(4, 10);
		
		DemoOverriding demo=new DemoOverriding();
		System.out.println(demo.hello[0]);
		demo.hello[0]+=2;
		System.out.println(demo.hello[0]);
		//demo.only+=10;
		demo.angular();
	}

	@Override
	public void angular() {
		// TODO Auto-generated method stub
		System.out.println("Cosmos Interface");
		
	}

}

interface cosmos{
	double[] hello= {4.5,6.7,9.1,34.5,1.2,4.6,9.2,12.5};
	double only=89.1;
	public void angular();
}

class alpha {
	int[] term = {1, 2, 3, 4, 8, 7, 6, 55, 44, 79, 45, 66, 23, 88, 11};
	
	public void traverse() {
		System.out.println("Listing all value is array alpha:");
		System.out.println(Arrays.toString(term));
	}
}

class beta extends alpha{
	
	public void traverse() {
		System.out.println("Beta");
		for(int i=term.length-1; i>=0;i--) {
			System.out.print(term[i] + " ");
		}
		System.out.println();
	}
	
	public void finale(int start,int end)
	{
		System.out.println("Listing values of array from "+start+" and "+end);
		System.out.println(Arrays.toString(Arrays.copyOfRange(term, start, end)));
		
	}
	
}
