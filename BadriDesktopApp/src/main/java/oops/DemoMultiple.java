package oops;

import java.util.Arrays;

public class DemoMultiple extends disney implements Marvel,DC {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		DemoMultiple demo = new DemoMultiple();
		demo.crew();
		demo.avengers();
		demo.batman();
	}

	@Override
	public void batman() {
		// TODO Auto-generated method stub
		System.out.println("Cast of batman: ");
		System.out.println(cast[2]+" "+cast[5]+" "+cast[6]);
	}

	@Override
	public void avengers() {
		// TODO Auto-generated method stub
		System.out.println("Cast of avengers: ");
		System.out.println(cast[0]+" "+cast[1]+" "+cast[7]+" "+cast[8]);
	}

}

class disney{
	String[] cast= {"Evans","Downey","Pratt","Holland","Hiddleston","Huge","Ryan","Scarlet","Ruffalo"};
	
	public void crew() {
		System.out.println("Movie crew");
		System.out.println(Arrays.toString(cast));
	}
}

interface Marvel{
	public void avengers();
}

interface DC{
	public void batman();
}