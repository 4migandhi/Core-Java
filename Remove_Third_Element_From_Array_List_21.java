// WAP to remove the third element from a array list.

import java.util.ArrayList;

public class Remove_Third_Element_From_Array_List_21 {
	
	public static void main(String[] args) {
		

		ArrayList a2 = new ArrayList();
		
		System.out.println("Default Value is:"+a2);
		System.out.println("Default Size is: "+a2.size());
		System.out.println();
		
		a2.add(100);
		a2.add(12.5f);
		a2.add('C');
		a2.add("Charmi");
		a2.add(new Integer(10));
		
		System.out.println("Now Value is:"+a2);
		System.out.println("Now Size is: "+a2.size());
		System.out.println();
		
		a2.remove(2);
		System.out.println("Now Value is:"+a2);
		System.out.println("Now Size is: "+a2.size());
		System.out.println();
	}
}
