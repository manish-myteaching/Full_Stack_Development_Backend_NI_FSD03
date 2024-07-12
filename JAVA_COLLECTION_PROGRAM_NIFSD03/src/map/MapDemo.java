package map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {

		Map map = new HashMap();
		map.put(10, 100);
		map.put(11, 101);
		map.put(16, 102);
		map.put(13, 103);
		map.put(15, 103);
		map.put(16, 102);

		System.out.println(map);

	}

}
