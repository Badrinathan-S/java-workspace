package arrayExample;

import java.util.Scanner;

public class Creation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("print");
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter data:");
//		Integer data = scan.nextInt();
		ArrayCreation.addBegin(1);
		ArrayCreation.addEnd(2);
		ArrayCreation.addEnd(5);
		ArrayCreation.addEnd(3);
		ArrayCreation.addEnd(4);
		ArrayCreation.addEnd(7);
		ArrayCreation.addEnd(9);
		ArrayCreation.addEnd(6);
		ArrayCreation.addEnd(0);
		ArrayCreation.addEnd(8);
		ArrayCreation.ArrayPrint();
	}
}

class ArrayCreation{
	private static Integer[] Arr = new Integer[10];
	public static void addBegin(Integer data) {
		if(Arr[0] == null) {
			Arr[0] = data;
		}
	}
	public static void addEnd(Integer data) {
		if(Arr[0] == null) {
			Arr[0] = data;
		}
		else {
			int i = 0;
			for(i=0;i<Arr.length;i++) {
				if(Arr[i] == null) {
					Arr[i] = data;
					return;
				}
			}
			if(i == Arr.length) {
				System.out.println("Array is full");
				return;
			}
		}
	}
	
	public static void ArrayPrint() {
		for(int i=0;i<Arr.length;i++) {
			System.out.print(Arr[i] + " ");
		}
	}
}
