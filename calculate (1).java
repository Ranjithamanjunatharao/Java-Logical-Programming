import java.util.Scanner;
class Addition1
  {
    int a,b,c;
     Scanner sc=new Scanner(System.in);
    void add()
    {
      System.out.println("Enter the value of a");
      a=sc.nextInt();
       System.out.println("Enter the value of b");
      b=sc.nextInt();
      c=a+b;
      System.out.println("The addition of two numbers are= "+c);
    }
  }
class calculate
  {
    public static void main(String args[])
    {
      Addition1 a1= new Addition1();
      a1.add();
    }
  }
  