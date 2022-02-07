package lang;

public class DemoObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoObject demo = new DemoObject();
		Double hai = 4.5;
		System.out.println(hai.floatValue());
		
		Object obj = (Object)hai;
		
		System.out.println(obj.toString());
		
		obj = 'B';
		
		Character yet = (Character)obj;
		
		System.out.println(yet.charValue());

	}

}
