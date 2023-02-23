import java.util.*;
public class LinkedHashsetdemo
  {
    public static void main(String args[])
    {
      LinkedHashSet<String> set=new LinkedHashSet<String>();
      //Adding elements to the set
      set.add("Apple");
      set.add("Banana");
      set.add("Cherry");
      set.add("Durian");
      set.add("Elderberry");
      //printing the elements of the set
      //printing the elements of the set
      System.out.println("LinkedHashSet elements: "+set);
      //Removing an element
      set.remove("Durian");
      //printing the elements of the set after remove
      System.out.println("LinkedHashSet elements: "+set);
      //checking if the element present in the set
      boolean containsBanana=set.contains("Banana");
      System.out.println("Is Banana is present in LinkedHashset: "+containsBanana);
      //Getting the size of the set
      int size=set.size();
       System.out.println("Size of the LinkedHashSet: "+size);
      //clearing the set
      set.clear();
       System.out.println("LinkedHashSet elements after clearing the set:"+set);
    } 
  }