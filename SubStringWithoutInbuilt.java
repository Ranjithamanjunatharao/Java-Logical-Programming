/*  JFM1T8_Assignment3:

    Write a program to find a substring in a string without using an inbuilt method of String class.
    Prompt the user input from the terminal.
    
    Sample input: Learning made easy at bitLabs
    Enter search string: bitLabs
    
    Expected output: bitLabs is found
    
    Enter search string: bitlab
    Expected output: bitlab is not found

*/

import java.util.Scanner;

public class SubStringWithoutInbuilt {

//main method
 public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
//declare variables

//take input from user
System.out.print("Enter a string: ");
String str = scanner.nextLine();
        
  System.out.print("Enter search string: ");
  String searchStr = scanner.nextLine();
//compare two strings if the search string found or not without using inbuilt method isSubString()
int strLength = str.length();
        int searchLength = searchStr.length();
        boolean found = false;
//creat isSubString method in that declare variable 
 for(int i = 0; i <= strLength - searchLength; i++) {
            int j;
            for(j = 0; j < searchLength; j++) {
                if(str.charAt(i+j) != searchStr.charAt(j)) {
                    break;
                }
            }
            if(j == searchLength) {
                found = true;
                break;
            }
        }
//check two strings if the search string is present then return true else return false
        if(found) {
        System.out.println(searchStr + " is found");
        }
        else
        {
            System.out.println(searchStr + " is not found");
        }
    }
}






        
        
        




