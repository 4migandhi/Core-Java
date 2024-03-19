//W.A.J.P to check given number is Armstrong or not?

public class Armstrong_Or_Not_5 {
	

	public static void main(String[]args)
	{
		int num=3;
		int count=0;
		
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		if(count==1)
		{
			System.out.println("it is not armstrong num");
		}
		else
		{
			System.out.println("its a armstrong num");
		}
	}
}
