import java.util.Scanner;
class swapp
  {
    void swa(int a,int b)
    {
      int temp;
      System.out.println("Before swapping:" +a+ "," +b);
      temp=a;
      a=b;
      b=temp;
      System.out.println("After swapping:" +a+ "," +b);
      
    }
  }
class Swapping
  {
    public static void main(String args[])
    {
      int a,b;
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
      a=sc.nextInt();
      System.out.println("Enter the value of b");
      b=sc.nextInt();
      swapp s1=new swapp();
      s1.swa(a,b);
      
    }
  }