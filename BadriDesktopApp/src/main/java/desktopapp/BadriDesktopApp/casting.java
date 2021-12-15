package desktopapp.BadriDesktopApp;

public class casting {

	public static void main(String[] args) {
		String name = "Badri";
		
		for(char c: name.toCharArray()) {
			System.out.println(c);
		}

	}

}

//we cannot cast String to other formats in casting method. go for parsing method

class characterCast {

	public static void main(String[] args) {
		Character jhonny='p', depp='s';
		
		System.out.println("jhonny have "+jhonny+" depp have "+depp);
		
		jhonny = (char)(jhonny + depp);
		
		depp = (char)(jhonny - depp);
		
		jhonny = (char)(jhonny - depp);
		
		System.out.println("jhonny have "+jhonny+" depp have "+depp);
		
	}

}

class doubleCast {

	public static void main(String[] args) {
		char num  = '6';
		
		System.out.printf("%.8f",(float)num);
		
	}

}
