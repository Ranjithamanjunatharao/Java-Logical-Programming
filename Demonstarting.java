/* 4. a java Program that demonstrating the garbage collection by calling System.gc().*/

class Employee {
  /*
   * Override finalize() method to print user defined message, throw Throwable
   * class from method signature.
   */
  @Override
  protected void finalize() throws Throwable {
    System.out.println("Garbage collector in action! Deleted one object!");
  }

  String name;
  int eid;

  Employee(String name, int eid) {
    // assign local variable values to instance variables
    this.name = name;
    this.eid = eid;
  }
}

public class Demonstarting {
  public static void main(String[] args) {
    // create two objects for Employee class along with name and eid
    Employee emp1 = new Employee("Chanukya", 29);
    Employee emp2 = new Employee("Murali", 27);
    // assign emp2 object to emp1
    emp2 = emp1;
    // call gc() method
    System.gc();
  }
}
