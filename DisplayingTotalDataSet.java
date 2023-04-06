/*3.Write a program to read data from matches.csv file and find out following points:
   • how many matches we have got in this dataset.
   • how many Seasons(years) we have got in this dataset.
   • how many venues we have got in this dataset.

   Expected Output:
   Number of matches: 750
   Number of seasons: 5
   Number of venues: 9
*/

import java.util.*;
import java.io.*;
public class DisplayingTotalDataSet {

   public static void main(String args[]) {
     int matchCount = 0;
        int seasonCount = 0;
        Set<String> venues = new HashSet<String>();

        try {
            
            BufferedReader reader = new BufferedReader(new FileReader("matches.csv"));

           
            reader.readLine();

          
            String line;
            while ((line = reader.readLine()) != null) {
                matchCount++;
                String[] data = line.split(",");
               
                seasonCount = Math.max(seasonCount, Integer.parseInt(data[0]));
                venues.add(data[2]);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

       
        System.out.println("Number of matches: " + matchCount);
        System.out.println("Number of seasons: " + (seasonCount + 1));
        System.out.println("Number of venues: " + venues.size());
}
}
