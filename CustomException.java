/* 2. Write a program to create custom exception to perform deposit and withdraw options. 
      Create InvalidAmountException and throw this exception whenever user trying to deposit or withdraw invalid amount. 
      Deposit and withdraw amount should be multiples of 100 and it should be positive value.
*/

class InvalidAmountException extends Exception {
   InvalidAmountException(String message) {
        super(message);
    }
}

class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) throws InvalidAmountException {
        if (amount <= 0 || amount % 100 != 0) {
            throw new InvalidAmountException("Deposit amount should be a positive value and multiples of 100.");
        }
        this.balance += amount;
    }

    public void withdraw(int amount) throws InvalidAmountException {
        if (amount <= 0 || amount % 100 != 0) {
            throw new InvalidAmountException("Withdrawal amount should be a positive value and multiples of 100.");
        }
        if (amount > this.balance) {
            throw new InvalidAmountException("Insufficient balance.");
        }
        this.balance -= amount;
    }

    public int getBalance() {
        return this.balance;
    }
}

public class CustomException {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        try {
            account.deposit(500);
            System.out.println("Deposit successful. New balance: " + account.getBalance());

            account.withdraw(200);
            System.out.println("Withdrawal successful. New balance: " + account.getBalance());

            account.withdraw(800); // This should throw InsufficientBalanceException
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }
    }
}
