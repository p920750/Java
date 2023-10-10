/************************************************************************************
 * File         :firstprog
 * Author       :Praveen Rajan
 * Description  :Java Program to Find Sum of Two Integer Numbers
 * Version      :1.0
 * Date         :26/09/23
 ***********************************************************************************/
package firstprog;
import java.util.Scanner;
public class Sum 
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
int numberFirst,numberSecond,sum;
System.out.println("Enter Any Two Integer Numbers");
numberFirst=sc.nextInt();
numberSecond=sc.nextInt();
sum=numberFirst+numberSecond;
System.out.println("Sum of Two Numbers="+sum);
}
}