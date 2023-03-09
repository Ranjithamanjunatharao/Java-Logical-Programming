class A
  {
    int a=10;//instance variable
    void display()
    {
      int a=20;//local variable
      System.out.println(a);
        System.out.println(this.a);
    }
  }
class Thiskeyword
  {
    public static void main(String args[])
    {
      A obj=new A();
      obj.display();
    }
  }