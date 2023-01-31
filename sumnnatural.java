//Java program to print sum of n natural numbers
import java.util.Scanner;
class sumnnatural
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n,sum=0;
      System.out.println("Enter the value of n");
      n=sc.nextInt();
      int i=1;
      while(i<=n)
        {
          sum=sum+i;
          i++;
        }
      System.out.print("The sum of n natural numbers is:"+sum);
    }
  }