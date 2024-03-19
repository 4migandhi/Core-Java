//W.A.J.P to check given number is Prime or not?

public class Prime_Number_4 {
	public static void main(String[] args) {
		
		int no,flag;
	    
	    no = 7; 
	    flag = 1;
	    
	    for (int i = 2; i < 5; i++)
	    	
	        if (no % 2 == 0){
	            flag = 0;
	        }
	        
	        if(flag == 0){
	            System.out.println("Not a prime number");
	        }else{
	            System.out.println("Prime number");
	        }	
	}
}
