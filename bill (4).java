/*Write a Program to Enter Product Number, Product Name, Product Cost, Product Quantity, calculate Bill Amout and print the report? */

import java.util.Scanner;
class electric
  {
       int pno;
       String pname;
       float pcost;
       float pquantity;
       float billamount;
       Scanner sc=new Scanner(System.in);
      float ele()
        {
         System.out.println("Enter the product number");
      pno=sc.nextInt();
        System.out.println("Enter the product name");
      pname=sc.next();
         System.out.println("Enter the product cost");
      pcost=sc.nextFloat();
        System.out.println("Enter the product quantity");
      pquantity=sc.nextFloat();
       billamount= pcost*pquantity;
      System.out.println("Product number= " +pno);
       System.out.println("Product name= " +pname);
       System.out.println("Product cost= " +pcost);
       System.out.println("Product quantity= " +pquantity);
      //System.out.println("Bill amount= " +billamount);
          return billamount;
        }
  }
  
class bill
  {
  1public static void main(String args[])
    {
      float z;
electric e1= new electric();
    z= e1.ele();
      
      System.out.println("Bill amount= "+z);
    }
  }