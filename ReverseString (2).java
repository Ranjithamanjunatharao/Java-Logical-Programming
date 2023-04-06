/*  JFM1T8_Assignment5:

    Write a program to reverse a string using StringBuffer. Reverse entire sentence in string and also reverse each word in the string. 
    Prompt the user input from the terminal.
    
    Sample input: Learning made easy at bitLabs
    
    Expected output:
    reversing entire string: sbaLtib ta ysae edam gninraeL
    reversing each word at its place: gninraeL edam ysae ta sbaLtib  
*/
import java.util.Scanner;

public class ReverseString {

//main method
public static void main(String args[]){
//declare variables and take input from user
String s;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter your String ");
  s=sc.nextLine();
  String s3="";
//creat stringbuffer object for string reversing
StringBuffer s1= new StringBuffer(s);
  
//reverse input string
s1=s1.reverse();
//print entire string result
System.out.println("reversing entire string: "+s1);
//call reverWordInMyString method

/* 
   Use split() method of String class splits
   a string in several strings based on the
   delimiter passed as an argument to it
*/


/* 
   Use charAt() function returns the character
   at the given position in a string
*/
String s2[]=s.split(" ");
  for(int i=0;i<s2.length;i++){
    String word=s2[i];
    s3=s3+" ";
    for(int j=word.length()-1;j>=0;j--){
      s3=s3+word.charAt(j);
    }
    
  }
//print reverse each word string result
System.out.println("reversing each word at its place: "+s3);
}
}

