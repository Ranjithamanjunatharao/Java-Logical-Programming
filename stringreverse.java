//Write a JAVAprogram to find reverse of a string

import java.util.Scanner;
class stringreverse{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your string :");
    String n=sc.nextLine();
    String n1="";
    for(int i=n.length()-1;i>=0;i--){
      n1=n1+n.charAt(i);
    }
    System.out.println("The reverse of string is :"+n1);
  }
}