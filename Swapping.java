import java.util.Scanner;
class Swapping
{
 public static void main(String args[])  
  {
int a,b,temp;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the value of a");
      a=sc.nextInt();
System.out.println("Enter the value of b");
      b=sc.nextInt();
 System.out.println("Before swapping: " + a + " , " + b);
temp=a;
a=b;
b=temp;
         System.out.println("After swapping: " + a + " , " +  b);
  }
    }