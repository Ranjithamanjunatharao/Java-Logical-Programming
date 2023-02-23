import java.util.*;
 
public class TreeMapExample {
 
   public static void main(String[] args) {
 
      // Create a TreeMap
      TreeMap<String, Integer> map = new TreeMap<>();
 
      // Add elements to the TreeMap
      map.put("John", 23);
      map.put("David", 32);
      map.put("Alice", 18);
      map.put("Bob", 27);
     // Display the TreeMap
      System.out.println("TreeMap: " + map);
 
      // Get the value associated with a key
      int age = map.get("John");
      System.out.println("John's age is " + age);
 
      // Remove an element from the TreeMap
      map.remove("Alice");
      System.out.println("TreeMap after removing Alice: " + map);
      // Iterate through the TreeMap
      for(Map.Entry<String, Integer> entry : map.entrySet()) {
         String key = entry.getKey();
         int value = entry.getValue();
         System.out.println(key + " => " + value);
      }
   }
}