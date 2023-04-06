/* 3. Write a Java program to find the longest word and smallest word in a text file.

    Sample Input: Create text file and write some data to the file. 
    Sample Data: "Welcome to bitLabs"

    Expected Output: 
    Longest word: Welcome
    Smallest word: to
*/
import java.io.*;
public class FindingLongestSmallestWord {

    public static void main(String args[]) {
       String input = "test.txt";
    try (BufferedReader reader = new BufferedReader(new FileReader(input))) {
      String line;
      
      int max=0;
      String maxword="";
      
     
      while ((line = reader.readLine()) != null) {
        String line1[] = line.split(" ");
        String s1=line1[1];
        int min=s1.length();
        for(int i=0;i<line1.length;i++){
          String s2=line1[i];
          if(s2.length()>max){
            max=s2.length();
            maxword=s2;
          }
          if(s2.length()<min){
            min=s2.length();
            s1=s2;
          }
        }
        System.out.println("Longest word: "+maxword);
        System.out.println("Smallest word: "+s1);
    }
}catch (IOException e) {
      System.err.println("Error reading file: " + e.getMessage());
    }
    }
}