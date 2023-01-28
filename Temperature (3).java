/*Write a program that takes a temperature as input and prints out whether it is above or below freezing, as well as whether it is above or below boiling, using nested if statements. */
import java.util.*;
class Temperature{
  public static void main(String args[]){
    double temp;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your temperature(in celcius):");
    temp=sc.nextInt();
    if(temp>0){
      if(temp<=15){
        System.out.println("its above freezing point");
      }
      else if(temp>16 && temp<=25){
        System.out.println("its normal temperature");
      }
      else if(temp>=26 && temp<=99){
        System.out.println("its below boiling point");
      }
      else{
        System.out.println("its above boiling point");
      }
    }
    else{
      System.out.println("its below freezing point");
    }
  }
}