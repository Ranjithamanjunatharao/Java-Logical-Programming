import java.util.Scanner;
class posneg
  {
    public static void main(String args[])
    {
      int a;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number :");
      a=sc.nextInt();
      if(a>0)
      {
         System.out.println("It is positive number");
      }
        else
      {
         System.out.println("It is negative number");
      }
    }
  }
