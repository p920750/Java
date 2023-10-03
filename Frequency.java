/************************************************************************************
 * File         :Frequency.java
 * Author       :Praveen Rajan
 * Description  :Java Program to Find Count of an Alphabet in a String
 * Version      :1.0
 * Date         :03/10/23
 ***********************************************************************************/
package firstprog;
import java.util.Scanner;
public class Frequency {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		   System.out.println("Enter a String And an Alphabet");
		    String sentence=sc.nextLine();
		    char alphabet=sc.next().charAt(0);
		   int characterCount=frequency(sentence,alphabet);
		    System.out.println("Number of Times "+alphabet+" Repeats="+characterCount);
 }
	
	
	static int frequency(String sentence,char alphabet) {
		   char array[]=sentence.toCharArray();
		   int count=0;
		         for(int i=0;i<sentence.length();i++)
		        	 if(array[i]==alphabet)
		        		 count++;
		         
		         return count;
		        	 	
	}
}
