package iterativeforloop;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ForEachLoopDemo {

	public static void main(String[] args) {

		String[] city = { "Mumbai", "Pune", "Indore" }; // Array
		List<String> list = Arrays.asList("Mumbai", "Pune", "Indore"); // Collection

		// One way
		System.out.println("#########For Loop#################");
		for (int i = 0; i < city.length; ++i) {
			System.out.println(city[i]);
		}
		for (int i = 0; i < list.size(); ++i) {
			System.out.println(list.get(i));
		}

		System.out.println("#########ForEach Loop#################");
		for (String s : city) { // without index
			System.out.println(s);
		}

		for (String s : list) { // without index
			System.out.println(s);
		}

		// Iteration by collection
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
