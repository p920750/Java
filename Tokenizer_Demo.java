package programs;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Tokenizer_Demo {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a Sentence:");
	      String str=sc.nextLine();
	      StringTokenizer obj=new StringTokenizer(str);
	      System.out.println("Number of Tokens="+obj.countTokens());
	           while(obj.hasMoreTokens()) {
	        	   System.out.println("Next Token:"+obj.nextToken());
	              }	
	}

}
