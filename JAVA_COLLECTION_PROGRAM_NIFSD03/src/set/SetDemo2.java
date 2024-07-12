package set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo2 {

	public static void main(String[] args) {
	
		 Set<String>set=new HashSet();
		 set.add("AAA");
		 set.add("BBB");
		 set.add("CCC");
		 set.add("KKK");
		 set.add("DDD");
		 set.add("AAA");
		 System.out.println(set);

	}

}
