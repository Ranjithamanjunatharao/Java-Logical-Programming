import java.util.Scanner;
class bill
  {
    double elec(double cno,String cname,double pmr,double lmr,double totalunit)
    {
      double billamount; 
      billamount=totalunit*3.80;
      return billamount;
    }
  }
class Electricity
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      double cno;
      String cname;
      double pmr,lmr,x;
      double totalunit;
      System.out.println("Enter the Consumer Number:");
      cno=sc.nextDouble();
      System.out.println("Enter the Consumer Name:");
      cname=sc.next();
      System.out.println("Enter the Present Month Reading:");
      pmr=sc.nextDouble();
      System.out.println("Enter the Last Month Reading:");
      lmr=sc.nextDouble();
      totalunit=pmr-lmr;
      System.out.println("Total unit is: "+totalunit);
      
bill b1=new bill();
    x= b1.elec(cno,cname,pmr,lmr,totalunit);
      System.out.println("Total Bill Amount: "+x);
    }
  }