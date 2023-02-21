import java.util.Scanner;
class Studentdata
{
  void 
    int s_no,s1,s2,s3;
     String s_name;
  int tot;
  float avg;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter student number :");
    s_no=sc.nextInt();
    System.out.println("enter student  name :");
    s_name=sc.next();
    System.out.println("enter subject1,subject2,subject3 marks :");
    s1=sc.nextInt();
    s2=sc.nextInt();
    s3=sc.nextInt();

void Marks(){
     tot=(s1+s2+s3);
    avg=((float)tot/3);
}
}
  
interface B
{

}
class C extends A implements B
{
 System.out.println(" STUDENT DETAILS ");
    System.out.println(" ----------------");
    System.out.println("The Student Number is : " + s_no);
    System.out.println("The Student Name   is : " + s_name);
    System.out.println("The Student Marks  is : ");
    System.out.println("Maths :" + s1);
    System.out.println("Phys :" + s2);
    System.out.println("Chemi :" + s3);
    System.out.println("Student Total is :" + tot);
    System.out.println("Student average is :" + avg);

}
}

