//W.A.J.P to Print pattern Given Below.
/*1)
1
12
123
1234
12345*/

public class Pattern_7 {
	public static void main(String[] args) {
		
		int x, y,number, n=5;   
		 
		for(x=0; x<n; x++)  
		{   
		number=1;   
		 
		for(y=0; y<=x; y++)  
		{   
		 
		System.out.print(number+ " ");   
		   
		number++;   
		}   
		  
		System.out.println();      
		
		}
		
		System.out.println("--------------------------------");
/*3)
1
01
101
01010
101010*/

		int p, q, rows=5;         
		for (p = 1; p <= rows; p++)   {  
		for (q = 1; q <= p; q++)  {  
		if(q%2 == 0)  
		{  
		System.out.print(0);  
		}  
		else  
		{  
		System.out.print(1);  
		}  
		}  
		System.out.println();  
		}  
		System.out.println("--------------------------------");
		/*4)
  1
  2 2
  3 3 3
  4 4 4 4
  5 5 5 5 5 */

		for (int a = 1; a <= 5; a++)   
	    {  
	        for (int b = 1; b <= a; b++)  
	        {  
	            System.out.print(a + " ");  
	        }  
	        System.out.println();  
	    }
		System.out.println("--------------------------------");
	
/* (5)
	  *
	* * *
  * * * * *
	* * *
	  *
*/
		for (int i = 1; i <=3; i++) {
			for (int k = i; k <=3; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i =2 ; i >=1; i--) {
			for (int k = i; k <=3; k++) {
				System.out.print(" ");
			}
			for (int j = i*2-1; j >=1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
