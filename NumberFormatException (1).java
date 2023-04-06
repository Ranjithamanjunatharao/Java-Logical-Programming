/* 2. Write a program which will illustrate NumberFormatException. Create a test method, with in the test method accept two numbers 
   using next() method of scanner class. Convert into numerical values and print addition of two numbers. 
   Please write your comments regarding NumberFormatException such as "When NumberFormatException will occur in this program?"
*/

import java.util.*;
public class NumberFormatException {

    public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
      System.out.println("Enter first number");
      String s1=sc.next();
       System.out.println("Enter second number");
      String s2=sc.next();
      NumberFormatException n1=new NumberFormatException();
      n1.Test(s1,s2);
    }
  void Test(String s1,String s2){
    try{
    int n1=Integer.parseInt(s1);
    int n2=Integer.parseInt(s2);
    System.out.println("addition of two numbers :"+(n1+n2));
  }
    catch(Exception e){
      System.out.println(e);
    }
  }
}
/* NumberFormatException is the predefined exception where when we try to typecast to number but we cant convert to it in that sitution we will get NumberFormatException*/
