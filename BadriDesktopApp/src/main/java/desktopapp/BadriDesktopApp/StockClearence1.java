package desktopapp.BadriDesktopApp;

import java.util.Scanner;

public class StockClearence1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Integer total = 100;
		
		while(total > 0) {
			System.out.println("<---------------Welcome to megasale--------------->");
			System.out.println("please enter no. of Items(max 5 item): ");
			Integer ItemNo = scan.nextInt();
			if(ItemNo < 6 ) {
				total -= ItemNo;
				System.out.println(ItemNo+" Item booked");
			}
			else {
				System.out.println("Enter a valid Item no");
			}
		}
		System.out.println("Out of stack");

	}

}
