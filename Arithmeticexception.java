class Exp
  {
    void display()
    {
      try{
      int a=60/0;
      }
      catch(ArithmeticException e)
        {
          System.out.println(e);
        }
    
      System.out.println("Exception handled...");
  }
  }
class Arithmeticexception
  {
    public static void main(String args[])
    {
      Exp obj=new Exp();
      obj.display();
    }
  }