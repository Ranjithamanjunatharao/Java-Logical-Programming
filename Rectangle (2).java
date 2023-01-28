import java.util.Scanner;
class area
  {
    float rec(float l,float w)
    {
      float area;
      area=l*w;
      return area;
    }
  }
class Rectangle
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      float l,w,z;
      System.out.println("Enter the length of the Rectangle:");
      l=sc.nextFloat();
       System.out.println("Enter the width of the Rectangle:");
      w=sc.nextFloat();
      area a1=new area();
     z= a1.rec(l,w);
       System.out.println("The area of the Rectangle is: "+z);
    }
  }