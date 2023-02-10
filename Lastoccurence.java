//Write a JAVAprogram to find last occurrence of a character in a given string
import java.util.Scanner;
class Lastoccurence
{
  public static void main(String args[])
  {
    int i;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string ");
    String st1=sc.nextLine();
    System.out.println("Enter the character to know the last occurence");
    char ch=sc.next().charAt(0);
    for(i=st1.length()-1;i>0;i--){
      if(st1.charAt(i)==ch){
         System.out.println("The last occurence is:"+i);
        break;
      }
    }
  }
}