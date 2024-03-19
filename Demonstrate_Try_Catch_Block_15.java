//WAP to demonstrate try catch block.

public class Demonstrate_Try_Catch_Block_15 {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		
		try {
			System.out.println("divsion is :"+a/b);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
