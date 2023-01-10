package Collection_framework;

import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] args) {
		ArrayList<String> Name = new ArrayList<String>();
		Name.add("Abhi");
		Name.add("Ankit");
		Name.add("Anukul");
		Name.add("Asha");
		System.out.println(Name);
		Name.add("Atul");
		System.out.println(Name);
		Name.add(1, "Aditya");
		System.out.println(Name);
		Name.add(0, "Pratik");
		System.out.println(Name);
		Name.remove(3);
		System.out.println(Name);
		Name.set(0,"Pankaj"); // for replace a string element in array
		System.out.println(Name);  
		System.out.println(Name.get(4)); // to print specific elem
		Name.clear();
	}

}
