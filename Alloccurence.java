//Write a JAVA program to search all occurrences of a character in given string
import java.util.Scanner;
class Alloccurence
{
  public static void main(String args[])
  {
    int i;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string ");
    String st1=sc.nextLine();
    System.out.println("Enter the character to know the first occurence");
    char ch=sc.next().charAt(0);
    for(i=0;i<st1.length();i++){
      if(st1.charAt(i)==ch){
         System.out.println("The occurence of given character is:"+i);
      }
    }
  }
}