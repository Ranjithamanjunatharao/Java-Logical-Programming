import java.util.Scanner;
class area
  {
    void cir()
    {
       int r;
      float pi= 3.14f;
      float area;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of r");
      r=sc.nextInt();
      area= pi*r*r;
      System.out.println("The area of a circle is:" +area);
    }
  }
class Circle
  {
    public static void main(String args[])
    {
area a1=new area();
      a1.cir();
    }
  }
