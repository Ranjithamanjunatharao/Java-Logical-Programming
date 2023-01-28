import java.util.Scanner;
class simple
  {
    void sim()
    {
      float p,t,r;
    float si;
    float ta;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of p");
      p=sc.nextFloat();
    System.out.println("Enter the value of t");
      t=sc.nextFloat();
    System.out.println("Enter the value of r");
      r=sc.nextFloat();
    si= (p*t*r)/100;
    ta= p+si;
    System.out.println("Simple Interest is "+si);
    System.out.println("Total amount is "+ta);
    }
  }
  class SI
{
     public static void main(String args[])
    {
      simple s1=new simple();
      s1.sim();
       }
}