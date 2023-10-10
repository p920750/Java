/************************************************************************************
 * File         :firstprog
 * Author       :Praveen Rajan
 * Description  :Java Program to Find Attendance Mark
 * Version      :1.0
 * Date         :26/09/23
 ***********************************************************************************/
package firstprog;
import java.util.Scanner;
public class Attendance
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	int attendance;
	float attendanceMark;
	System.out.println("Enter Attendance Percentage");
	attendance=sc.nextInt();
	if(attendance>=90)
	{
	attendanceMark=(int)10;
	System.out.println("Attendance mark="+attendanceMark);
	}
	else
		{
			attendanceMark=attendance/10;
			System.out.println("Attendance mark="+attendanceMark);
			}
	}
}
		