/* Write a program that takes the day of the week and the current time as input and prints out whether or not the library is open using nested if statements.*/
import java.util.Scanner;
class Library{
  public static void main(String args[]){
    String  day;
    double time;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter day of the week:");
    day=sc.next();
    System.out.println("Enter time(24 hour) :");
    time=sc.nextDouble();
    if(day.equals("monday") ||day.equals("tuesday")||day.equals("wednesday") ||day.equals("thursay")||day.equals("friday")){
      if(time>=10.00 && time<=18.00){
        System.out.println("the library is opened");
      }
      else{
        System.out.println("the library is not opened ");
      }
    }
    else{
      System.out.println("Weekend holiday");
    }
    
  }
}