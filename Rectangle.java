import java.util.Scanner;
class Rectangle
  {
    public static void main(String args[])
    {
      float l,w;
      float area;
      float circumference;
      Scanner sc=new Scanner(System.in);
       System.out.println("Enter the value of l");
      l=sc.nextFloat();
       System.out.println("Enter the value of w");
      w=sc.nextFloat();
      area= l*w;
      circumference= 2*(l+w);
       System.out.println("The area of the Rectangle is:" +area);
      System.out.println("The circumference of the Rectangle is:" +circumference);
    }
  }
    
        
      
      
      