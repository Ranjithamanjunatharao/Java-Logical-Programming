/* 1. Write a Java program to print list of repeated words and list of non-repeated words in a given file and 
      print number of repeated words and number of non-repeated words.

     Sample Input: Create text file and write some data to the file.

     Expected Output:
     Repeated words: 
     // Display all words which are repeating
     Number of repeated words: 33
     Non-Repeated Words: 
     // Display all words which are not repeating
     Number of repeated words: 12
*/

import java.io.*;
import java.util.*;

public class RepeatedNonRepeatedWords {

    public static void main(String[] args) {
try{
  BufferedReader br=new BufferedReader(new FileReader("data.txt"));
  String line;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                sb.append(line).append(" ");
            }
            br.close();
  String data = sb.toString().toLowerCase().replaceAll("[^a-zA-Z0-9 ]", "");
            String[] words = data.split("\\s+");

            Map<String, Integer> wordCountMap = new HashMap<>();

            
            for (String word : words) {
                if (wordCountMap.containsKey(word)) {
                    wordCountMap.put(word, wordCountMap.get(word) + 1);
                } else {
                    wordCountMap.put(word, 1);
                }
            }

            
            List<String> repeatedWords = new ArrayList<>();
            List<String> nonRepeatedWords = new ArrayList<>();

            for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                if (entry.getValue() > 1) {
                    repeatedWords.add(entry.getKey());
                  } else {
                    nonRepeatedWords.add(entry.getKey());
                }
            }

            
            System.out.println("Repeated words: ");
            for (String word : repeatedWords) {
                System.out.print(word + " ");
            }
            System.out.println();
            System.out.println("Number of repeated words: " + repeatedWords.size());

          
            System.out.println("Non-Repeated words: ");
            for (String word : nonRepeatedWords) {
                System.out.print(word + " ");
            }
            System.out.println();
            System.out.println("Number of non-repeated words: " + nonRepeatedWords.size());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}