/* write  a prgram to print student number and student names and 3 subject marks and calculate total and average print an report*/
import java.util.Scanner;
class study
  {
    
    int totalmarks;
    float averagemarks;
    Scanner sc=new Scanner(System.in);
    int stu()
    {
   int sno;
   String sname;
   int p,c,b;
    System.out.println("Enter the Student number");
      sno=sc.nextInt();
        System.out.println("Enter the Student name");
      sname=sc.next();
        System.out.println("Enter the Physics marks");
      p=sc.nextInt();
       System.out.println("Enter the Chemistry marks");
      c=sc.nextInt();
       System.out.println("Enter the Biology marks");
      b=sc.nextInt();
     totalmarks=p+c+b;
       System.out.println("Student Report ");
       System.out.println("---------------");
      System.out.println("Student number= "+sno);
       System.out.println("Student name= "+sname);
       System.out.println("Physics marks= "+p);
       System.out.println("Chemistry marks= "+c);
       System.out.println("Biology marks= "+b);
      return totalmarks;
        }
    float stu1()
    {
      averagemarks=totalmarks/3;
       return averagemarks;
    }
  }
  
class Student
  {
    public static void main(String args[])
    {
      int x;
      float y;
       study s1 = new study();
      x=s1.stu();
      y=s1.stu1();
      System.out.println("Total Marks= "+x);
       System.out.println("Average Marks= "+y);
    }
  }