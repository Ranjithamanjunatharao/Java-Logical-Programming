//Reverse of a given number
import java.util.*;
class Reverseofnum{
  public static void main(String args[]){
    int  n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your number :");
    n=sc.nextInt();
    int rem; //remainder
    int rev=0; //or sum=0
    while(n>0)
      {
       rem=n%10;
       rev=(rev*10)+rem;
        n=n/10;
      }
      System.out.println(rev);
  }
}