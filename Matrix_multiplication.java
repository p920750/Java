package firstprog;
import java.util.Scanner;
public class Matrix_multiplication {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int i,j;
		 System.out.println("Enter Number of Rows and Coloumns of First Matrix:");
		 int rowSize1=sc.nextInt();
		 int coloumnSize1=sc.nextInt();
		 int [][]matrix1=new int[rowSize1][coloumnSize1];
		 System.out.println("Enter Numbers in First Matrix:");
		      for(i=0;i<rowSize1;i++) {
		    	  for(j=0;j<coloumnSize1;j++) {
		    		   matrix1[i][j]=sc.nextInt();
		    	        }
		            }
		 System.out.println("First matrix is:");
		 for(i=0;i<rowSize1;i++) {
	    	  for(j=0;j<coloumnSize1;j++) {
		      	  System.out.print(matrix1[i][j]+" ");
	    	      }
	    	  System.out.println();
		       }
		 
		 
		 System.out.println("Enter Number of Rows and Coloumns of Second Matrix:");
		 int rowSize2=sc.nextInt();
		 int coloumnSize2=sc.nextInt();
		 int [][]matrix2=new int[rowSize2][coloumnSize2];
		 System.out.println("Enter Numbers in Second Matrix:");
		      for(i=0;i<rowSize2;i++) {
		    	  for(j=0;j<coloumnSize2;j++) {
		    		   matrix2[i][j]=sc.nextInt();
		    	        }
		            }
		 System.out.println("Second matrix is:");
		 for(i=0;i<rowSize2;i++) {
	    	  for(j=0;j<coloumnSize2;j++) {
		      	  System.out.print(matrix2[i][j]+" ");
	    	      }
	    	  System.out.println();
		       }
		 //Multiplication of Two Matrices
		 
		 int [][]multMatrix=new int[rowSize1][coloumnSize2];
		           if(coloumnSize1==rowSize2) {
		        	   System.out.println("Matrix Multiplication is Possible:");
		        	           for(i=0;i<rowSize1;i++) {
		 		    	          for(j=0;j<coloumnSize2;j++) {
		 		    	        	  multMatrix[i][j]=0;		 		    	         
		 		    	        	       for(int k=0;k<rowSize2;k++) {
		 		    	        		        multMatrix[i][j]=multMatrix[i][j]+((matrix1[i][k])*(matrix1[k][j]));
		 		    	        	           }
		 		    	                  }
		        	   		          }
		        	   }
		           else
		        	   System.out.println("Matrix Multiplication is not Possible:");
		           
		   //Displaying of Two Matrices        
		        
		        System.out.println("Product of Two Matrixes is:");
		        for(i=0;i<rowSize1;i++) {
	    	          for(j=0;j<coloumnSize2;j++) {
	    	        	  System.out.print(multMatrix[i][j]+" ");
	    	              }
	    	          System.out.println();
		            }
		        
		        
    }
}



