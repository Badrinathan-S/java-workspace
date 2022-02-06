package oops;

import java.util.Arrays;

public class MyBundle {

	private double[] hai= {1.1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7, 1.8, 1.9, 2.0};
	
	public void list() {
		System.out.println(Arrays.toString(hai));
	}
	
	int linear(double user){
		for(int i=0;i<hai.length;i++) {
			if(user == hai[i]) {
				return i;
			}
		}
		return -1;
	}
	
	protected double[] split(int start, int end) {
		if(start>=0 && end <=hai.length-1) {
			return Arrays.copyOfRange(hai, start, end);
		}
		return new double[0];
	}
	
	public final void sort() {
		System.out.println("in sort");
		Arrays.sort(hai);
		System.out.println("out sort");
	}

}
