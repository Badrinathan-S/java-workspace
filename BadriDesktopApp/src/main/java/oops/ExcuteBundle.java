package oops;

import java.util.Arrays;

public class ExcuteBundle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyBundle bundle = new MyBundle();
		bundle.list();
		double[] yet = bundle.split(3, 9);
		System.out.println(Arrays.toString(yet));
		System.out.println(bundle.linear(1.1));
		bundle.sort();
	}

}
