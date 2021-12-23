package desktopapp.BadriDesktopApp;

import java.util.Scanner;

public class patterns {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Integer row = 0, col = 0, Idata = 1, range=0;
		
		Character data = 'A';
		
		range = scan.nextInt();
		
		//perfect square
		for(row=1;row<=range;row++) {
			for(col=1;col<=range;col++,data++) {
				System.out.print(data);
			}
			System.out.println();
		}
		data = 'A';
		//left upper
		for(row=1;row<=range;row++) {
			for(col=1;col<=row;col++,data++) {
				System.out.print(data);
			}
			System.out.println();
		}
		data = 'A';
		//left lower
		for(row=range;row>0;row--) {
			for(col=1;col<=row;col++,data++) {
				System.out.print(data);
			}
			System.out.println();
		}
		//right upper
		data='A';
		for(row=1;row<=range;row++) {
			for(int space=range-1;space>=row;space--) {
				System.out.print(" ");
			}
			for(col=1;col<=row;col++,data++) {
				System.out.print(data);
			}
			System.out.println();
		}
		//right lower
		data='A';
		for(row=range;row>0;row--) {
			for(int space=range-1;space>=row;space--) {
				System.out.print(" ");
			}
			for(col=1;col<=row;col++,data++) {
				System.out.print(data);
			}
			System.out.println();
		}
		//floyd triangle upper
		data='A';
		for(row=1;row<=range;row++) {
			for(int space=range-1;space>=row;space--) {
				System.out.print(" ");
			}
			for(col=1;col<=row;col++,data++) {
				System.out.print(data+" ");
			}
			System.out.println();
		}
		//floyd triangle lower
		data='A';
		for(row=range;row>0;row--) {
			for(int space=range-1;space>=row;space--) {
				System.out.print(" ");
			}
			for(col=1;col<=row;col++,data++) {
				System.out.print(data+" ");
			}
			System.out.println();
		}
		
		data='A';int limit=1;
		for(row=1;row<=range;row++) {
			for(int space=range-1; space>=row;space--) {
				System.out.print(" ");
			}
			for(col=1;col<=limit;col++,data++) {
				System.out.print(data);
			}
			System.out.println();limit = limit+2;
		}
		data='A'; limit=(range*2)-1;
		for(row=range;row>0;row--) {
			for(int space=range-1; space>=row;space--) {
				System.out.print(" ");
			}
			for(col=1;col<=limit;col++,data++) {
				System.out.print(data);
			}
			System.out.println();limit = limit-2;
		}
	}

}
