/************************************************************************************
 * File         :Grade.java
 * Author       :Praveen Rajan
 * Description  :Java Program to Find Grade Of a Student
 * Version      :1.0
 * Date         :26/09/23
 ***********************************************************************************/
package firstprog;
import java.util.Scanner;
public class Grade
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	int gradeOfStudent;
	System.out.println("Enter Grade of a Student");
	gradeOfStudent=sc.nextInt();
	if(gradeOfStudent>=90)
 System.out.println("Grade:S");	
	if(gradeOfStudent>=85)
		 System.out.println("Grade:A+");	
	else if(gradeOfStudent>=80)
		 System.out.println("Grade:A");	
	else if(gradeOfStudent>=75)
		 System.out.println("Grade:B+");
	else if(gradeOfStudent>=70)
		 System.out.println("Grade:B");	
	else if(gradeOfStudent>=65)
		 System.out.println("Grade:C+");
	else if(gradeOfStudent>=60)
		 System.out.println("Grade:C");	
	else if(gradeOfStudent>=50)
		 System.out.println("Grade:P");
	else if(gradeOfStudent>=40)
		 System.out.println("Grade:FE");
	else
		 System.out.println("Grade:F");
	}
}	
	
	