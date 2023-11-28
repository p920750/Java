/************************************************************************************
 * File         :Tokenizer_Sum.java
 * Author       :Praveen Rajan
 * Description  :Java Program to Find Sum of Numbers Using String Tokenizer
 * Version      :1.0
 * Date         :28/11/23
 ***********************************************************************************/
package firstprog;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Tokenizer_Sum {
   public static void main(String []args) {
	   Scanner sc=new Scanner(System.in);
	   int sum=0;
	   System.out.println("Enter a Set of Integer Strings:");
	   String str=sc.nextLine();
	   StringTokenizer obj=new StringTokenizer(str);
	     while(obj.hasMoreTokens()) {
	    	 int n=Integer.parseInt(obj.nextToken());
	    	 sum=sum+n;
	     }
	     System.out.println("Sum of Numbers Using String Tokenizer="+sum);
   }
}
      