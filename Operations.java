/*  JFM1T2_Assignment1:

     Write a program to perform the below actions and print the result.
     1. Difference of 2 numbers (30 and 10)
     2. Product of 2 numbers (45 and 2)
     3. Division of 2 numbers (600 and 10)
     4. Increment and Decrement the number (15)
     5. Remainder of 2 numbers (14 and 5)
     Prompt the user input from the terminal.
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class Operations {

//main method
public static void main(String[] args){
  int c;
Scanner sc=new Scanner(System.in);  
/*
  Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
*/
System.out.println("Enter first number: ");
int a=sc.nextInt();
System.out.println("Enter second number: ");
int b=sc.nextInt();
 // System.out.println("Enter number: ");
 // int a=sc.nextInt();
c = a-b;
  //c = a*b;
  //c = a/b;
  //c = ++a;
  //c = --a;
 // c = a%b;
/*
  Take input from user
  System.out.println("Enter first number: ");
  int a=sc.nextInt();
*/
System.out.println("Difference of 2 numbers: " +c);
 // System.out.println("Product of 2 numbers: " +c);
  //System.out.println("Division of 2 numbers: " +c);
  //System.out.println("increment of the number: " +c);
  //System.out.println("decrement of the number: " +c);
  //System.out.println("Remainder of 2 numbers: " +c);
//calculate difference,product,division,increment and remainder 

//print appropriate result for all operations
}

@Override
public String toString() {
	return "Operations []";
}
}
// good
