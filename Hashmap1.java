import java.util.*;
public class Hashmap1
{
	public static void main(String[] args)
  {
		HashMap <Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"Ranju");
		hm.put(5,"Manju");
		hm.put(2,"Vyju");
		hm.put(4,"chinnu");
		hm.put(3,"sonu");
    hm.put(9,"apple");
		hm.put(10,"mango");
		hm.put(6,"Badam");
		hm.put(7,"Grapes");
		hm.put(8,"cake");
    
		System.out.println(hm);
for(Map.Entry<Integer,String> entry : hm.entrySet()) {
        int key = entry.getKey();
       String value = entry.getValue();
      System.out.println(key + " => " + value);
    }
  }
}