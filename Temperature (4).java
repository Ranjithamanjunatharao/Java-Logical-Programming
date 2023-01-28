import java.util.Scanner;
class test
  {
    float temp(float f)
    {
      float c;
      c=(f-32)*5/9;
      return c;
    }
  }
class Temperature
  {
    public static void main(String args[])
    {
      float f,z;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Temperature in Faranheit");
      f=sc.nextFloat();
    test t1= new test();
     z= t1.temp(f);
      System.out.println("Temperature in celsius is: "+z);
      
    }
  }