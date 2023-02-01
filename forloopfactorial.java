import java.util.Scanner;
class forloopfactorial
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n,fact=1;
      System.out.println("Enter the value of n");
      n=sc.nextInt();
      for( ; n>0;n--)
        {
          fact=fact*n;
      
        }
      System.out.print("The factorial of given number is:"+fact);
    }
  }