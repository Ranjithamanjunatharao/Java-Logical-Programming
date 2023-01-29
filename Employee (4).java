import java.util.Scanner;
class details
  {
    float emp()
    {
      int eid;
       String ename;
       float esalary;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the employee id: ");
       eid=sc.nextInt();
      System.out.println("Enter the employee name: ");
       ename=sc.next();
      System.out.println("Enter the employee salary: ");
       esalary=sc.nextInt();
       System.out.println("The given employee id is : "+eid);
      System.out.println("The given employee name is : "+ename);
     return esalary;
    }
  }
  class Employee
  {
     public static void main(String args[])
    {
      float z;
details e1= new details();
     z= e1.emp();
      System.out.println("The given employee salary is:"+z);
    }
  }