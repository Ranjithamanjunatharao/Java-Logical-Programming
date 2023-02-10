//Write a JAVAprogram to count total number of words in a string.

import java.util.Scanner;
class countwords{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string");
    String s=sc.nextLine();
    int count=1;
    for(int i=0;i<s.length()-1;i++){
     if(( s.charAt(i)==' ')&& (s.charAt(i+1)!=' ' )){
       count++;
     } 
    }
    System.out.println("Number of words in a string is : "+count);
  }
}