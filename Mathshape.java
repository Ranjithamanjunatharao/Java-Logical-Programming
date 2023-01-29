import java.util.Scanner;
class shape{
  double c;
  void rec(double a,double b)
  {
    c=a*b;
    System.out.println("The area of a Rectangle is:"+c);
  }
  void sqr(double a)
  {
    c=a*a;
    System.out.println("The area of a Square is:"+c);
  }
  void cir(double a)
  {
    c=(3.14)*a*a;
    System.out.println("The area of a circle is:"+c);
  }
  void tri(double a,double b)
  {
    c=(0.5)*a*b;
    System.out.println("The area of a Rectangle is:"+c);
  }
  }
class Mathshape
  {
    public static void main(String args[])
    {
    double a,b;
    String ch; 
      Scanner sc= new Scanner(System.in);
      System.out.println("Shapes");
      System.out.println("-------");
      System.out.println("[1].Rectangle");
      System.out.println("[2].Square");
      System.out.println("[3].circle");
      System.out.println("[4].Triangle");
      System.out.println("Enter the Shape of your choice");
      ch=sc.next();
      shape s1=new shape();
      switch(ch)
        {
          case "Rectangle" :
           System.out.println("Enter the length and breadth of a rectangle:");
            a=sc.nextDouble();
            b=sc.nextDouble();
            s1.rec(a,b);
            break;
          case "Square":
           System.out.println("Enter the side of a square:");
           a=sc.nextDouble();
            s1.sqr(a);
            break;
          case "Circle":
            System.out.println("Enter the radius of the circle");
            a=sc.nextDouble();
            s1.cir(a);
            break;
          case "Triangle":
            System.out.println("Enter the base and height of the Triangle:");
            a=sc.nextDouble();
            b=sc.nextDouble();
            s1.tri(a,b);
            break; 
            
            
        }
    }
}