class factorial1
  {
    int f=1,n=5,i;
    void fact()
    {
      for(i=1;i<=n;i++)
        f=f*i;
      System.out.println("The Factorial of "+n+" is:"+f);
    }
  }
class factorial2 extends factorial1
  {
    void fact()
    {
      int f=1,n=6;
      for(int i=1;i<=n;i++)
        f=f*i;
      System.out.println("The Factorial of "+n+" is:"+f);
    }
  }
class Factoverriding
  {
    public static void main(String args[])
    {
     factorial1 f1=new factorial1();
      factorial2 f2=new factorial2();
      factorial1 r;
      r=f1;
      r.fact();
      r=f2;
      r.fact();    
    }
  }