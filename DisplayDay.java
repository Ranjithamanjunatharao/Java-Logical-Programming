/*
  JFM1T4_Assignment2:
  Write a program to display the name of the day, based on the number, using the switch statement.
  Prompt the user to input a number between 1 and 7. 
  
  Sample Input: 1
  
  Expected Output: Monday
  
*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class DisplayDay {

//declare number variable
public static void main(String args[])
  {
//Use the scanner class to provide input at execution time using scanner object
Scanner sc= new Scanner(System.in);
    int number;
    System.out.println("Enter value for displaying day:");
number=sc.nextInt();
    switch(number)
    {
      case 1: 
        System.out.printf("Monday");
        break;
        case 2: 
        System.out.printf("Tuesday");
        break;
         case 3: 
        System.out.printf("Wednesday");
        break;
         case 4: 
        System.out.printf("Thursday");
        break;
         case 5: 
        System.out.printf("Friday");
        break;
         case 6: 
        System.out.printf("Saturday");
        break;
         case 7: 
        System.out.printf("Sunday");
        break;
      }

/*
Take input of the number for displaying day
System.out.println("Enter value for displaying day:");
number=sc.nextInt();
*/

//Declare switch case and check the input value to print the day entered by the user
  }    
}