import java.util.Scanner;
class market
  {
    float price(int pno,String pname,float pquantity,float pcost)
    {
      float billamount;
      billamount=pquantity*pcost;
      return billamount;
    }
  }
class bill
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int pno;
      String pname;
      float pquantity;
      float pcost;
      float z;
      System.out.println("Enter the Product Number:");
      pno=sc.nextInt();
       System.out.println("Enter the Product Name:");
      pname=sc.next();
      System.out.println("Enter the Product Quantity:");
      pquantity=sc.nextFloat();
      System.out.println("Enter the Product Cost:");
      pcost=sc.nextFloat();
      market m1=new market();
    z=  m1.price(pno,pname,pquantity,pcost);
      System.out.println("Total Bill Amount: "+z);
    }
  }