//Java program to print factorial of a given number.(5!=5*4*3*2*1)
import java.util.Scanner;
class factorial1
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n,fact=1;
      System.out.println("Enter the value of n");
      n=sc.nextInt();
      while(n>0)
        {
          fact=fact*n;
          n=n-1;
        }
      System.out.print("The factorial of given number is:"+fact);
    }
  }