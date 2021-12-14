package desktopapp.BadriDesktopApp;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        
        String firstName, lastName, email, password;
        
        Long phoneNumber=0L;
        Integer age;
        
        System.out.println("Please enter your First Name:");
        firstName = scan.nextLine();
        System.out.println("Please enter your Last Name:");
        lastName = scan.nextLine();
        System.out.println("Please enter your email:");
        email = scan.next();
        System.out.println("Please enter your Password:");
        password = scan.next();
        System.out.println("Please enter your contact number:");
        phoneNumber = scan.nextLong();
        System.out.println("Please enter your age:");
        age = scan.nextInt();
        
        System.out.println("Your account have been created as "+email+"in Gmail and OTP has sent to "+phoneNumber);
        System.out.println("Thanks for creating  account");
        
    }
}
