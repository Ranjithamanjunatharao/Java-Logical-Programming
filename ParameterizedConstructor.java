/* 5. Write a Java program to demonstrate that objects created inside a method will becomes eligible for gc after method execution terminate. 
     Use parameterized constructor to receive the objects.*/

class test
{
/* Override finalize() method to print user defined message, 
throw Throwable class from method signature.*/
@Override
protected void finalize() throws Throwable {
System.out.println(" Garbage collector in action! Deleted one object!");
}
String objectName;
test(String objectName) {
// assign local variable values to instance variables
this.objectName = objectName;
}
}
public class ParameterizedConstructor {
public static void main(String[ ] args) {
// create two objects for test class along with ObjName
test t1 = new test("Chanukya"); 
test t2 = new test("Murali");
// assign emp2 object to emp1
t2 = t1;
// call gc() method
  System.gc();
}
}
