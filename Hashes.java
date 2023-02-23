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
    }
  }