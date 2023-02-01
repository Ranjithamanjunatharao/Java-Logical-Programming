import java.util.Scanner;
class dowhilefact
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n,fact=1;
      System.out.println("Enter the value of n");
      n=sc.nextInt();
      do
        {
          fact=fact*n;
          n=n-1;
        }while(n>0);
         System.out.print("The factorial of given number is:"+fact);
    }
  }