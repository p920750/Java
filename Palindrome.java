/************************************************************************************
 * File         :Palindrome.java
 * Author       :Praveen Rajan
 * Description  :Java Program to Check Whether a Word is Palindrome or Not
 * Version      :1.0
 * Date         :03/10/23
 ***********************************************************************************/
package firstprog;
import java.util.Scanner;
public class Palindrome {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a Word:");
		  String word=sc.next();
		  boolean isPalindrome=check(word);
		  if(isPalindrome)
			  System.out.println(word+" is Palindrome");
		  else
			  System.out.println(word+" is Not Palindrome");
	}
		  

   static boolean check(String word) {
	    char array[]=word.toCharArray();
	    int length=word.length();
	           
	             for(int i=0;i<=(length/2);i++) {
	            	 if(array[i]!=array[length-i-1]) 
	            		 return false;
	            	     
	               }
	             return true; 	 
	 }	 
}

