import java.util.Scanner;
class area
  {
     float area;
      float circumference;
    void Rec(float l,float w)
    {
    area= l*w;
      circumference= 2*(l+w);
    System.out.println("The area of the Rectangle is:" +area);
System.out.println("The circumference of the Rectangle is:" +circumference);
  }
  }
class Rectangle1
{
  public static void main(String args[])
    {
      float l,w;
      area a1=new area();
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the value of l");
      l=sc.nextFloat();
       System.out.println("Enter the value of w");
      w=sc.nextFloat();
    a1.Rec(l,w);
}
}