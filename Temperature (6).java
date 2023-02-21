/* JFM1T5_Assignment3:

   Write a program to store the temperature of your city for last 7 days and print the lowest temperature of the week.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of days 
   3
   Enter the temperature of Day :1
   88
   Enter the temperature of Day :2
   34
   Enter the temperature of Day :3
   0 
   
   Expected Output:
   The lowest temperature of the week 3 is 0.0 celsius

*/


import java.util.Scanner;

public class Temperature{

//Define the main method
public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
    
//Declare the variables and initialize
System.out.print("Enter number of days: ");
        int numDays = sc.nextInt();
        double[] temperatures = new double[numDays];
//Take temperature of 7 days as a input from user
for (int i = 0; i < numDays; i++)
  {
System.out.printf("Enter the temperature of Day %d: ", i+1);
  double temp = sc.nextDouble();
  temperatures[i] = temp;
   }
//Calculate the lowest temperature
double lowestTemp = temperatures[0];
        for (int i = 1; i < numDays; i++) {
            if (temperatures[i] < lowestTemp) {
                lowestTemp = temperatures[i];
            }
        }
//Print the result
  System.out.printf("The lowest temperature of the week %d is %.1f celsius.", numDays, lowestTemp);
        sc.close();
  }
}