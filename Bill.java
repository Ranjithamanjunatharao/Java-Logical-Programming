import java.util.Scanner;
class Bill
  {
     public static void main(String args[]){
       int pno;
       String pname;
       float pcost;
       float pquantity;
       float billamount;
       Scanner sc=new Scanner(System.in);
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
       System.out.println("Bill amount= " +billamount);
     }
  }
       
       