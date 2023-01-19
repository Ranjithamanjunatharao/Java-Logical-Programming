/*Create a program that converts Fahrenheit to Celsius using the formula (C = (F - 32) * 5/9).
 Ask the user to input a temperature in Fahrenheit.
Declare a double variable to store the Fahrenheit value.
Use the variable to calculate the equivalent temperature in Celsius and store the result in a double variable.
Print the result. */
import java.util.Scanner;
class Temperature
  {
     public static void main(String args[]){
       double f;
       double c;
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter the temperature in Fahrenheit");
      f=sc.nextDouble();
       c = (f - 32) * 5/9;
        System.out.println("The equivalent temperature in Celsius is= "+c);
     }
  }
       