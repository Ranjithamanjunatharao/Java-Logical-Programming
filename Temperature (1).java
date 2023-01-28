import java.util.Scanner;
class test
  {
    void temp(float f)
    {
      float c;
      c=(f-32)*5/9;
      System.out.println("The celsius value is: "+c);
    }
  }
class Temperature
  {
    public static void main(String args[])
    {
      float f;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of f");
      f=sc.nextFloat();
    test t1= new test();
      t1.temp(f);
    }
  }