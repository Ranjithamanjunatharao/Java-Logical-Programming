import java.util.Scanner;
class starspattern
  {
    public static void main(String args[])
    {
      int i,j;
      for(i=5;i>=1;i--)
        {
          for(j=1;j<=5;j++)
          {
            if(j<=i-1)
          System.out.print(" ");
            else 
             System.out.print("*"); 
          }
      System.out.println();
    }
    }
  }