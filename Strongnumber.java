//Java program to find a given number is strong number or not
import java.util.*;
class Strongnumber{
  public static void main(String args[]){
    int  n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your number :");
    n=sc.nextInt();
    int temp=n;
    int rem;//remainder
    int fact=1;//factorial
    int sum=0;
    while(n>0)
      {
       rem=n%10;
       while(rem>0){
           fact=fact*rem;
           rem--;
       }
       sum=sum+fact;
       n=n/10;
       fact=1;
      }
      if(temp==sum)
      System.out.println("It is Strong number");
      else
      System.out.println("It is not strong number");
  }
}