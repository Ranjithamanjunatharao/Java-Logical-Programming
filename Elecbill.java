/*1-50          ------->   1.45
   51-100      ------>     2.56
   100-200    ------->    3.50
   200-300   -------->   4.67
   above 300 -------->  5.67
 
*/
import java.util.Scanner;
class Elecbill
  {
     public static void main(String args[]){
       int cno,pmr,lmr;
       String cname;
       double bill;
       double tu;
       Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Consumer number");
      cno=sc.nextInt();
        System.out.println("Enter the Consumer name");
      cname=sc.next();
        System.out.println("Enter the Present month reading");
      pmr=sc.nextInt();
       System.out.println("Enter the Last month reading");
      lmr=sc.nextInt();
       tu=pmr-lmr;
       System.out.println("Consumer number= "+cno);
       System.out.println("Consumer name= "+cname);
       System.out.println("Present month reading= "+pmr);
        System.out.println("Last month reading= "+lmr);
        System.out.println("Total unit= "+tu);
       if(tu<=50){
         bill=tu*1.45;
       }
         else if(tu<=100){
         bill=(50*1.45)+((tu-50)*2.56);
       }
         else if(tu<=200){
         bill=(50*1.45)+(50*2.56)+((tu-100)*3.50);
         }
       else if(tu<=300){
         bill=(50*1.45)+(50*2.56)+(100*3.50)+((tu-200)*4.67);
         }
     
       else{
          bill=(50*1.45)+(50*2.56)+(100*3.50)+(100*4.67)+((tu-300)*5.67);
         }
    System.out.println("Electric bill is :"+bill);
     }
     }
  