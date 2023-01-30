//Write a program to calculate the area and volume of a cylinder given its radius and height.
import java.util.Scanner;
class Cylin
  {
    double volume;
    double area;
    double vol(double r,double h)
    {
      volume=(3.14)*r*r*h;
        return volume;
    }
    double are(double r,double h)
    {
      area=(2*(3.14)*r*h)+(2*(3.14)*r*r);
      return area;
    }
  }
class Cylinder
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      double r,h;
      double x,y;
      System.out.println("Enter the Radius of a Cylinder:");
      r=sc.nextDouble();
      System.out.println("Enter the height of a Cylinder:");
      h=sc.nextDouble();
      Cylin c1=new Cylin();
      x=  c1.vol(r,h);
      y=  c1.are(r,h);
      System.out.println("The Volume of the Cylinder is:"+x); 
   System.out.println("The Area of the Cylinder is:"+y);  
    }
  }