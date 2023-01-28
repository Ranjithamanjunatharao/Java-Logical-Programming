import java.util.Scanner;
class employ
  {
    void emp(int eid, String ename,int esalary)
    {
       System.out.println("The Employee id is: "+eid);
       System.out.println("The Employee name is: "+ename);
       System.out.println("The Employee id is: "+esalary);
    }
  }
class Employee
  {
    public static void main(String args[])
    {
      int eid;
      String ename;
      int esalary;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Employee id: ");
      eid=sc.nextInt();
      System.out.println("Enter the Employee name: ");
      ename=sc.next();
      System.out.println("Enter the Employee salary: ");
      esalary=sc.nextInt();
employ e1=new employ();
      e1.emp(eid,ename,esalary);
    }
  }