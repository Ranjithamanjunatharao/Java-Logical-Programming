//Write a JAVAprogram to check whether a string is palindrome or not. 

import java.util.Scanner;
class Palindromestring
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
    String n=sc.nextLine();
    String n1="";                 //reverse
    for(int i=n.length()-1;i>=0;i--){
      n1=n1+n.charAt(i);
    }
if(n.equals(n1)){
  System.out.println("It is palindrome string");
}
else{
   System.out.println("It is not palindrome string");
}
  }
}