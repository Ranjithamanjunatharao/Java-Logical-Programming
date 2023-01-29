import java.util.Scanner;
class area 
{
  float l,w;
      float area;
      float circumference;
  float rec()
  {
     Scanner sc=new Scanner(System.in);
       System.out.println("Enter the value of l");
      l=sc.nextFloat();
       System.out.println("Enter the value of w");
      w=sc.nextFloat();
      area= l*w;
     return area;
  }
  float rec1()
  {
     circumference= 2*(l+w);
    return circumference;
  }
}
  class Rectangle
  {
    public static void main(String args[])
    {
      float x,y;
area a1=new area();
    x=  a1.rec();
     y= a1.rec1();
      System.out.println("The area of the Rectangle is:"+x);
       System.out.println("The area of the circumference is:"+y);
    }
  }
