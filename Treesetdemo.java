import java.util.*;
class Treesetdemo
  {
    public static  void main(String args[])
    {
      //create a new Treeset object
      TreeSet<String> treeSet = new TreeSet<String>();
      //Add elements to the treeset
      treeSet.add("John");
      treeSet.add("Mary");
      treeSet.add("Peter");
      treeSet.add("David");
      System.out.println("Treeset elements are:"+treeSet);
      if(treeSet.contains("John"))
      {
        System.out.println("Treeset contains John");
        
      }
      else
      {
        System.out.println("Treeset does not contains John");
      }
      //Remove an element from the treeset
      treeSet.remove("David");
      System.out.println("Treeset elements after removing:"+treeSet);
      //print first and last elements
      System.out.println("First element:"+treeSet.first());
       System.out.println("First element:"+treeSet.last());
      
    }
  }