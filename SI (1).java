import java.util.Scanner;
class simple
  {
    void sim(float p,float t,float r)
    {
      float si;
      float totalamount;
      si=(p*t*r)/100;
      totalamount=p+si;
      System.out.println("Simple Interest: " +si);
      System.out.println("Total amount: " +totalamount);
    }
  }
class SI
  {
    public static void main(String args[])
    {
    float p,t,r;
      Scanner sc =new Scanner(System.in);
     System.out.println("Enter the value of p");
      p=sc.nextFloat();
    System.out.println("Enter the value of t");
      t=sc.nextFloat();
    System.out.println("Enter the value of r");
      r=sc.nextFloat();
      simple s1=new simple();
      s1.sim(p,t,r);
  }
  }