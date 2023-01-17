import java.util.Scanner;
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
      
      System.out.println("The addition of "+a+" and "+b+" is" +(a+b));
    }
                        
  }