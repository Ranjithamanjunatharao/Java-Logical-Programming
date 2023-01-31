//Java program to check the given number is Palindrome or not
import java.util.Scanner;
class palindrome{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n;
    int sum=0;
    int rem;//remainder
    int temp;
    System.out.println("Enter the value of n:");
    n=sc.nextInt();
     temp=n;
    while(n>0)
      {
        rem=n%10;
        sum=(sum*10)+rem;
        n=n/10;
      }
    if(temp==sum)
      System.out.println("It is a Palindrome");
      else
      System.out.println("It is not a Palindrome");
  }
}