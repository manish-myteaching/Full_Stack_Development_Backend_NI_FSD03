package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add(1); // Insert
		list.add(60);
		list.add(80);
		list.add(2); // Insert
		//list.add("Manish");
		list.add(40);

		//list.remove(0);

		//list.set(1, 4); // Modify

		System.out.println(list);

		// Traversing
		for (int i = 0; i < list.size(); ++i) {
			System.out.println(list.get(i));
		}

		// Searching
		System.out.println(list.get(2));

		//sorting
		Collections.sort(list);

		// Traversing
		System.out.println("Sorting");
		for (int i = 0; i < list.size(); ++i) {
			System.out.println(list.get(i));
		}

	}

}
