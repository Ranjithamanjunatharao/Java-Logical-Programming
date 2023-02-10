//Write a JAVAprogram to count total number of vowels and consonants in a string.

import java.util.Scanner;
class vowelconsonant{
  public static void main(String args[])
  {
    int i;
    int p=0,q=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String ");
    String st2=sc.nextLine();
    String st1=st2.toLowerCase();
    for(i=0;i<st1.length();i++){
    if(st1.charAt(i)=='a'||st1.charAt(i)=='e'||st1.charAt(i)=='i'||st1.charAt(i)=='o'||st1.charAt(i)=='u'){
      p++;
    }
      else{
        q++;
      }
  }
    System.out.println("The number of vowels are:"+p);
    System.out.println("The number of consonants are:"+q);
}
}