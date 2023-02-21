/* JFM1T4_Assignment3:
   Write a program to print all the prime numbers between 2 numbers.
   Prompt the user to enter the 2 numbers.
   
   Sample Input:
   Enter starting Number: 20
   Enter ending Number: 30

   Expected Output:
   Prime numbers between 20 and 30 are : 
   23
   29

*/

import java.util.Scanner;

public class PrimeNumbers {

//Add main method here
  public static void main(String args[]){

//Declare variables num1, num2, i, count and initialize count as zero
    int i,c=0;

//Use the scanner class to provide input at execution time using scanner object
Scanner s= new Scanner(System.in);


//Take start value as input and read using scanner object
System.out.print("Enter Starting Number : ");
int start = s.nextInt();


//Take end value as an input and read using scanner object
System.out.print("Enter ending Number : ");
int last = s.nextInt();

//check for all the integer numbers which is between the two numbers given, using for loop
   for( i=start;i<=last;i++){
		    int n=i;
		    c=0;
		    for( int j=1;j<=n;j++){
		        if(n%j==0){   
		            c+=1;
		        }   
		    }
      
		    if(c==2){
		        System.out.println("your prime number is :"+i);
		    }
		}
  }
}