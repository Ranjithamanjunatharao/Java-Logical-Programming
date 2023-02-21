/*Write a Java program that takes input from the user in the form of a string and checks whether it is a palindrome or not. Your program should use exception handling to handle the following situations:If the user inputs a non-string value, the program should catch the exception and display an error message to the user.
*/
import java.util.*;
public class Exception
{
  Scanner sc=new Scanner(System.in);
  String s,s1="";
    void Palindrome(){
    try
      {
   System.out.println("Enter the string");
    s=sc.nextLine();                      
    for(int i=s.length()-1;i>=0;i--){
      s1=s1+s.charAt(i);
      }
   if(s.equalsIgnoreCase(s1))
  System.out.println("It is palindrome string");
  
   else
   System.out.println("It is not palindrome string");

      }
    catch(NumberFormatException be){
        System.out.println("Exception occur due to invalid input");
      }
    }
    
      public static void main(String args[])
        {
        Exception e1=new Exception();
        e1.Palindrome();
        }

      }
  