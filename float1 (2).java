import java.util.Scanner;
class point
  {
    float flo()
    {
      float f;
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the floating point value:");
      f=sc.nextFloat();
      //System.out.println("The given floating point value is:" +f);
      return f;
    }
  }
class float1
  {
    public static void main(String args[])
    {
      float z;
point p1=new point();
     z= p1.flo();   
      System.out.println("The given floating point value is:"+z);
    }
  }