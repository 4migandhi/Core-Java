/* W.A.J.P. which will ask the user to enter his/her marks (out of 100). Define a 
 * method that will display grades according to the marks entered as below:
Marks Grade
91-100 AA
81-90 AB
71-80 BB
61-70 BC
51-60 CD
41-50 DD
<=40 Fail*/

import java.util.Scanner;

public class Marks_26 {
	
	public static void main(String[] args) 
	{
		class Main {
		    {
		       Scanner in = new Scanner(System.in) ;
		       int a = in.nextInt();
		      String ans = grade(a) ;
		      System.out.println(ans) ; 
		    }
		    String grade(int a ) 
		    {
		        if (a>91 && a<100)
		        {
		       return "AA" ;
		        }
		    if (a>81 && a<90)
		    {
		        return "AB";
		    }
		    if (a>71 && a<80) 
		    {
		        return "BB";
		    }
		        if (a>61 && a<70)
		        {
		            return "BC";
		        }
		    if (a>51 && a<60) 
		    {
		        return "CD ";
		    }
		        if (a>41 && a<50)
		        {
		            return "DD ";
		        }
		    if (a<=40)
		    {
		        return "FAIL";
		    }
		     else return "please enter valid number ";
		  }
		}
	}
}
