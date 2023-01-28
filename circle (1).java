import java.util.Scanner;
class circ
  {
    float cir(float r)
    {
      float area;
      float f=3.14f;
      area=f*r*r;
      return area;
    }
  }
class circle
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      float r,z;
      System.out.println("Enter the Radius Value: ");
      r=sc.nextFloat();
      circ c1=new circ();
      z=c1.cir(r);
      System.out.println(z);
    }
  }