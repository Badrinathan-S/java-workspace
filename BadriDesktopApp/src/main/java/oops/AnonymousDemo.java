package oops;

import java.util.Arrays;

public class AnonymousDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Strict st = new Strict();
		st.traverse();
		st.filter("d");
		
		new Strict().traverseColony();
		new Strict().filter("i");
	}

}

class Strict{
	private static String[][] crew = {{"vishnu", "prakesh"}, {"viky", "viki", "priya"}, {"Harish", "harshan", "manoj", "dhinesh kumar"}};
	private static String[] colony = new String[10];

	public void convert() {
		for(int row=0, index=0;row<crew.length;row++) {
			for(int col=0;col<crew[row].length;col++) {
				colony[index] = crew[row][col];
			}
		}
	}
	
	public void traverse() {
		for(String[] row:crew) {
			for(String person:row) {
				System.out.print(person+" ");
			}
			System.out.println();
		}
	}
	
	public void traverseColony() {
		System.out.println(Arrays.toString(colony));
	}
	
	public void filter(String phrase) {
		for(int index=0;index<colony.length&&colony[index]!=null;index++) {
			if(colony[index].endsWith(phrase)) {
				System.out.println(colony[index]);
			}
		}
	}
}
