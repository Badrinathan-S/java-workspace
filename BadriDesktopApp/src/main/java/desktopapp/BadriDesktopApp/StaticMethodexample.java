package desktopapp.BadriDesktopApp;

public class StaticMethodexample {

	public static void main(String[] args) {
		Details obj1 = new Details();
		obj1.username = "Jhonny depp"; obj1.Address="Salem";obj1.PIN=600600;obj1.mobile=12334345678L;
		obj1.info();
		Details obj2 = new Details();
		Details obj3 = new Details();
		System.out.println(Details.count);
	}
;
}

class Details{
	String username;
	String Address;
	Integer PIN;
	static Integer count = 0;
	Long mobile;
	Details(){
		count+=1;
	}
	public void info() {
		System.out.println("Username: "+username+" Address: "+Address+" PIN: "+PIN+" Mobile: "+mobile);
	}
}
