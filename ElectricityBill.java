/* 4. Write a program to Calculate Electricity Bill. Accept last month units and present units in string format from the user. 
      Calculate Electricity Bill for last month units, otherwise throw ArithementicException along with some error message.  
      Handle NumberFormatException while converting units into numerical value. 

  Calculate Electricity Bill based on following charges:

  ==> first 50 units charges are: 0.50 per/unit
  ==> next 100 units charges are: 1.75 per/unit
  ==> next 100 units charges are: 2.50 per/unit
  ==> above 250 units charges are: 2.90 per/unit

  Add 10% surcharge on overall bill.

*/

/*public class ElectricityBill {

    public static void main(String args[]) {

    }
}*/
import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter last month units: ");
            int lastMonthUnits = Integer.parseInt(sc.nextLine());

            System.out.print("Enter present units: ");
            int presentUnits = Integer.parseInt(sc.nextLine());

            if (presentUnits < lastMonthUnits) {
                throw new ArithmeticException("Present units cannot be less than last month units");
            }

            int unitsConsumed = presentUnits - lastMonthUnits;
            double totalBill = 0;

            if (unitsConsumed > 250) {
                totalBill += (unitsConsumed - 250) * 2.90;
                unitsConsumed = 250;
            }

            if (unitsConsumed > 150) {
                totalBill += (unitsConsumed - 150) * 2.50;
                unitsConsumed = 150;
            }

            if (unitsConsumed > 50) {
                totalBill += (unitsConsumed - 50) * 1.75;
                unitsConsumed = 50;
            }

            totalBill += unitsConsumed * 0.50;

            System.out.println("Electricity bill: " + totalBill);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
