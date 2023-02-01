/* 1 2 3 4 5            
   1 2 3 4 5
   1 2 3 4 5       System.out.print(" "+j);
   1 2 3 4 5
   1 2 3 4 5

   1  1  1  1  1 
   2  2  2  2  2
   3  3  3  3  3   System.out.print(" "+i);
   4  4  4  4  4
   5  5  5  5  5
*/
import java.util.Scanner;
class pattern12345
  {
    public static void main(String args[])
    {
      int i,j;
      for(i=1;i<=5;i++)
        {
        for(j=1;j<=5;j++)  
          {
            System.out.print(" "+i);
          }
          System.out.println();
        }
    }
  }