/*Write a Java Program to enter Consumer Number , Consumer Name , Present Month Reading, Last Month Reading,
Calculate Total units & Electricity bill and print the report.*/
import java.util.Scanner;
class bill
  {
    void ele(int cno,String cname,double pmr,double lmr)
      {
      double totalunit;
        double ebill;
        totalunit= pmr-lmr;
        ebill= totalunit*3.80;
        System.out.println("The Consumer number is: "+cno);
        System.out.println("The Consumer name is: "+cname);
        System.out.println("The present month reading is: "+pmr);
         System.out.println("The last month reading is: "+lmr);
         System.out.println("The Total unit is: "+totalunit);
         System.out.println("The Electricity bill is: "+ebill);    
        
      }
  }
class Electricity
  {
    public static void main(String args[])
    {
      int cno;
      String cname;
      double pmr;
      double lmr;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Consumer number: ");
      cno=sc.nextInt();
       System.out.println("Enter the Consumer name: ");
      cname=sc.next(); 
      System.out.println("Enter the Present Month Reading: ");
      pmr=sc.nextDouble();
       System.out.println("Enter the Last Month Reading: ");
      lmr=sc.nextDouble();
      bill b1=new bill();
      b1.ele(cno,cname,pmr,lmr);
    }
  }