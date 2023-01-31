//Java program to print even numbers upto to given number.
import java.util.Scanner;
class even
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n;
      System.out.println("Enter the value of n");
      n=sc.nextInt();
      int i=2;
      while(i<=n)
        {
          if(i%2==0)
          {
            System.out.println(i);
          }
          i++;
        }
       }
  }