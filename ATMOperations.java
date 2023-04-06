/* 2. Write a program to perform ATM operations such as deposit, withdraw and balance enquiry. Display list of options for user selection. 
   Accept option from the user and execute specified method. throw Exception when user trying to withdraw amount more than 3 times.
*/

/*public class ATMOperations {

    public static void main(String args[]) {

    }
}*/
import java.util.Scanner;

public class ATMOperations {
    private static int balance = 0;
    private static int withdrawCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please select an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance Enquiry");
            System.out.println("4. Exit");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    deposit(scanner);
                    break;
                case 2:
                    withdraw(scanner);
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using our ATM.");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void deposit(Scanner scanner) {
        System.out.println("Enter amount to deposit:");
        int amount = scanner.nextInt();
        balance += amount;
        System.out.println("Deposit successful. Your new balance is: " + balance);
    }

    private static void withdraw(Scanner scanner) {
        if (withdrawCount >= 3) {
            throw new RuntimeException("You have exceeded the maximum number of withdrawals.");
        }

        System.out.println("Enter amount to withdraw:");
        int amount = scanner.nextInt();
        if (amount <= balance) {
            balance -= amount;
            withdrawCount++;
            System.out.println("Withdrawal successful. Your new balance is: " + balance);
        } else {
            System.out.println("Insufficient balance. Please try again.");
        }
    }

    private static void checkBalance() {
        System.out.println("Your current balance is: " + balance);
    }
}
