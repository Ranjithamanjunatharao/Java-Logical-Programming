class A
  {
    void display()
    {
      System.out.println("Method overloading");
    }
    void display(int a)
    {
      System.out.println("a = "+a);
    }
    void display(int b,String str)
    {
      System.out.println("b = "+b+" str ="+str);
    }
  }
class Methodoverloading
  {
    public static void main(String args[])
    {
      A obj=new A();
      obj.display();
      obj.display(10);
      obj.display(20,"ranju");
    }
  }