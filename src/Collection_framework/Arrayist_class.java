package Collection_framework;

import java.util.ArrayList;

public class Arrayist_class {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
list.add(56743);
list.add("Velocity");
list.add("#");
list.add(23.87f);

//System.out.println(list);

int size = list.size();
System.out.println("Size :" + size);
for (int i=0;i < list.size();i++) {
	System.out.println(list.get(i));
}
list.remove(2);
for (int i=0;i < list.size();i++) {
	System.out.println(list.get(i));
}


	}

}
