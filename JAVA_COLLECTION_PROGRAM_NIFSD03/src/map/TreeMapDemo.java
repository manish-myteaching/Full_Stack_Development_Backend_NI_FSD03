package map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<String, String>();
		map.put("A", "AAA");
		map.put("C", "BBB");
		map.put("C", "BBB");
		map.put("C", "BBB");
		map.put("X", "XBS");
		map.put("Z", "SDFS");
		map.put("k", "SDFEE");
		map.put("a", "AAA");
		map.put("ab", "AAA");
		map.put("abb", "AAA");

		Set<Map.Entry<String, String>> obj = map.entrySet();
		for (Map.Entry me : obj) {
			System.out.println(me.getKey() + "      " + me.getValue());
		}

	}

}
