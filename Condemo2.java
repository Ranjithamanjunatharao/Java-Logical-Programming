class Condemo1
  {
      int a,b;
    Condemo1(int x,int y)  // Parameterized Constructor
    {
      a=x;
      b=y;
    }
    void display()
    {
      System.out.println("The a value is:"+a);
      System.out.println("The b value is:"+b);
    }
  }
class Condemo2
  {
    public static void main(String args[])
    {
       Condemo1 c1=new Condemo1(100,200);  
       c1.display();
    }
  }