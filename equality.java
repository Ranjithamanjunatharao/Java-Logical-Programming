/*Write a program that takes three integers as input and checks if they are all equal using nested if statements.*/
import java.util.Scanner;
class equality
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
      if(a==b){
        if(a==c){
          if(b==c){
            System.out.println("Three integers are equal");
          }
        }
      }
      else{
        System.out.println("Three integers are not equal");
      }
    }
  }
