class A
  {
    void add()
    {
      int a=10,b=20;
      int c=a+b;
      System.out.println("Sum of a+b= :"+c);
    }
    void add(int x,int y)
    {
      int z=x+y;
       System.out.println("Sum of x+y= :"+z);
    }
  }
class Methodoverload
  {
    public static void main(String args[])
    {
      A obj=new A();
      obj.add();
      obj.add(50,50);
    }
  }