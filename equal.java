import java.util.*;
class equal
  {
    public static void main(String args[])
    {
    int a,b,c;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of a");
a=sc.nextInt();
System.out.println("Enter the value of b");
b=sc.nextInt();
      System.out.println("Enter the value of c");
c=sc.nextInt();
       if(a==b && b==c)
        {
         System.out.println("All variables are equal");
        }
        else
        {
          System.out.println("All variables are not equal");
        }
    }
  }