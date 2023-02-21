import java.io.*;
class ReadFloat
  {
    public static void main(String args[]) throws IOException
    {
      InputStreamReader in=new InputStreamReader(System.in);
       BufferedReader br=new BufferedReader(in);
      float n;
      System.out.println("Enter Any Float value:");
       n=Float.parseFloat(br.readLine());
       System.out.println("The Given floating value is:"+n);
    }
  }