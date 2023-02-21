/* JFM1T6_Assignment4:

   Write a program to display current date-time. Hint: java.util package contains Date class.
   
   Sample Output:
   Date in Indian Timezone (IST) : 18-02-21 10:20:195 IST

*/

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class CurrentDateTime {

//main method

    public static void main(String[] args)
  {
     Date today = new Date();   
/* 
capture today's date by
Date today = new Date();
*/
 TimeZone.setDefault(TimeZone.getTimeZone("IST"));
//create DateFormat and set TimeZone 

 SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yy hh:mm:ss a z");
     String formattedDate = formatter.format(today);
//display this date on IST time zone 
System.out.println("Date in Indian Timezone (IST) : " + formattedDate);
    }

}

