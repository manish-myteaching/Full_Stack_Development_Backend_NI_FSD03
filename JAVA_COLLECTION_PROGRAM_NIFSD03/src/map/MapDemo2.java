package map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo2 {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("A", 100);
		map.put("B", 101);
		map.put("C", 102);
		map.put("D", 103);
		map.put("E", 103);
		map.put("K", 102);
		map.put("K", 102);
		map.put("K", 102);
		map.put("K", 102);

		System.out.println(map);

	}

}
