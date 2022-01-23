package oops;

import java.util.Arrays;

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alphabet.Numeric num = new Alphabet.Numeric();
		Alphabet.rows(1);
		num.traverse();
		
		Alphabet.Numeric.update(2000);
		
		num.traverse();

	}

}

class Alphabet{
	private static Integer[][] apart = {{8700, 1300},{9100, 10900, 3400, 5100},{1000, 6300, 7000}};
	public static void rows(int row) {
		if(row<apart.length) {
			System.out.println(Arrays.toString(apart[row]));
		}
		else {
			System.out.println("Invaild");
		}
	} 
	
	static class Numeric{
		public void traverse() {
			for(Integer[] row: apart) {
				System.out.println(Arrays.toString(row));
			}
		}
		
		public static void update(int max) {
			for(int row=0; row<apart.length;row++) {
				for(int col=0;col < apart[row].length;col++) {
					if(apart[row][col]>=max) {
						apart[row][col]-=(int)(apart[row][col]*0.500);
					}
				}
			}
		}
	}
}
