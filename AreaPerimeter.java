/* JFM1T10_Assignment3:

     Create an abstract class Shape with following data member and methods- 
     Create data members for height and width.
     Add getter and setter methods for height and width.
     Create methods for finding area and perimeter.
     Create three subclasses Square, Rectangle and EquilateralTriangle that extends Shape class and define both the methods.
     Write a program that will find the area and perimeter of 3 Shapes and print the details for all. 
     Prompt the user for the  values to be input from the terminal.
 
     Sample Input:
     Enter Width of Rectangle in meters
     10
     Enter Length of Rectangle in meters
     5
     Enter width of Equilateraltriangle
     15
     Enter radius of circle
     60

     Expected Output:
     Rectangle width: 10.0 meters and length: 5.0 meters
     Resulting area: 50.0 square meters
     Resulting perimeter: 30.0 meters 

     EquiTriangle side: 15.0meters
     Resulting area: 97 square meters
     Resulting perimeter: 45.0 meters 

     Circle radius : 60.0meters
     Resulting area: 11310 square meters
     Resulting perimeter: 377 meters  

*/

import java.util.Scanner;

abstract class Shape{

  abstract void area();
  abstract void perimeter();

}

//Add  Rectangle  class that extends Shape class
class Rectangle extends Shape{
   public float width,length,area1,perimeter1;
  public void  setData(float width,float length){
    this.width=width;
    this.length=length;
  }
  void area(){
    area1=width*length;
    System.out.println("Rectangle width: "+width+" meters and length: "+length+"meters");
    System.out.println("Resulting area: "+area1+" square meters");
  }
  void perimeter(){
    perimeter1=2*(length+width);
    System.out.println("Resulting perimeter: "+perimeter1+" meters  ");
  }
}
//Add EquilateralTriangle class that extends Shape class
class EquilateralTriangle extends Shape{
   public float side,area1,perimeter1;
  public void  setData(float side){
    this.side=side;
  }
  void area(){
    float f=(float)Math.sqrt(3);
    area1=(f*side*side)/4;
    System.out.println("EquiTriangle side: "+side+" meters");
    System.out.println("Resulting area: "+area1+" meters  ");
  }
  void perimeter(){
    perimeter1=3*side;
    System.out.println("Resulting perimeter: "+perimeter1+" meters  ");
  }
}
//Add Circle class that extends Shape class
class Circle extends Shape{
  public float radius,area1,perimeter1;
  public void  setData(float radius){
    this.radius=radius;
  }
  void area(){
    area1=(3.14f*radius*radius);
    System.out.println("Circle Radius : "+radius+" meters");
    System.out.println("Resulting area: "+area1+" meters  ");
  }
  void perimeter(){
    perimeter1=2*3.14f*radius;
    System.out.println("Resulting perimeter: "+perimeter1+" meters  ");
  }
}
class AreaPerimeter {

//Add the main method here and find Area and Perimeter 
public static void main(String args[]){
//Use the scanner class to provide height and width at execution time


Scanner sc= new Scanner(System.in);
  System.out.println("Enter Width of Rectangle in meters");
  float width=sc.nextFloat();
  System.out.println("Enter length of Rectangle in meters");
  float length=sc.nextFloat();
System.out.println("Enter the side of triangle");
  float side=sc.nextFloat();
  System.out.println("Enter the radius of circle");
  float radius=sc.nextFloat();

Rectangle r1=new Rectangle();
  r1.setData(width, length);
  r1.area();
  r1.perimeter();
EquilateralTriangle e1=new EquilateralTriangle();
  e1.setData(side);
  e1.area();
  e1.perimeter();
Circle c1=new Circle();
  c1.setData(radius);
  c1.area();
  c1.perimeter();
}
}