class Parent
  {
    Parent()
    {
      System.out.println("Parent constructor");
    }
    int a=40;
    void display()
    {
      System.out.println("Parent");
    }
  }
class Child extends Parent
  {
    Child()
    {
      System.out.println("Child constructor");
    }
    int a=30;
    void display()
    {
      System.out.println("Class");
       System.out.println(a);
      System.out.println(super.a);
      super.display();
    }
  }
class parentchildsuper
  {
public static void main(String args[])
    {
      Child obj=new Child();
      obj.display();
    }

  }