/*  JFM1T8_Assignment2:

    Write a program to find a substring in a string using an inbuilt method of String class.
    Prompt the user input from the terminal.
  
    Sample input: Learning made easy at bitLabs
    Enter search string : bitLabs
  
    Expected output: bitLabs is found
  
    Enter search string: bitlab
    Expected output: bitlab is not found
*/

import java.util.Scanner;

public class SubStringWithInbuilt {

//main method
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//declare variables
//take input from user
  
System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        System.out.print("Enter search string: ");
        String searchStr = scanner.nextLine();
  //check if the string contains substring or not if contains print found else print not found
if(str.contains(searchStr)) {
   System.out.println(searchStr + " is found");
        } 
else
{
 System.out.println(searchStr + " is not found");

} 
}
}


        
        