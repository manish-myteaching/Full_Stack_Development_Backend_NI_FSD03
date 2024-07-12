package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {

	public static void main(String... k) {
			
		Set set = new HashSet();
		set.add(12);
		set.add(14);
		set.add(48);
		set.add(12);

		System.out.println(set);
	}

}
