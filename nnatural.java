//Java program to print n natural numbers
import java.util.Scanner;
class nnatural
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int i=1,n;
      System.out.println("Enter the value of n");
      n=sc.nextInt();
      while(i<=n)
        {
          System.out.print("\t"+i);
          i++;
        }
    }
  }