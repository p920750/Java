/************************************************************************************
 * File         :Reverse_string.java
 * Author       :Praveen Rajan
 * Description  :Java Program to Find Reverse of a Word
 * Version      :1.0
 * Date         :31/10/23
 ***********************************************************************************/
package firstprog;
import java.util.Scanner;
public class Reverse_string {
   public static void main(String []args) {
	   Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a Word:");
		  String word=sc.next();
		  System.out.println("Orginal Word is:"+word);
		  char array[]=word.toCharArray();
		  System.out.print("Reversed Word is:");
		 
		     
		       for(int i=(array.length)-1;i>=0;i--) 		       
		            System.out.print(array[i]);
	}
}