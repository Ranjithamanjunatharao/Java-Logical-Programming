import java.io.*;
import java.lang.*;
public class Trycatch1
{
  public static void main(String args[])
  {
    try
      {
        int n=Integer.parseInt("123abc");
        int b=5000;
        int res=b/2;
        System.out.println("Result is..."+res);
        int a[]=new int[15];
        a[20]=500;
        System.out.println("value of a[10]="+a[20]);
      }
    catch(ArrayIndexOutOfBoundsException e)
      {
        System.out.println("exception error..."+e.getMessage());
      }
    catch(ArithmeticException ex)
      {
        System.out.println("Arithmetic..."+ex);
      }
    catch(Exception ex)
      {
        System.out.println("Exception.."+ex.getMessage());
      }
  }
}