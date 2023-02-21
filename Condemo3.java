class Condemo1
  {
      int a,b;
    Condemo1() 
    {
      System.out.println("Its Default Constructor");
    }
    Condemo1(int n) 
    {
      System.out.println("The n value is:"+n);
    }
    Condemo1(int x,int y) 
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
class Condemo3
  {
    public static void main(String args[])
    {
       Condemo1 c2=new Condemo1(); 
        Condemo1 c3=new Condemo1(123); 
       Condemo1 c1=new Condemo1(100,200);  
       c1.display();
    }
  } 
// Type of the Argement
// No of Arguments
// order of arguments