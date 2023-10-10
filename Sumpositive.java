/************************************************************************************
 * File         :firstprog
 * Author       :Praveen Rajan
 * Description  :Java Program to Find Sum of 'N' Positive Numbers
 * Version      :1.0
 * Date         :26/09/23
 ***********************************************************************************/
package firstprog;
import java.util.Scanner;
public class Sumpositive{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int number,sumPositive=0,choice;
		System.out.println("Enter An Integer Number");
		number=sc.nextInt();
		System.out.println("\nEnter Your Choice:\n1.Using While Loop\n2.Using Do While Loop\n");
		choice=sc.nextInt();
		switch(choice){
			case 1:	while(number>0){
						sumPositive=sumPositive+number;
						number=sc.nextInt();
					}
					System.out.println("Sum Of All Positive Numbers Using While Loop="+sumPositive);
					break;
				
			case 2:	do{
						if(number>0){
							sumPositive=sumPositive+number;
							number=sc.nextInt();
						}
					}while(number>0);
					System.out.println("Sum Of All Positive Numbers Using Do While Loop="+sumPositive);
					break;
		}
	}
}
	
