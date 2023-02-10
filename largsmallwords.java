// Program to find the largest and smallest word in a string
import java.util.Scanner;
class largsmallwords
{
  public static void main(String args[])
  {
    String str="Hai Hello welcome to bitlabs";
    String words[]=str.split(" ");
    String largestword=words[0];
    String smallestword=words[0];
    
    
    for(int i=1;i<words.length;i++)
    {
      if(words[i].length()>largestword.length())
      {
      largestword=words[i];
      }
      if(words[i].length()<smallestword.length() )
      {
       smallestword=words[i];
      }    
    }
  System.out.println("Largest word in given string is: "+largestword);
     System.out.println("smallest word in given string is: "+smallestword);
  }
}