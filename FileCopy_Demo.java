/************************************************************************************
 * File         :FileCopy_Demo.java
 * Author       :Praveen Rajan
 * Description  :Java Program to Copy Contents a File to another File
 * Version      :1.0
 * Date         :24/11/23
 ***********************************************************************************/
package firstprog;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileCopy_Demo {
public static void main(String []args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a Sentence");
    String str=sc.nextLine();
    char []data=new char[50];
    FileWriter obj=null;
    FileReader input=null;
    FileWriter output=null;
    try {
    	obj=new FileWriter("praveen.txt");
    	obj.write(str);
    	obj.close();
    	input=new FileReader("praveen1.txt");
        int bytes=input.read(data);
        System.out.println(data);
        input.close();
        output=new FileWriter("output.txt");
        output.write(data,0,bytes);
        output.flush();
        output.close();
        }
   catch(IOException e) {
       e.printStackTrace();
      }
   }
}