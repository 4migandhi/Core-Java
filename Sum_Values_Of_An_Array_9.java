// WAP to sum values of an array

public class Sum_Values_Of_An_Array_9 {
	
	public static void main(String[] args) {
		
		int[] sumArray = {1, 2, 3, 4};
		int sum = 0;
		
		for (int i = 0; i < sumArray.length; i++) {
			sum = sum + sumArray[i];
		}
											 
		System.out.println("The sum is: " + sum);
		
	}
	
}

