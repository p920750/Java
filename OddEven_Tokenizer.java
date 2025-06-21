package programs;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class OddEven_Tokenizer {
	public static void main(String []args) throws FileNotFoundException,IOException {
		BufferedReader in=new BufferedReader(new FileReader("numbers.txt"));
		String str=in.readLine();
		StringTokenizer obj=new StringTokenizer(str);
		while(obj.hasMoreTokens()) {
			int n=Integer.parseInt(obj.nextToken());
			if(n%2==0)
			   System.out.println(n+" is Even");
			else
				System.out.println(n+" is Odd");
		}
	}

}
