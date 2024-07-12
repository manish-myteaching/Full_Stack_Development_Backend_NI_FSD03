package set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		Set<String> set = new TreeSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		set.add("T");
		set.add("X");
		set.add("F");
		set.add("G");
		set.add("X");
		set.add("X");
		set.add("X");
		System.out.println(set);

	}

}
