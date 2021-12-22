package desktopapp.BadriDesktopApp;

import java.util.Scanner;

public class loopConditionATM {

	public static void main(String[] args) {
		Integer total=0, RS2000 = 5, RS500=10, RS200 = 15, RS100 = 20, req;
		
		total = (RS2000 * 2000) + (RS500 * 500) + (RS200 * 200) + (RS100 * 100);
		
		Scanner scan = new Scanner(System.in);
		
		String recipt = "";
		
		while(total > 0) {
			System.out.println("<----------------welcome to maariamman indian bank---------------------->");
			System.out.println("Available denominations: ");
			System.out.println("2000: "+ RS2000 + " 500: "+ RS500 + " 200: "+ RS200 + " 100: "+RS100);
			System.out.println("Enter the Amount: ");
			Integer amount = scan.nextInt();
			if(total >= amount) {
				if(amount/2000 != 0 && RS2000 > 0 && amount> 0) {
					req = amount/2000;
					if(req >= RS2000) {
						recipt += "2000 X " + RS2000 + "\n";
						total = total - (2000 * RS2000);
						amount = amount - (2000 * RS2000);
						RS2000 = 0;
					}
					else {
						recipt += "2000 X " + req + "\n";
						total -= (2000 * req);
						amount -= (2000 * req);
						RS2000 -= req;
						System.out.println(amount+ "total1");
					}
				}
				if(amount/500 != 0 && RS500 > 0 && amount> 0) {
					req = amount/500;
					if(req >= RS500) {
						recipt += "500 X " + RS500 + "\n";
						total -= (500 * RS500);
						amount -= (500 * RS500);
						RS500 = 0;
					}
					else {
						recipt += "500 X " + req + "\n";
						total -= (500 * req);
						amount -= (500 * req);
						RS500 -= req;
					}
				}
				if(amount/200 != 0 && RS200 > 0 && amount> 0 ) {
					req = amount/200;
					if(req >= RS200) {
						recipt += "200 X " + RS200 + "\n";
						total -= (200 * RS200);
						amount -= (200 * RS200);
						RS200 = 0;
					}
					else {
						recipt += "200 X " + req + "\n";
						total -= (200 * req);
						amount -= (200 * req);
						RS200 -= req;
					}
				}
				System.out.println(amount);
				if(amount/100 != 0 && RS100 > 0 && amount > 0) {
					req = amount/100;
					if(req >= RS100) {
						recipt += "100 X " + RS100 + "\n";
						total -= (100 * RS100);
						amount -= (100 * RS100);
						RS100 = 0;
					}
					else {
						recipt += "100 X " + req + "\n";
						total -= (100 * req);
						amount -= (100 * req);
						RS100 -= req;
					}
				}
				System.out.println(recipt);
				System.out.println("<----------------cash dispensed!!!---------------------->");
			}
			else {
				System.out.println("Insuffient amount");
				System.out.println("<----------------please enter a valid amount!!!---------------------->\n");
			}
			recipt = "";
		}
		System.out.println("Out of cash!!!");
	}

}
