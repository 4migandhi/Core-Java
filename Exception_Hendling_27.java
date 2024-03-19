/* W.A.J.P. to create a custom exception if Customer withdraw amount which is greater 
 * than account balance then program will show custom exception otherwise amount will
 *  deduct from account balance.Account balance is:2000 Enter withdraw amount:2500 
 *  Sorry, insufficient balance, you need more 500 Rs. To perform this transaction.*/

//public class Exception_Hendling_27 {

import java.util.Scanner;

class MyException1 extends Exception{
	int amount;
	public MyException1(int amount) {
		this.amount = amount;
	}
}

class ATM{
    
	int amount,balance;
    
    public void deposite(int amount){        
        this.amount = amount;
        balance = balance + amount;
        System.out.println("Deposited amount is: " + balance + " rs");
        
    }
    
    /*throws is applied after method declaration and then followed by user-defined exception as well as 
     	system defined exception*/
    
    public void withdraw(int amount) throws MyException1,ArithmeticException{        
        
        if (amount >= balance) {

        	try {
				int needs;
				needs = amount - balance;
				throw new MyException1(needs);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(" Sorry, insufficient balance, you need more");
			}
        	
		} else {
			this.amount = amount;
	        
	        balance = balance - amount;
	        System.out.println("Withdrawn amount is: " + amount + " rs");
	        
	        System.out.println("Remaining amount is: " + balance + " rs");

		}
    }
}

public class Exception_Hendling_27 {
	public static void main(String[] args) throws ArithmeticException, MyException1 {
		// TODO Auto-generated method stub
		int amount;
	    
	    Scanner sc = new Scanner(System.in);
	   
	    System.out.println("Enter your deposite amount: ");
	    amount = sc.nextInt();
	     
	    ATM atm = new ATM();
	    atm.deposite(amount);
	    
	    System.out.println("Enter your withdrawn amount: ");
	    amount = sc.nextInt();
	     
	     try {
			atm.withdraw(amount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}

