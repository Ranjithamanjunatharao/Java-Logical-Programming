/* 2. Given an array of n integers. Write an efficient java code using merge sort algorithm to 
      find the sum of  First and last element i. e., smallest and largest elements in the array. 
      also print the sorted array.
      Sample Input:- n=5 , arr=[1,4,2,3,5]
      Expected Output:- Sum is 6
      Smallest Element : 1
      Largest element : 5
*/

import java.util.Scanner;

public class MaxMinSum_Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get inputs
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sort the array using Merge Sort algorithm
        mergeSort(arr, 0, n-1);

        // Find the sum of the smallest and largest elements in the array
        int sum = arr[0] + arr[n-1];

        // Print the sorted array and the sum of the smallest and largest elements
        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nSum of smallest and largest elements is " + sum);
        System.out.println("Smallest element: " + arr[0]);
        System.out.println("Largest element: " + arr[n-1]);
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;

            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);

            merge(arr, low, mid, high);
        }
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[arr.length];
        int i = low;
        int j = mid+1;
        int k = low;

        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while (j <= high) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        for (int x = low; x <= high; x++) {
            arr[x] = temp[x];
        }
    }
}

