package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {

//****************** HASH SET ********************************//		

		HashSet<String> set1 = new HashSet<String>();
		set1.add("Jake");
		set1.add("Lily");
		set1.add("Naina");
		set1.add("Naina");
		set1.add(null);

		System.out.println(set1);

		for (String value : set1) {
			System.out.println("Value: " + value);
		}

//****************** TREE SET ********************************//		

		TreeSet<String> set2 = new TreeSet<String>();
		set2.add("D");
		set2.add("A");
		set2.add("C");
		set2.add("B");
		System.out.println(set2);

//****************** Convert Set to list *********************// 		

		ArrayList<String> list1 = new ArrayList<String>(set2);
		System.out.println(list1);
	}
}