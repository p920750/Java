package firstprog;
import java.util.Scanner;
public class Transpose_Matrix {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Number of Rows and Coloumns:");
		 int row=sc.nextInt();
		 int coloumn=sc.nextInt();
		 int [][]matrix=new int[row][coloumn];
		 int [][]transpose=new int[coloumn][row];
		 System.out.println("Enter Nubers in the Matrix:");
		 
		 System.out.println("Orginal Matrix is:");
		   for(int i=0;i<row;i++) {
			     for(int j=0;j<coloumn;j++) {
				       matrix[i][j]=sc.nextInt();
				       System.out.print(matrix[i][j]+" ");
			         }
			     System.out.println();		     
		        }
		   
		   
		   
		         System.out.println("Transposed Matrix is:");
		        for(int i=0;i<row;i++) {
		        	 for(int j=0;j<coloumn;j++) {
		        		 transpose[i][j]=matrix[j][i];
		        		 System.out.print(transpose[i][j]+" ");
		        	 }
		         System.out.println();
		        }
    }
}
