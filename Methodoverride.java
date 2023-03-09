class A
  {
    void display()
    {
      System.out.println("Parent");
    }
  }
class B extends A
  {
    void display()
    {
      super.display();
      System.out.println("Child");
    }
  }
class Methodoverride
  {
    public static void main(String args[])
    {
      B obj=new B();
      obj.display();
      /*A obj1=new A();
      obj1.display();*/
    }
  }