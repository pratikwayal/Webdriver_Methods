package Collection_framework;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
	HashMap <Integer,String> map =new HashMap();
	 map.put(32, "pratik");
	 map.put(45, "wayal");
	 map.put(43, null);
	 map.put(null, "Test");
	 map.put(76, null);
	 for (Map.Entry<Integer, String> e : map.entrySet() ) {
		 System.out.println("Key " + e.getKey() + "Value " + e.getValue());
	 }
	 System.out.println("_________________________");
	 map.put(65,"place");
	 for (Map.Entry<Integer, String> e : map.entrySet() ) {
		 System.out.println("Key " + e.getKey() + "Value " + e.getValue());
	 }
	}
}
