/*1)Find a peak element which is not smaller than its neighbours.
Input: array[]= {5, 10, 20, 15}
Output: 20
Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.*/
import java.util.Scanner;
class Peakelement
  {
    public static void main(String args[])
    {
      int i,n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter your array size");
      n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("Enter your array elements");
      for(i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      if(n==1){
        System.out.println("The peak element is: "+a[0]);
      }
      if(n>1){
if(a[0]>=a[1]){
   System.out.println("The peak element is: "+a[0]);
}
    if(a[n-1]>=a[n-2]){
   System.out.println("The peak element is: "+a[n-1]);
}    
     for(i=1;i<n-1;i++)
       {
         if(a[i]>=a[i-1]&& a[i]>=a[i+1])
         {
          System.out.println("The peak element is: "+a[i]); 
         }
       }
      }
    }
  }