import java.util.Scanner;
class bill
  {
    double cno,pmr,lmr;
       String cname;
       double ebill;
       double totalunit;
       Scanner sc=new Scanner(System.in);
    double ele1()
    {
       System.out.println("Enter the Consumer number");
      cno=sc.nextDouble();
        System.out.println("Enter the Consumer name");
      cname=sc.next();
        System.out.println("Enter the Present month reading");
      pmr=sc.nextDouble();
       System.out.println("Enter the Last month reading");
      lmr=sc.nextDouble();
      totalunit=pmr-lmr;
      return totalunit;
    }
    double ele()
    {
     ebill=totalunit *3.80;
       System.out.println("Consumer number= "+cno);
       System.out.println("Consumer name= "+cname);
       System.out.println("Present month reading= "+pmr);
        System.out.println("Last month reading= "+lmr);
        //System.out.println("Total unit= "+totalunit);
        //System.out.println("Electricity bill= "+ebill);
      return ebill;
    }
     }
class Electricity
  {
    
     public static void main(String args[]){
       double x,y;
    bill b1=new bill();
       x=b1.ele1();
      y= b1.ele();
      System.out.println("Total unit= "+x); 
       System.out.println("Electricity bill= "+y);
       
     }
  }