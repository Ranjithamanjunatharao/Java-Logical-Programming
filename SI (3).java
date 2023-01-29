import java.util.Scanner;
class simple
  {
    float p,t,r;
    float si;
    float ta;
    float sim()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of p");
      p=sc.nextFloat();
    System.out.println("Enter the value of t");
      t=sc.nextFloat();
    System.out.println("Enter the value of r");
      r=sc.nextFloat();
    si= (p*t*r)/100;
      return si;
    }
    float sim1()
    {
      ta= p+si;
      return ta;
    }
  }
  class SI
{
     public static void main(String args[])
    {
      float x,y;
      simple s1=new simple();
     x= s1.sim();
      y= s1.sim1();
      System.out.println("Simple Interest is "+x);
    System.out.println("Total amount is "+y);
       }
}