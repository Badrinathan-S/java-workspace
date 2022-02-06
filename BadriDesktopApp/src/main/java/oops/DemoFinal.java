package oops;

public class DemoFinal extends MyBundle {
	
	public void list() {
		System.out.println("overriding");
		super.list();
	}
	
	//OVERRIDING CANNOT BE DONE FOR FINAL ACCESS MODIFIER METHOD
//	public void sort() {
//		Blah blah blah
//	}
	
	public static void main(String[] args) {
		DemoFinal fin = new DemoFinal();
		fin.list();
	}

}
