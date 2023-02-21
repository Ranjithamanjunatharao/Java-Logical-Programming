//JFM1T3_Assignment1: 
/* Write a program to calculate the circumference of a circle and print the result in whole number. 
  Allow user to input the cirlce radius from terminal. 

  Sample Input:
    radius of the circle=6

  Expected Output:
   Circumference of the circle=38
   

*/ 

//import statement for java program to read inputs using Scanner class 
import java.util.Scanner;

public class Circle { 

//Define main method
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
//Declare the variables
double radius,cir;
    
System.out.println("radius of the circle=");
  //radius= scanner.nextInt();
radius= sc.nextDouble();
cir= 2*Math.PI*radius;

//Use the scanner class to provide radius at execution time
            /*
Scanner scanner = new Scanner(System.in);
System.out.println("Enter radius as a positive integer");
radius= scanner.nextInt();
*/
System.out.println("Circumference of the circle= "+(Math.round(cir)));
//Caluculate the circumference of the circle

//Casting the floating-point value to int  

//Print the Result
}
} 