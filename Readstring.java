import java.io.*;
class Readstring
  {
    public static void main(String args[]) throws IOException
    {
      InputStreamReader in=new InputStreamReader(System.in);
       BufferedReader br=new BufferedReader(in);
      String st1;
      System.out.println("Enter Any String:");
       st1=br.readLine();
       System.out.println("The Given String is:"+st1);
    }
  }