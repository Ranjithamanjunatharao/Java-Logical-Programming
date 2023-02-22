import java.util.*;
class Integerarray
  {
    public static void main(String args[])
    {
      ArrayList<Integer> alist=new ArrayList<Integer>();
      alist.add(10);
      alist.add(20);
       alist.add(30);
       alist.add(40);
       alist.add(50);
       alist.add(60);
       alist.add(70);
       alist.add(80);
      int sum=0;
      for(int i:alist)
      {
        sum=sum+i;
      }        
      System.out.println("The sum of array is :"+sum);  
    }
  }

 /*for(int i=0;i<alist.size();i++)
      {
       
        //System.out.println(alist.get(i));
         sum=sum+i;
        
      }
      System.out.println("The sum of array is :"+sum);
}
}*/