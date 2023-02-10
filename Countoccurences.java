//Write a JAVA program to count occurrences of a character in given string.
import java.util.Scanner;
class Countoccurences
{
  public static void main(String args[])
  {
    int i,count=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string ");
    String st1=sc.nextLine();
    System.out.println("Enter the character to know its count");
    char ch=sc.next().charAt(0);
    for(i=0;i<st1.length();i++){
      if(st1.charAt(i)==ch){
     count++;
      }
    }
     System.out.println("The count is:"+count);
  }
}
