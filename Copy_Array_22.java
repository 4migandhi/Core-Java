// WAP to Copy one array into another.
public class Copy_Array_22 {
	
	public static void main(String[] args) {
		
		  int [] a = new int [] {1, 2, 3, 4, 5}; 
		  
		  int[] b = new int[a.length]; 
	        
	        for (int i = 0; i < a.length; i++) {
	        	
	        	b[i] = a[i];
	        	System.out.println("Second array b: "+b[i]);
	        }
	}
}
