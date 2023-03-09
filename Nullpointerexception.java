class Exp
  {
    void display()
    {
      try
        {
        String str=null;
        System.out.println(str.length());
      }
      catch(NullPointerException e)
        {
        System.out.println(e);
        }
      System.out.println("Exception handled...");
    }
  }
class Nullpointerexception
  {
    public static void main(String args[])
    {
      Exp obj=new Exp();
      obj.display();
    }
  }