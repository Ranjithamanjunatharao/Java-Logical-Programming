//Write a program that takes an age as input and checks if the person is a teenager (between 13 and 19 inclusive) or an adult (20 and above) using nested if statements.

import java.util.*;
class age
  {
    public static void main(String args[])
    {
    int age;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the age");
age=sc.nextInt();
      if(age>=13)
      {
        if(age<=19)
        {
          System.out.println("person is a teenager");
        }
        else
        {
         System.out.println("person is a adult"); 
      }
      }
      else{
         System.out.println("person is a not a teenager or adult"); 
      }
    }
  }