/*Write a Java Program to enter Consumer Number , Consumer Name , Present Month Reading, Last Month Reading,
Calculate Total units & Electricity bill and print the report.*/
import java.util.Scanner;
class bill
  {
    int cno,pmr,lmr;
       String cname;
       double ebill;
       double totalunit;
       Scanner sc=new Scanner(System.in);
    void ele()
    {
      System.out.println("Enter the Consumer number");
      cno=sc.nextInt();
        System.out.println("Enter the Consumer name");
      cname=sc.next();
        System.out.println("Enter the Present month reading");
      pmr=sc.nextInt();
       System.out.println("Enter the Last month reading");
      lmr=sc.nextInt();
       totalunit=pmr-lmr;
       ebill=totalunit *3.80;
       System.out.println("Consumer number= "+cno);
       System.out.println("Consumer name= "+cname);
       System.out.println("Present month reading= "+pmr);
        System.out.println("Last month reading= "+lmr);
        System.out.println("Total unit= "+totalunit);
        System.out.println("Electricity bill= "+ebill);
    }
     }
class Electricity
  {
     public static void main(String args[]){
    bill b1=new bill();
       b1.ele();
     }
  }