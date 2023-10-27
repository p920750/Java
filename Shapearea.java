/************************************************************************************
 * File         :Shapearea.java
 * Author       :Praveen Rajan
 * Description  :Java Program to Find the Area of Various Shapes Using Method Overloading
 * Version      :1.0
 * Date         :10/10/23
 ***********************************************************************************/
package firstprog;
import java.util.Scanner;
public class Shapearea {
 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Shape shape=new Shape();
		System.out.println("Enter the Base and Heigth of Triangle:");
		float base=sc.nextFloat();
		float height=sc.nextFloat();
	
		System.out.println("Enter the Length and Breadth of Rectangle:");
		int length=sc.nextInt();
		int breadth=sc.nextInt();
		
		System.out.println("Enter the Radius of Circle:");
		float radius=sc.nextFloat();
		
		Shape.area(base,height);
		Shape.area(length,breadth);
		Shape.area(radius);
		
	}

}
class Shape{
	
	public static void area(int length,int breadth) {
		System.out.println("Area of Rectangle with width "+length+" and breadth "+breadth+" is="+(length*breadth));
	}
	public static void area(float base,float height) {
		System.out.println("Area of Triangle with base "+base+" and height "+height+" is="+(0.5*base*height));
	}
	public static void area(float radius) {
		System.out.println("Area of Circle with radius "+radius+" is="+(3.14*radius*radius));
	}
}