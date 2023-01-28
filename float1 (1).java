import java.util.Scanner;
class point
  {
    void flo()
    {
      float f;
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the floating point value:");
      f=sc.nextFloat();
      System.out.println("The given floating point value is:" +f);
    }
  }
class float1
  {
    public static void main(String args[])
    {
point p1=new point();
      p1.flo();   
    }
  }