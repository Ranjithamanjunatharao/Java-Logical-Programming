abstract class base
{
abstract void calculate(int n);
}
class derive1 extends base
{
void calculate(int n)
  {
    System.out.println("The Square of the Given Number is:"+(n*n));
  }
}
class derive2 extends base
{
  void calculate(int n)
  {
    System.out.println("The Cube of the Given Number is:"+(n*n*n));
  }
}
class derive3 extends base
{
  void calculate(int n)
  {
    System.out.println("The Square root of the Given Number is:"+Math.sqrt(n));
  }
  
}
class Abstraction
{
  public static void main(String arg[])
  {
    derive1 a1=new derive1();
    derive2 a2=new derive2();
    derive3 a3=new derive3();
    a1.calculate(3);
    a2.calculate(5);
    a3.calculate(25);
  }
}