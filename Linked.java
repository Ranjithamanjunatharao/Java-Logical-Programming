import java.util.*;
class Linked
  {
    public static void main(String args[])
    {
      LinkedList<String> alist=new LinkedList<String>();
      alist.add("Ranju");
      alist.add("Manju");
      alist.add("Vyju");
      alist.add("Buddu");
      alist.add("MJR");
      alist.add("Sonu");
      System.out.println(alist);
      System.out.println("-------------");
      System.out.println("After set method");
      alist.set(4,"Bangaru");
      for(String str:alist)
        {
          System.out.println(str);
        }
      System.out.println("-------------");
      System.out.println("Using get method");
     System.out.println(alist.getFirst());
      System.out.println(alist.get(3));
       System.out.println(alist.getLast());
      System.out.println("-------------");
      System.out.println("Using remove method");
      alist.removeFirst();
      alist.removeLast();
      for(String str:alist)
        {
          System.out.println(str);
        }
      System.out.println("-------------");
       System.out.println("Using iterative class");
      Iterator itr=alist.iterator();
      while(itr.hasNext()){
        System.out.println(itr.next());
      }
   System.out.println("-------------");
       System.out.println("Using sorting method");
      Collections.sort(alist);
for(String str:alist)
        {
          System.out.println(str);
        }
    }
  }