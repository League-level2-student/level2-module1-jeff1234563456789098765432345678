package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> array = new ArrayList<String>();
		//2. Add five Strings to your list
		array.add("Strings1");
		array.add("Strings2");
		array.add("Strings3");
		array.add("Strings4");
		
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
			System.out.println(array.get(i/2));
			//System.out.println(array.get());
		}
		//4. Print all the Strings using a for-each loop
		
		//5. Print only the even numbered elements in the list.
		
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
