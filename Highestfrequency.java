// Write a java program to print the highest frequency character in a string

import java.util.Scanner;
class Highestfrequency{
  public static void main(String args[]){
  
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter your String :");
    String s=sc.nextLine();
    int max=1,a=0,min=0;
    int count=0;
    int row=0;
    for(int i=0;i<s.length();i++){
        a=0;
        for(int j=0;j<s.length();j++){

         if(s.charAt(i)==s.charAt(j)){
            a++;
        }
        if(max<a){
            max=a;
            row=i;
        }
    }
    }
    System.out.println("your highest frequency is  "+s.charAt(row)+"  "+max+" times");
  }
}