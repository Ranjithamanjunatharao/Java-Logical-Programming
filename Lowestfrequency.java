// JAVA program to find lowest frequency character in a string

import java.util.*;
class Lowestfrequency{
  public static void main(String args[]){
    
    char tch='0';
    String s;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String: ");
    s=sc.nextLine();
    s=s.toLowerCase();
    int Min=s.length();
    for(char ch='a';ch<='z';ch++){
      int c=0;  
      for(int i=0;i<s.length();i++){
        if(ch==s.charAt(i)){
          c++;
          
        }
      }
      if(c!=0){
        if(c<Min){
            Min=c;
            tch=ch;
      }
        }
      
    }
    System.out.println("lowest occurance of character  "+tch+" is "+ Min );
  }
}