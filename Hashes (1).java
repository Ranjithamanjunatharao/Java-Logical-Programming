import java.util.*;
public class Hashes
  {
    public static void main(String args[])
    {
      //creating Hashset and adding elements
      HashSet<String> set=new HashSet<String>();
      set.add("Ranju");
      set.add("Manju");
      set.add("Ranju");
      set.add("vyju");
      
      
      //Traversing element
      Iterator<String> itr= set.iterator();
      while(itr.hasNext())
        {
          System.out.println(itr.next());
        }
      //using remove method
      set.remove("Manju");
      System.out.println("Hashset after removing an element:"+set);
      //printing Hashset after removing an element
      boolean isExists = set.contains("Ranju");
      System.out.println("Is Java exists in the HashSet? " + isExists);
       // Clearing the HashSet
      set.clear();
      // Printing the HashSet after clearing
      System.out.println("HashSet after clearing: " + set);
    }
  }