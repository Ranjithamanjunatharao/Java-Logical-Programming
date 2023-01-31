//Java program to check whether the given number is prime or not
import java.util.Scanner;
class prime
  {
    public static void main(String args[])
    {
      int n;
       int i=1;
      int c=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
       n=sc.nextInt();
       while(i<=n)
        {
          if(n%i==0){
          c++;
          }
          i++;
        }
          if(c==2)
           System.out.println("It is prime number");
          else
       System.out.println("It is not prime number");
    }
  }
         
            
            
            
            
            
          