/* 3. Given the price of n books, find the sum of the price of the Costliest k books. 
      The price of books is given in the form of an array. Use bubble sort algorithm for sorting. 
      Note that k is always less than n.
      Sample Input:-  n = 5 , arr =[3, 14, 54, 21, 41], k=2
      Expected Output:- The sum of k costliest book which can be brought is 95
*/

import java.util.Scanner;

public class BookPrice_Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get inputs
        System.out.print("Enter the number of books: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the prices of the books:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        // Sort the array using bubble sort
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        // Calculate the sum of the prices of the costliest k books
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        System.out.println("The sum of the prices of the costliest " + k + " books which can be brought is " + sum);
    }
}

