package lang;

public class DemoCloning implements Cloneable
{
	
	String skillset;
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		DemoCloning kumar = new DemoCloning();
		kumar.skillset = "ReactJS";
		DemoCloning sai = new DemoCloning();
		
		sai.skillset = "NodeJs";
		
		System.out.println("Kumar: "+kumar.skillset+", Sasi: "+sai.skillset);
		
		sai=kumar;
		
		System.out.println("Kumar: "+kumar.skillset+", Sasi: "+sai.skillset);
		kumar.skillset="ExpressJS";
		System.out.println("Kumar: "+kumar.skillset+", Sasi: "+sai.skillset);
		
		sai.skillset = "EmberJS";
		
		System.out.println();
		
		System.out.println("Kumar: "+kumar.skillset+", Sasi: "+sai.skillset);
		DemoCloning badri=new DemoCloning();
		badri.skillset="Javascript";
		System.out.println("Kumar: "+kumar.skillset+", Sasi: "+sai.skillset+", badri: "+badri.skillset);
		
		badri=(DemoCloning)kumar.clone();
		
		System.out.println("Kumar: "+kumar.skillset+", Sasi: "+sai.skillset+", Umadevi: "+badri.skillset);
		
		badri.skillset="VueJS";
		kumar.skillset="Tailwind";
		
		System.out.println("Kumar: "+kumar.skillset+", Sasi: "+sai.skillset+", Umadevi: "+badri.skillset);
	}

}
