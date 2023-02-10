//Write a JAVAprogram to find first occurrence of a character in a given string.
import java.util.Scanner;
class Firstoccurence
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
         System.out.println("The first occurence is:"+i);
        break;
      }
    }
  }
}