import java.util.*;
class sumofodd{
  public static void main(String args[]){
    int  n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your number :");
    n=sc.nextInt();
    int rem;
    int sum=0;
    while(n>0)
      {
       rem=n%10;
       if(rem%2!=0){
           sum=sum+rem;
           
       }
       n=n/10;
       
      }
      System.out.println(sum);
      
  }
}