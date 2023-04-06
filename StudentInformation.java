/* 1. Write a program to accept 3 Students information with name, five subject’s marks and print name along with total marks. 
      Use setter and getter methods to set and get values. After displaying student total marks, assign null value to reference 
      variable and Display user defined message once student object got garbage collected.

      Sample Input: 
      Enter student1 name: Ramesh
      Enter 5 subjects marks: 34, 56, 78, 89, 99
      Enter student1 name: Rakesh
      Enter 5 subjects marks: 99, 50, 70, 84, 23
      Enter student1 name: Satish
      Enter 5 subjects marks: 34, 33, 22, 22, 10

      Expected Output:
      Total marks of Ramesh is: 356
      Object got garbage collected

      Total marks of Rakesh is: 321
      Object got garbage collected

      Total marks of Satish is: 121
      Object got garbage collected
*/

import java.util.*;
public class StudentInformation {
Scanner sc = new Scanner(System.in);

@Override
protected void finalize() throws Throwable {
System.out.println("\nObject got garbage collected.");
}
String name;
int totalMarks=0;
int marks[] = new int[5];
public void setDetails()
{
System.out.print("Enter Student Name : ");
name = sc.nextLine();
System.out.println("Enter 5 subjects marks: ");
for(int i=0 ; i < 5 ; i++)
{
marks[i] = sc.nextInt();
this.totalMarks = this.totalMarks + marks[i];
}
}
public void getDetails()
{
System.out.println("Total marks of "+name+" is : "+totalMarks);
}
public static void main(String[ ] args) {
StudentInformation std1 = new StudentInformation();
StudentInformation std2 = new StudentInformation();
StudentInformation std3 = new StudentInformation();
std1.setDetails();
std2.setDetails();
std3.setDetails();
std1.getDetails();
std1 = null;
System.gc();
std2.getDetails();
std2 = null;
System.gc();
std3.getDetails();
std3 = null;
System.gc();
}
}
