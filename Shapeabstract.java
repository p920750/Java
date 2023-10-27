/************************************************************************************
 * File         :Shapeabstract.java
 * Author       :Praveen Rajan
 * Description  :Java Program to Understand the Use of "abstract" Keyword and Inheritance
 * Version      :1.0
 * Date         :26/09/23
 ***********************************************************************************/
package firstprog;
abstract class Shapes {
     public abstract void numberOfSides();
}
class Rectangle extends Shapes {
	public void numberOfSides() {
	   System.out.println("Rectangle has Four Sides:");
	  }
}
class Triangle extends Shapes {
	public void numberOfSides() {
	   System.out.println("Triangle has Three Sides:");
	  }
}
class Hexagon extends Shapes {
	public void numberOfSides() {
	   System.out.println("Hexagon has Six Sides:");
	  }
}
public class Shapeabstract {
	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle();
		Triangle triangle=new Triangle();
		Hexagon hexagon=new Hexagon();
		rectangle.numberOfSides();
		triangle.numberOfSides();
		hexagon.numberOfSides();
	  }
}
