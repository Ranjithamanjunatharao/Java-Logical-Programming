import java.util.Scanner;
class employ
  {
    int emp(int eid, String ename,int esalary)
    {   
      return esalary;
    }
  }
class Employee
  {
    public static void main(String args[])
    {
      int eid;
      String ename;
      int esalary,z;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Employee id: ");
      eid=sc.nextInt();
      System.out.println("Enter the Employee name: ");
      ename=sc.next();
      System.out.println("Enter the Employee salary: ");
      esalary=sc.nextInt();
      System.out.println("The Employee id is: "+eid);
       System.out.println("The Employee name is: "+ename);
      
employ e1=new employ();
      z=e1.emp(eid,ename,esalary);
      System.out.println("The Employee salary is: "+z);
    }
  }