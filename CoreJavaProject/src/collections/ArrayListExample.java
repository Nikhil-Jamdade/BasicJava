package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<String>();

		list1.add("Vik");
		list1.add("Esha");
		list1.add("Jamdade");

		System.out.println("The list: " + list1);
		System.out.println("Size: " + list1.size());
		System.out.println("Last: " + list1.get(list1.size() - 1));

		list1.add(1, "Nikhil"); // Add
		System.out.println("Add: " + list1);

		list1.set(3, "Shiv"); // Replace
		System.out.println("Replace: " + list1);

		list1.remove(2); // Remove
		System.out.println("Remove: " + list1);

		//Iterate through the list
		
		System.out.println();
		System.out.println("For loop");
		for (int i = 0; i < list1.size(); i++) {
			System.out.println("Element: " + list1.get(i));
		}

		System.out.println();
		System.out.println("For each loop");
		for (String value : list1) {
			System.out.println("Element: " + value);
		}

		System.out.println();
		System.out.println("Iterator loop");
		Iterator<String> itr = list1.iterator();
		while(itr.hasNext()) {
			System.out.println("Element: " + itr.next());
		}
		
		System.out.println();
		System.out.println("Ascending Sort");
		Collections.sort(list1);
		System.out.println("After sort: " + list1);
	
		System.out.println();
		System.out.println("Descending sort");
		Collections.sort(list1, Collections.reverseOrder());
		System.out.println("Reverse sort: " + list1);
		
		
	}
}