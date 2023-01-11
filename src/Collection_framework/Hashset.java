package Collection_framework;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
	
		HashSet<Character> set = new HashSet();
		set.add('#');
		set.add('@');
		set.add('&');
		set.add('*');
		set.add('%');
		
		for (char r: set) {
			System.out.println(r);
		}

	}

}
// insertion order not refelct in output
// need advance for loop