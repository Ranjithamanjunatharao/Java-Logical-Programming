import java.util.*;
class forfibonacci
{
  public static void main(String args[])
  {
    int i,num,f1=1,f2=0,f3=0;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter any number:");
    num=sc.nextInt();
    for(i=1;i<=num;i++)
      {
       System.out.print("\t"+f3);
        f3=f1+f2;
        f1=f2;
        f2=f3;
      }
  }
}