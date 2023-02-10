//Write a JAVA program to print all unique elements in the array
import java.util.Scanner;
class Uniquelement{
  public static void main(String args[])
  {
    int a[]={1,2,2,3,4,5,5,6,6,7,8};
    for(int i=0;i<a.length-1;i++){
      if(a[i]!=a[i+1])
        System.out.println(a[i]+" ");
    }
   System.out.println(a[a.length-1]); 
  }
}