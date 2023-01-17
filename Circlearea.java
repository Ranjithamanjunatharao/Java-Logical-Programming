import java.util.Scanner;
class Circlearea
  {
    public static void main(String args[])
    {
      int r;
      float pi= 3.14f;
      float area;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of r");
      r=sc.nextInt();
      area= pi*r*r;
      System.out.println("The area of a circle is:" +area);
      area=sc.nextFloat();
    }
  }