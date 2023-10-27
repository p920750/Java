/************************************************************************************
 * File         :EmployeeOverriding.java
 * Author       :Praveen Rajan
 * Description  :Java Program to Implement Inheritance for Employee
 * Version      :1.0
 * Date         :17/10/23
 ***********************************************************************************/
package firstprog;
import java.util.Scanner;
public class EmployeeOverriding {
	public static void main(String[] args) {
		Officer officer=new Officer();
		Manager manager=new Manager();
		officer.getDetails();
		officer.getSpecialization();
		System.out.println();
	    System.out.println("Details of the Officer:");
	    officer.printDetails();
	    System.out.println();
		officer.printSalary();
		System.out.println();
		officer.printSpecialization();
		System.out.println();
		//Manager
		System.out.println();
		manager.getDetails();
		manager.getDepartment();
		System.out.println();
		System.out.println("Details of the Manager:");
		manager.printDetails();
		System.out.println();
		manager.printSalary();
		System.out.println();
	    manager.printDepartment();
		}
	}
class Employee{
   Scanner sc=new Scanner(System.in);
   int salary,age;
   String name,address;
   long phone;
	public void getDetails() {
		System.out.println("Enter the following details:");
		System.out.print("Name:");
		name =sc.nextLine();
		System.out.print("Address:");
	    address=sc.nextLine();	
		System.out.print("Age:");
		age=sc.nextInt();
		System.out.print("Phone Number:");
		phone=sc.nextLong();
		System.out.print("Salary:");
		salary=sc.nextInt();
	}
	public void printSalary() {
		System.out.println("Salary:"+salary);
		}
	public void printDetails() {
		System.out.println("Name:"+name);
		System.out.println("Address:"+address);
		System.out.println("Age:"+age);
		System.out.println("Phone Number:"+phone);
	}
}
class Officer extends Employee {
	String specialization;
	public void getSpecialization() {
		System.out.println("Enter Specialisation of Officer:");
		specialization=sc.nextLine();
	}
	public void printSpecialization() {
		System.out.println("Specialization:"+specialization);
		}
}
class Manager extends Employee {
	String department;
	public void getDepartment() {
		System.out.println("Enter Department of Manager:");
		department=sc.nextLine();
	}
	public void printDepartment() {
		System.out.println("Department:"+department);
	}
}
