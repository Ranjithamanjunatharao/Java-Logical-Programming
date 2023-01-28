/* write  a prgram to print student number and student names and 3 subject marks and calculate total and average print an report*/
import java.util.Scanner;
class marks
  {
    float total;
    float stu()
    {
       float average;
      average=total/3;
      return average;
     
      }
    float stu1(float p,float c,float b)
    {
      
      total=p+c+b;
      return total;
    }
     }
class Student
  {
    public static void main(String args[])
    {
      int sno;
    String sname;
      float p,c,b,x,y;
    Scanner sc=new Scanner(System.in);
      System.out.println("Enter the student number");
      sno=sc.nextInt();
      System.out.println("Enter the student name");
      sname=sc.next();
      System.out.println("Enter the marks of physics");
p=sc.nextInt();
 System.out.println("Enter the marks of chemistry");
c=sc.nextInt();
 System.out.println("Enter the marks of Biology");
b=sc.nextInt();
       System.out.println("The student number is: "+sno);
      System.out.println("The student name is: "+sname);
      System.out.println("The student Physics is: "+p);
      System.out.println("The marks of chemistry is: "+c);
      System.out.println("The marks of Biology is: "+b);
       //System.out.println("The Total marks is: "+total);
     // System.out.println("The average marks is: "+average);
      
      
      
marks m1=new marks();
     
     y= m1.stu1(p,c,b);
      x= m1.stu();
      System.out.println("The Total marks is: "+y);
      System.out.println("The average marks is: "+x);
      
  }
  }