package desktopapp.BadriDesktopApp;

import java.util.Scanner;

public class BookingTravelStatement {
	static Scanner scan = new Scanner(System.in);
	
	
	public static String coach() {
		System.out.println("Please choose the coach: 1.AC 2.NON AC");
		Integer num = scan.nextInt();
		String res ="";
		if(num == 1) {
			System.out.println("AC coach");
			res += "in AC coach ";
		}
		else if(num == 2) {
			System.out.println("NON AC coach");
			res += "in NON AC coach ";
		}
		else {
			System.out.println("choose a valid number");
			System.exit(0);
		}
		return res;
	}
	
	public static String Booking() {
		System.out.println("Please choose the time: 1.8:00 2.12:00 3.16:00");
		Integer Timing = scan.nextInt();
		String res ="";
		switch(Timing) {
			case 1:{
				System.out.println("8:00");
				res += "at 8:00 " + coach();
				break;
			}
			case 2:{
				System.out.println("12:00");
				res += "at 12:00 " + coach();
				break;
			}
			case 3:{
				System.out.println("16:00");
				res += "at 16:00 " + coach();
				break;
			}
			default:{
				System.out.println("choose a valid number");
				System.exit(0);
				break;
			}
		}
		return res;
		
	}

	public static void main(String[] args) {
		
		String recipt = "";
		System.out.println("<---------------sundara travels--------------->");
		System.out.println("Choose the city number: 1.Bangalore 2.Chennai 3.Hyderabad");
		Integer cityNumber = scan.nextInt();
		switch(cityNumber) {
			case 1:{
				System.out.println("Bangalore");
				recipt += "Bangalore ";
				recipt += Booking();
				break;
			}
			case 2:{
				System.out.println("Chennai");
				recipt += "Chennai ";
				recipt += Booking();
				break;
			}
			case 3:{
				System.out.println("Hyderabad");
				recipt += "Hyderabad ";
				recipt += Booking();
				break;
			}
			default:{
				System.out.println("choose a valid number");
				System.exit(0);
				break;
			}
		}
		System.out.println("Please Enter number of tickets:");
		Integer num = scan.nextInt();
		System.out.println("Booking confirmed from Salem to " + recipt+ "for " + num + " tickets.");
		System.out.println("<---------------Thank you visit again!-------------->");
//		scan.close();
	}
}
