/*4. Write a program which will illustrate NullPointerException. Create student class along with name, marks and city and add setter methods and getter methods.
  Create a method which can take student class as a parameter and print name, marks and city in method business logic.
  Write your comments regarding NullPointerException such "When NullPointerException will occur in program?"
*/
import java.util.*;
class Student{
  private String name,city;
  private int marks;
  public void setName(){
    name=null;
  }
  public void setMarks(int marks){
    this.marks=marks;
  }
  public void setCity(String city){
    this.city=city;
  }
  public String getName(){
    return name;
  }
  public int getMarks(){
    return marks;
  }
  public String getCity(){
    return city;
  }
  
}




public class NullPointerException {

    public static void main(String args[]) {
      Student s=new Student();
      s.setName();
      s.setMarks(90);
      s.setCity("vijayawada");
      try{
        System.out.println(s.getName().length());
      }
      catch(Exception  e){
        System.out.println(e);
      }
    }
}
/* NullPointerException is predefined exceptions when we do some operations on that String where stored with null we will get nullpointer exception
the operations like length of the string uppercase of string*/