/*2) Find Subarray with given sum | Set 1 (Non-negative Numbers)
 
Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
Output: Sum found between indexes 2 and 4
Explanation: Sum of elements between indices 2 and 4 is 20 + 3 + 10 = 33.
 */
import java.util.Scanner;
class Subarray
  {
    public static void main(String args[])
    {
      int sum=0,i,i1,i2,n;
      
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter the array size");
      n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("Enter the elements in an array");
      for(i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("Enter the first index");
      i1=sc.nextInt();
      System.out.println("Enter the second index");
      i2=sc.nextInt();
      for(i=i1;i<=i2;i++){
      sum=sum+a[i];
      }
       System.out.println("The sum of element of two index is"+sum);
    }
  }
