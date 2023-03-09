class Exp
  {
    void display()
    {
      try
        {
        String str="hello";
        int num=Integer.parseInt(str);//typecasting(str-->int)
      }
      catch(NumberFormatException e)
        {
        System.out.println(e);
        }
      System.out.println("Exception handled...");
    }
  }
class NumberFormatException
  {
    public static void main(String args[])
    {
      Exp obj=new Exp();
      obj.display();
    }
  }