import java.io.*;
class Student
  {
    public static void main(String args[]) throws IOException
    {
      InputStreamReader in=new InputStreamReader(System.in);
       BufferedReader br=new BufferedReader(in);
       int num;
      String name;
      int n1,n2,n3;
      float total,average;
      System.out.println("Enter student number: ");
       num=Integer.parseInt(br.readLine());
      System.out.println("Enter the student name: ");
       name=br.readLine();
       System.out.println("Enter Physics marks: ");
       n1=Integer.parseInt(br.readLine());
       System.out.println("Enter Chemistry marks: ");
       n2=Integer.parseInt(br.readLine());
       System.out.println("Enter Maths marks: ");
       n3=Integer.parseInt(br.readLine());
      total=n1+n2+n3;
      average=total/3;
      System.out.println("Student Report");
       System.out.println("--------------");
      System.out.println("Physics marks: "+n1);
      System.out.println("Chemistry marks: "+n2);
      System.out.println("Maths marks: "+n3);
      System.out.println("The total marks is: "+total);
      System.out.println("The average marks is: "+average);
      
    }
  }