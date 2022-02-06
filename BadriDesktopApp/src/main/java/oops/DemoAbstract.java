package oops;

import java.util.Arrays;

public class DemoAbstract extends Mongo {
	public static void main(String[] args) {
		Mongo demo=new DemoAbstract();
		demo.addtechs("REACTJS");
		demo.addtechs("NODEJS");
		demo.addtechs("EXPRESSJS");
		demo.show();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(techs));
	}
}


abstract class Mongo{
	String[] techs = new String[10];
	
	public void addtechs(String tech) 
	{
		for(int i=0;i<techs.length;i++) {
			if(techs[i]==null) {
				techs[i] = tech;
				System.out.println(tech+" added to Mongo");
				return;
			}
		}
		System.out.println(tech+" couldn't be added");
	}
	public abstract void show();
}