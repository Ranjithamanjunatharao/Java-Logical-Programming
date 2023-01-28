import java.util.Scanner;
class details
  {
    void emp()
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
      System.out.println("The given employee salary is : "+esalary);
    }
  }
  class Employee
  {
     public static void main(String args[])
    {
details e1= new details();
      e1.emp();
    }
  }