package desktopapp.BadriDesktopApp;

public class commentLineArguments {
	//we can pass arguments before running the program
	public static void main(String[] args) {
		String fname=args[0], lname=args[1];
		
		System.out.println("FirstName "+fname+" LastName "+lname);
	}

}

// there are lot of drawbacks in the comment line arguments we should no use them mostly