/*ake 3 subjects as input
 
find total & average
 
if  every subject above 40 marks print student pass otherwise fail
 
if student is pass then allot the grade based on the average
 
           if  average  below 50 ----> allot C Grade
 
           if  average  between 51-70  ----> allot B Grade        
 
           if  average  between 71-80  ----> allot A Grade        
 
          above 80 you need to print " Student Pass in Distension"*/
import java.util.Scanner;
class Student
  {
     public static void main(String args[])
    {
       int sno;
       String sname;
       int p,c,b;
       int totalmarks;
       float avg;
       Scanner sc=new Scanner(System.in);
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
      avg=totalmarks/3;
      System.out.println("Student number= "+sno);
       System.out.println("Student name= "+sname);
       System.out.println("Physics marks= "+p);
       System.out.println("Chemistry marks= "+c);
       System.out.println("Biology marks= "+b);
       System.out.println("Total Marks= "+totalmarks);
       System.out.println("Average Marks= "+avg);
      if(p>=40 && c>=40 && b>=40)
      {
        System.out.println("Student is pass");
        if(avg<=50)
        {
          System.out.println("Grade C");
        }
        else if(avg>=51 && avg<=70)
        {
          System.out.println("Grade B");
        }
        else if(avg>=71 && avg<=80)
        {
         System.out.println("Grade A"); 
        }
        else if(avg>=81 && avg<=100)
        {
          System.out.println("Student Passed in Distinction"); 
        }
      
      }
        
      else
      {
         System.out.println("Student is fail");
      }
    }
  }