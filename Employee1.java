import java.util.Scanner;
class Employee1
  {
     public static void main(String args[]){
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
         
                
    