import java.util.Scanner;
class Radius
  {
    float area;
     float pi=3.14f;
    void Cir(float r)
    {
    area= pi*r*r;
     System.out.println("The area of the circle is "+area);
  }
  }
class Circle1{
  
    public static void main(String args[])
    {
      float r;
      Radius c1=new Radius();
Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of r");
      r=sc.nextFloat();
      c1.Cir(r);
    }
  }