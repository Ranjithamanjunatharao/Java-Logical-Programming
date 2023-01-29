import java.util.Scanner;
class area
  {
    float cir()
    {
       float r;
      float pi= 3.14f;
      float area;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of r");
      r=sc.nextFloat();
      area= pi*r*r;
      return area;
    }
  }
class circle
  {
     public static void main(String args[])
    {
      float z;
    area a1=new area();
     z= a1.cir();
      System.out.println("The area of a circle is:" +z);
    }
  }
