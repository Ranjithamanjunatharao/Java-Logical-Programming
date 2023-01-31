import java.util.*;
class Armstrong{
  public static void main(String args[]){
    int  n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your number :");
    n=sc.nextInt();
    double temp=n;
    String s=""+n;
    int rem;
    double  power=0;
    double  sum=0;
    while(n>0)
      {
       rem=n%10;
       power=Math.pow(rem,s.length());
       sum=sum+power;
       n=n/10;
      }
      if(temp==sum)
      System.out.println("It is Armstrong number");
      else
      System.out.println("It is not Armstrong number");
  }
}