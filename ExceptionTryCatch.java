/************************************************************************************
 * File         :AnimalInterface.java
 * Author       :Praveen Rajan
 * Description  :Java Program Use of Try Block
 * Version      :1.0
 * Date         :10/11/23
 ***********************************************************************************/
package firstprog;
import java.util.Scanner;
public class ExceptionTryCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ans = 'y';
		while(ans == 'y') {
			try {
			System.out.println("Program to Perform Division");
			System.out.print("Enter Any Two Numbers:");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
				int result = num1/num2;
				System.out.println("Resut="+result);
			}
			catch (Exception e) {
				System.out.println("Division by Zero is Not Possible");
			}
			finally {
				System.out.println("End of Operation");
			}
			System.out.println("Do you want to continue y or n");
			ans = sc.next().charAt(0);
		  }
	 }
}
