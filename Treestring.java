/*8.Write a program to create a TreeSet of String type and add five elements to it. Then, use a for-each loop to print all the elements in the TreeSet*/
import java.util.*;
class Treestring
  {
    public static  void main(String args[])
    {
    TreeSet<String> treeSet = new TreeSet<String>();
      treeSet.add("John");
      treeSet.add("Mary");
      treeSet.add("Peter");
      treeSet.add("David");
      treeSet.add("Karun");
for(String s:treeSet){
            System.out.println(s);
        }
    }
  }
