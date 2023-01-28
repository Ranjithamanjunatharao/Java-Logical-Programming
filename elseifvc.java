/*
    Write a Java Program to check given character is Vowel or Consonent using else if ladder?
    check Small letter and Capital letter in one condition*/

import java.util.Scanner;
class elseifvc
  {
    public static void main(String args[])
    {
    char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter character");
ch=sc.next().charAt(0);
        if((ch=='a')||(ch=='A'))
         {
        System.out.println("Vowel");
         }
     else if((ch=='e')||(ch=='E'))
         {
        System.out.println("Vowel");
        }
      else if((ch=='i')||(ch=='I'))
         {
        System.out.println("Vowel");
        }
      else if((ch=='o')||(ch=='O'))
         {
        System.out.println("Vowel");
        }
      else if((ch=='u')||(ch=='U'))
         {
        System.out.println("Vowel");
        }
      
      else 
      {
        System.out.println("Consonant");
      }
  }
  }