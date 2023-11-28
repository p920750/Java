/************************************************************************************
 * File         :CustomException.java
 * Author       :Praveen Rajan
 * Description  :Java Program of a ATM Process Using Custom Exception
 * Version      :1.0
 * Date         :10/11/23
 ***********************************************************************************/
package firstprog;
import java.util.Scanner;
class InvalidAmountException extends Exception{
	InvalidAmountException(String str){
		super(str);
	}
}



class InsufficiantFundException extends Exception{
	InsufficiantFundException(String str){
		super(str);
	}
}



class Customer{
	String name, accounttype;
	long accountnumber;
	int balance;
	Scanner sc=new Scanner(System.in);
	public void setcustomerdetails() {
		System.out.println("Enter the Customer Name:");
		name=sc.nextLine();
		System.out.println("Enter the Account Number:");
		accountnumber=sc.nextLong();
		System.out.println("Enter the Account Type:");
		accounttype=sc.next();
		System.out.println("Enter the Account Opening Balance:");
		balance=sc.nextInt();
	}

	public void getcustomerdetails() {
		System.out.println("______________________________");
		System.out.println("The Customer Details are:");
		System.out.println("Customer Name:"+name);
		System.out.println("Account Number:"+accountnumber);
		System.out.println("Account Type:"+accounttype);
		System.out.println("Account Balance:"+balance);
		System.out.println("______________________________");
		System.out.println();
	}	
}



public class CustomException {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		InvalidAmountException amountException=new InvalidAmountException("amountException");
		InsufficiantFundException fundException=new InsufficiantFundException("fundException");
		System.out.println("Enter the Number of Customers:");
		int customerNo=sc.nextInt();
		Customer [] customer=new Customer[customerNo];
		for(int i=0;i<customerNo;i++) {
			customer[i]=new Customer();
			customer[i].setcustomerdetails();
		}

		do {
			System.out.println("______________________________");
			System.out.println("1.Display Account Details");
			System.out.println("2.Search by Account Number");
			System.out.println("3.Deposit the Amount");
			System.out.println("4.Withdraw the Amount");
			System.out.println("______________________________");
			System.out.println("Enter your choice:");
		    choice=sc.nextInt();
		    switch (choice) {

		    case 1:for(int i=0;i<customerNo;i++) {
					 customer[i].getcustomerdetails();
				    }
		    	   break;	    	

		    case 2:int count=0;
		    	   System.out.println("Enter the Account Number to be Searched:");
		    	   long accountNo=sc.nextLong();
		    	      for(int i=0;i<customerNo;i++) {
		    		      if(customer[i].accountnumber==accountNo) {
		    			      customer[i].getcustomerdetails();
		    			      count++;
		    		       }
		    	      }
		    	      if(count==0)
		    		  System.out.println("Account Not Found:");    
		    	   break;  	   

		    case 3:System.out.println("Enter the Account Number:");
		    	   accountNo=sc.nextLong();
		    	   try {
		    		  System.out.println("Enter the Amount to be Deposited:");
			    	  int depositamount=sc.nextInt();
			    	    if (depositamount<=0)
			    		  throw amountException;
			    	    else {
			    	       for(int i=0;i<customerNo;i++) {
			    		      if(customer[i].accountnumber==accountNo) {
			    			     customer[i].balance=customer[i].balance+depositamount;
			    			     customer[i].getcustomerdetails();
			    		           }
			    		        }
			    	        }
		    	       }
		    	  catch(InvalidAmountException e) {
		    		   System.out.println("Invalid Amount");
		    	       }
		    	  break;

		    case 4:System.out.println("Enter the Account Number:");
		    	   accountNo=sc.nextLong();
		    	   try {
		    		  System.out.println("Enter the Amount to Withdraw:");
			    	  int withdrawamount=sc.nextInt();
			    	    if(withdrawamount<=0) {
			    		   throw amountException;
			    	      }
			    	   else {
			    	      for(int i=0;i<customerNo;i++) {
			    		      if(customer[i].accountnumber==accountNo) {
			    			      if(withdrawamount>customer[i].balance) {
			    				     throw fundException;
			    			        }
			    			  else {
			    				 customer[i].balance=customer[i].balance-withdrawamount;
			    				 customer[i].getcustomerdetails();   			}
			    		           }
			    	            }
		    	            }
		                }
		    	  catch(InvalidAmountException e) {
		    		  System.out.println(e.getMessage());
		    	     }
		         catch(InsufficiantFundException e) {
		        	  System.out.println("Error Lack of Amount:");
		             }
		    	   break;

		      default: {
		    	  System.out.println("Wrong choice!!");
		          }
		     }
	   }while(choice<5);
   }
}


