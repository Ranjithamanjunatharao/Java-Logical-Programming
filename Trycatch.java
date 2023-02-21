import java.util.*;
class Trycatch
{
  Scanner sc = new Scanner(System.in);
  int a, b,c;
  void division() 
  {
    try
    {
      System.out.println("Enter a,b values:");
      a = sc.nextInt();
      b = sc.nextInt();
      c = a / b;
      System.out.println("The Divison value is:" + c);
    }
    catch (ArithmeticException ae) {
      System.out.println("The Exception Occur");
      System.out.println("The Exception Occur"+ae);
      System.out.println("The Exception Occur"+ae.getMessage());
    }
  }
  public static void main(String args[])
  {
    Trycatch ae1 = new Trycatch();
    ae1.division();
  }
}
