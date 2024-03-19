// WAP to compute the sum of the first 100 prime numbers.

public class Sum_Of_The_First_100_Prime_Numbers_8 {
	
	public static void main(String args[])   
	{  
	int count, sum = 0;  
	
	for(int number = 1; number <= 541; number++)  
	{  
	count = 0;  
	for (int i = 2; i <= number/2; i++)  
	{  
	    
	if(number % i == 0)  
	{  
	
	count++;  
	break;  
	}  
	}  
	 
	if(count == 0 && number != 1 )  
	{  
	     
	sum = sum + number;  
	}    
	}  

	System.out.println("The Sum of First 100 Prime Numbers : " + sum);  
	} 

}
