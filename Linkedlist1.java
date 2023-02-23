/*
4.Write a program to create a LinkedList of Employee type and add five Employee objects to it. Then, use a while loop to print all the Employee objects in the LinkedList
*/
import java.util.*;
class Linkedlist1
  {
    public static void main(String args[])
    {
      LinkedList<Object> employee=new LinkedList<Object>();
      employee.add("Ranju");
      employee.add("Manju");
      employee.add("Vyju");
      employee.add("Buddu");
      employee.add(1);
Iterator itr=employee.iterator();
      while(itr.hasNext()){
        System.out.println(itr.next());
      }
    }
  }