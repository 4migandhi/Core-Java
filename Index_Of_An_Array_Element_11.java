// WAP to find the index of an array element.

public class Index_Of_An_Array_Element_11 {
	
	public static void main(String[] args) {
		
		int[] sumArray = {12, 44, 20, 36};
		int sum = 0;
		
		for (int i = 0; i < sumArray.length; i++) {
			sum = sum + sumArray[i];
		}
		
		
	//to find an average	
		float avg;
		avg = sum/(float)sumArray.length;
											 
		
		System.out.println("The sum is: " + avg);
		
		for (int i = 0; i < sumArray.length; i++) {
			System.out.println("An element " + sumArray[i] + " has an index " + i);
		}
	}
}
