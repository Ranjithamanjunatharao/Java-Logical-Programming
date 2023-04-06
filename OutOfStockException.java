/* 5. Write a program create custom Exception to manage stock. Create OutOfStockException and throw this exception if user 
     entered stock is not present while purchase products. Create the following methods.
     ==> addStock(int qty)   : write code to add stock
     ==> purchase(int qty)   : write code to purchase products
     ==> diplayStock()       : write code to display available stock

  Display list of options to user before accept option from user, such as 
  1. addStock  
  2. purchaseProduct 
  3. displayStock
*/
import java.util.*;

class StockException extends Exception {
   StockException(String message) {
        super(message);
    }
}

 class StockManager {
    private int stock = 0;

    public void addStock(int qty) {
        stock += qty;
        System.out.println(qty + " items added to the stock.");
        displayStock();
    }

    public void purchase(int qty) throws StockException {
        if (qty > stock) {
            throw new StockException("Sorry, " + qty + " items are not available in the stock.");
        }
        stock -= qty;
        System.out.println(qty + " items purchased successfully.");
        displayStock();
    }

    public void displayStock() {
        System.out.println("Available stock: " + stock);
    }
}

public class OutOfStockException{
    public static void main(String[] args) {
        StockManager stockManager = new StockManager();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add Stock\n2. Purchase Product\n3. Display Stock\n4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the quantity to add: ");
                    int addQty = sc.nextInt();
                    stockManager.addStock(addQty);
                    break;
                case 2:
              System.out.print("Enter the quantity to purchase: ");
                    int purchaseQty = sc.nextInt();
                    try {
                        stockManager.purchase(purchaseQty);
                    } 
                    catch (StockException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    stockManager.displayStock();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
