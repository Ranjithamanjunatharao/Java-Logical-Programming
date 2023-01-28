import java.util.Scanner;
class addit
  {
    void add(int a,int b)
    {
      int c;
      c=a+b;
      System.out.println("The addition of two numbers is: "+c);
    }
  }
class Addition
  {
    public static void main(String args[])
    {
    int a,b;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of a");
a=sc.nextInt();
System.out.println("Enter the value of b");
b=sc.nextInt();
addit a1= new addit();
a1.add(a,b);
  }
  }