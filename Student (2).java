/* write  a prgram to print student number and student names and 3 subject marks and calculate total and average print an report*/
import java.util.Scanner;
class study
  {
    int sno;
   String sname;
   int p,c,b;
    int totalmarks;
    float averagemarks;
    Scanner sc=new Scanner(System.in);
    void stu()
    {
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
       averagemarks=totalmarks/3;
      System.out.println("Student number= "+sno);
       System.out.println("Student name= "+sname);
       System.out.println("Physics marks= "+p);
       System.out.println("Chemistry marks= "+c);
       System.out.println("Biology marks= "+b);
       System.out.println("Total Marks= "+totalmarks);
       System.out.println("Average Marks= "+averagemarks);
      
    }
  }
  
class Student
  {
    public static void main(String args[])
    {
      
       study s1 = new study();
      s1.stu();
    }
  }