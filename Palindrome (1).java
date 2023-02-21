/*  JFM1T8_Assignment4:

    Write a program to check whether a string is a Palindrome.
    Prompt the user input from the terminal.
    
    Sample input: Malayalam
    
    Expected output: Malayalam is a Palindrome
*/

import java.util.Scanner;

public class Palindrome {

//main method
public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);

//declare varible

//take input from user
System.out.println("Enter the string");
    String n=sc.nextLine();
    String s=n.toLowerCase();
    String n1="";                             
    for(int i=n.length()-1;i>=0;i--){
      n1=n1+s.charAt(i);
    }
if(s.equals(n1)){
  System.out.println(n1+ " is a Palindrome");
}
else{
   System.out.println(n1+" is not palindrome");
}
    }
}
    
/* 
   divide the whole string into two halves and compare each character in the 
   first half with each character in the second half in reverse.  
   If both are equal then it is a palindrome else print it is not a palindrome 
*/

