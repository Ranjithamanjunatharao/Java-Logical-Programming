/* 3. Write a program to accept firstName, lastName and mobileNumber in string format. 
   Print number of characters in firstName and lastName, and print sum of digits of a mobileNumber. 
   Handle NumberFormatException while converting mobileNumber to long.
*/

/*public class NumberFormatException {

    public static void main(String args[]) {

    }
}*/
import java.util.Scanner;

public class NumberFormatException1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Accept first name, last name, and mobile number from user
        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();
        System.out.print("Enter your mobile number: ");
        String mobileNumber = input.nextLine();

        // Count the number of characters in first name and last name
        int firstNameLength = firstName.length();
        int lastNameLength = lastName.length();
        System.out.println("Number of characters in first name: " + firstNameLength);
        System.out.println("Number of characters in last name: " + lastNameLength);

        // Calculate sum of digits in mobile number
        long sum = 0;
        try {
            long number = Long.parseLong(mobileNumber);
            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }
            System.out.println("Sum of digits in mobile number: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Invalid mobile number format.");
        }
    }
}
