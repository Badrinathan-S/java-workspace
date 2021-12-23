package desktopapp.BadriDesktopApp;

import java.util.Scanner;

public class busTicketBooking {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the row: ");
		Integer row = scan.nextInt();
		String book = "";
		while(row != 0) {
			for(int seat=1;seat<=4;seat++) {
				System.out.println("Please enter the fare ammount: ");
				Integer fare = scan.nextInt();
				if(fare>=450) {
					book += "$";
					System.out.println("Booked");
				}
				else {
					book += "@";
					System.out.println("not Booked");
				}
				if(seat==2) {
					book+=" ";
				}
			}
			book += "\n";
			row--;
		}
		System.out.println(book);
		System.out.println("bus filled");
	}
}
