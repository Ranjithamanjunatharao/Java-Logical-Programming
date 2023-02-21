/* 
   JFM1T5_Assignment 5:
   Write a program to find and print the maximum element in a two-dimensional array with its index position.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of row and column: 
   2
   3
   Enter arr [ 0 ] [ 0] : 1
   Enter arr [ 0 ] [ 1] : 2
   Enter arr [ 0 ] [ 2] : 3

   Enter arr [ 1 ] [ 0] : 4
   Enter arr [ 1 ] [ 1] : 5
   Enter arr [ 1 ] [ 2] : 6
   
   Expected Output:
   Largest element in array is 6 and its index position is arr [ 1 ] [ 2 ]  

*/

import java.util.Scanner;

public class TwoDimentionalArray {

//Define the main method
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//Declare the variables
System.out.print("Enter number of row and column: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
//Take number of rows and columns from user in two-dimensional array
int max = arr[0][0];
        int maxRow = 0, maxCol = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
    System.out.printf("Enter arr [ %d ] [ %d ] : ", i, j);
                arr[i][j] = sc.nextInt();
//assume first element is largest and use for loop to compare the largest element with all the reamaining elements
  //Calcualte the maximum element based on index poistion
 if (arr[i][j] > max) {
  max = arr[i][j];
  maxRow = i;
  maxCol = j;
       }
            }
        }
//Print result
System.out.printf("\nLargest element in array is %d and its index position is arr [ %d ] [ %d ]\n", max, maxRow, maxCol);
        sc.close();

}
}