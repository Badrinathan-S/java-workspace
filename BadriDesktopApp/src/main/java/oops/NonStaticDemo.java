package oops;

import java.util.Arrays;

import oops.House.Portion;

public class NonStaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House.traverse();
		House house=new House();
		Portion portion=house.new Portion();
		portion.convert();
		portion.traverse();
	}

}

class House
{
	private static String[][] crew= {{"Razak","Sabari"},{"Rasheedha","Mohamed","Rajiya"},{"Vinod","Prakash","Akram","Vikas"}};
	public static void traverse()
	{
		for(String[] row:crew)
		{
			for(String person:row)
			{
				System.out.print(person+" ");
			}
			System.out.println();
		}
	}
	class Portion
	{
		private String[] colony=new String[10];
		public void convert()
		{
			for(int row=0, index=0;row<crew.length;row++)
			{
				for(int col=0;col<crew[row].length;col++,index++)
				{
					colony[index]=crew[row][col];
				}
			}
		}
		public void traverse()
		{
			System.out.println(Arrays.toString(colony));
		}
	}
}
