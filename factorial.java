//Java program to print factorial of a given number.(5!=1*2*3*4*5)
import java.util.Scanner;
class factorial
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n,mul=1;
      System.out.println("Enter the value of n");
      n=sc.nextInt();
      int i=1;
      while(i<=n)
        {
          mul=mul*i;
          i++;
        }
      System.out.print("The factorial of given number is:"+mul);
    }
  }