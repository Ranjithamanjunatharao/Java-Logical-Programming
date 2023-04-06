
/* 4. Write a Java program to read data from input file and find word count in each line and longest word in each line. 
      Handle IOException while reading data from input file.

     Sample Input: Create text file and write some data to the file.
     Expected Output:
     Number of words in line number1: 4 and longest word is: "     “ (Print longest word in first line)
     '
     '
     '
     Number of words in line number n: 7 and longest word is: "    “ (Print longest word in last line)
*/
import java.io.*;

public class LongestWordInEachLine {

  public static void main(String args[]) {

    String input = "data2.txt";
    try (BufferedReader reader = new BufferedReader(new FileReader(input))) {
      String line;

      int max = 0;
      String maxword = "";

      while ((line = reader.readLine()) != null) {
        String line1[] = line.split(" ");
        String s1 = line1[1];
        int min = s1.length();
        for (int i = 0; i < line1.length; i++) {
          String s2 = line1[i];
          if (s2.length() > max) {
            max = s2.length();
            maxword = s2;
          }
          if (s2.length() < min) {
            min = s2.length();
            s1 = s2;
          }
        }
        System.out.println("Number of words in line number1: " + line1.length + " and longest word is: " + maxword);

      }
    } catch (IOException e) {
      System.err.println("Error reading file: " + e.getMessage());
    }
  }
}