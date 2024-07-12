package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("JAVASE");
		list.add("J2ME");
		list.add("J2EE");
		list.add("SPRING");
		list.add("HIBERNATE");

		//Before Sorting
		for (String s : list) {
			System.out.println(s);
		}

		Collections.sort(list);
  
		System.out.println("");
		//After Sorting 
		for (String s : list) {
			System.out.println(s);
		}

	}

}
