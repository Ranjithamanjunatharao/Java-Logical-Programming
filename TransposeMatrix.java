/* JFM1T5_Assignment 4:

   Write a program to create a square matrix and print its transpose.
   Prompt the user input from the terminal.
   
  Sample Input:
  Enter number of rows: 3
  Enter number of columns: 3
  Elements  [1,1] : 2
  Elements  [1,2] : 3
  Elements  [1,3] : 4
  Elements  [2,1] : 1
  Elements  [2,2] : 2
  Elements  [2,3] : 3
  Elements  [3,1] : 4
  Elements  [3,2] : 5
  Elements  [3,3] : 6
   
  Expected Output:
    
  After Transpose Matrix  
  2       1       4
  3       2       5
  4       3       6
   
*/

import java.util.Scanner;

public class TransposeMatrix {

//Define the main method
  //Declare the variables
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  //Take input from user to enter rows and column values
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
//Convert the square matrix into transpose
for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Elements [%d,%d] : ", i+1, j+1);
                matrix[i][j] = sc.nextInt();
            }
        }
 System.out.println("\nOriginal Matrix:");
        printMatrix(matrix);
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
  //Print the transpose matrix
        System.out.println("\nAfter Transpose Matrix:");
        printMatrix(transpose);
        sc.close();
    }
  //printing j and i instead of i and j
  public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

}
}