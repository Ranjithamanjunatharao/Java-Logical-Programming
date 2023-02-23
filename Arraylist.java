/* 1.Write a program to create an ArrayList of String type and add five elements to it. Then, use a for-each loop to print all the elements in the ArrayList.
*/
import java.util.*;
class Arraylist
  {
    public static void main(String args[])
    {
      ArrayList<String> alist=new ArrayList<String>();
      alist.add("Ranju");
      alist.add("Manju");
      alist.add("Vyju");
      alist.add("Sonu");
      alist.add("Buddu");
      System.out.println("Using For-each loop:");
      for(String str:alist)
        System.out.println(str);
    }
  }
