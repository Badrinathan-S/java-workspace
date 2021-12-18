package desktopapp.BadriDesktopApp;

import java.util.Scanner;

public class conditionATM {

	public static void main(String[] args) {
		Integer RS2000s = 5, RS500s = 10, RS200s = 15, RS100s = 20;
		Scanner scan = new Scanner(System.in);
		
		String recipet = "";
		
		Integer Total = (RS2000s* 2000) + ( RS500s* 500) +(RS200s* 200) +(RS100s* 100);
		
		
		Integer cash = scan.nextInt();
		
		Integer dom = 0;
		
		if(Total > cash) {
			if(cash >= 2000) {
				dom = cash/2000;
				cash -= (dom * 2000);
				recipet = recipet + "2000 x " + dom + "\n";
			}
			if(cash >= 500) {
				dom = cash/500;
				cash -= (dom * 500);
				recipet = recipet + "500 x " + dom + "\n";
			}
			if(cash >= 200) {
				dom = cash/200;
				cash -= (dom * 200);
				recipet = recipet +"200 x " + dom + "\n";
			}
			if(cash >= 100) {
				dom = cash/100;
				cash -= (dom * 100);
				recipet =recipet + "100 x " + dom + "\n";
			}
		}
		else {
			System.out.println("Please enter a valid amount");
		}
		
		System.out.println(recipet);
	}

}
