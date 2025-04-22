package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMainFeatures {

	public static void main(String[] args) {
		
		// Create array list
		ArrayList<String> friendsArrayList = new ArrayList<>(Arrays.asList("Jhon", "Chris", "Eric", "Luke"));

		// Get element
		// [0] [1] [2] [3] ...
		System.out.println(friendsArrayList.get(1));
		
		// Get size
		System.out.println(friendsArrayList.size());
		
		// Add element
		friendsArrayList.add("Marc");
		System.out.println(friendsArrayList);
		
		// Set an element
		friendsArrayList.set(0, "Carl");
		System.out.println(friendsArrayList);
		
		// Remove element
		friendsArrayList.remove(0);
		friendsArrayList.remove("Marc");
		System.out.println(friendsArrayList);
		
		// Check for element
		System.out.println(friendsArrayList.contains("Marc"));
		System.out.println(friendsArrayList.contains("Luke"));
	}

}
