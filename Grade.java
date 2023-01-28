/*Write a program that takes a grade as input and prints out the corresponding letter grade using else if ladder statements. */
import java.util.Scanner;
class Grade
  {
    public static void main(String args[])
    {
      char grade;
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the Grade");
      grade=sc.next().charAt(0);
      if(grade=='a')
      {
        System.out.println("Grade A");
      }
       else if(grade=='b')
       {
        System.out.println("Grade B");
       }
        else if(grade=='c')
        {
        System.out.println("Grade C");
        }
          else if(grade=='d')
          {
        System.out.println("Grade D");
          }
      else{
        System.out.println("Invalid input");
      }
    }
  }