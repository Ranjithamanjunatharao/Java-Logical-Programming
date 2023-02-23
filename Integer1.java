//Write a program to create a HashSet of Integer type and add ten elements to it. Then, use an iterator to print all the elements in the HashSet.
import java.util.*;
public class Integer1
{
  public static void main(String[] args)
  {
    // Creating a HashSet
    HashSet<Integer> hashSet = new HashSet<Integer>();
    // Adding elements to the HashSet
    hashSet.add(1);
    hashSet.add(2);
    hashSet.add(3);
    hashSet.add(4);
    hashSet.add(5);
    hashSet.add(6);
    hashSet.add(7);
    hashSet.add(8);
    hashSet.add(9);
    hashSet.add(10);
  System.out.println("Elements in HashSet are: " + hashSet);
    Iterator<Integer> itr= hashSet.iterator();
      while(itr.hasNext())
        {
          System.out.println(itr.next());
        }
  }
}
