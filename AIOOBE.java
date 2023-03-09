class Exp
  {
    void display()
    {
      try{
      int a[]=new int[5];
      a[6]=10;
    }
      catch(ArrayIndexOutOfBoundsException e)
        {
          System.out.println(e);
        }
      System.out.println("Exception handled...");
    }
  }
class AIOOBE
  {
    public static void main(String args[])
    {
      Exp obj=new Exp();
      obj.display();
    }
  }