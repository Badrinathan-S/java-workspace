package oops;

public class DemoLoad {
	public static void main(String[] args) {
		
		Energy eng = new Energy();
		
		eng.extract();
		eng.extract(5.0);
		
		
	}
}

class Energy{
	
	private double[] find = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};
	
	public void extract() {
		for(double c:find) {
			System.out.print(c+ " ");
		}
		System.out.println();
	}
	
	public void extract(double max) {
		for(int i=0;i<find.length;i++) {
			if(max>=find[i]) {
				System.out.print(find[i]+" ");
			}
		}
		System.out.println();
	}
}
