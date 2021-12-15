package desktopapp.BadriDesktopApp;

public class parsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Badri";
		
		for(char c: name.toCharArray()) {
			System.out.println((int)c);
		}

	}

}

class intparsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n = "1";
		
		short num = Short.parseShort(n);
		
		System.out.println(num);

	}

}
