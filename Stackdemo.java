import java.util.*;
public class Stackdemo
  {
    public static void main(String args[])
    {
      Stack<String> stack= new Stack<String>();
      stack.push("Ranju");
      stack.push("Manju");
      stack.push("Vyju");
      stack.push("Sonu");
      stack.push("Buddu");
      stack.pop();
      Iterator<String> itr=stack.iterator();
      while(itr.hasNext())
        {
          System.out.println(itr.next());
        }
    }
  }