/*3.Write a program to create a TreeMap of String, Integer type and add five key-value pairs to it. Then, use a for-each loop to print all the keys and values in the TreeMap.
*/
import java.util.*;
 
public class Treemap 
{
 public static void main(String[] args) 
  {
   TreeMap<String, Integer> map = new TreeMap<>();
      map.put("Ranju", 23);
      map.put("Vyju", 24);
      map.put("Manju", 1);
      map.put("Sonu", 2);
   map.put("Buddu", 3);
 for(Map.Entry<String, Integer> entry : map.entrySet()) {
         String key = entry.getKey();
         int value = entry.getValue();
         System.out.println(key + " => " + value);
 }
    
 }
}