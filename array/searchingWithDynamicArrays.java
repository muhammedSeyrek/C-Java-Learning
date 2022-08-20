package springIntro;

import java.util.*;

public class searchingWithDynamicArrays {

	public static void main(String[] args) {
		String[] array = new String[] {"A", "B", "C"};
		Vector vec = new Vector(Arrays.asList(array));
		vec.addElement("E");
		vec.addElement("D");
		vec.sort(null);//sirala.
		//vektor uzerine isaretci koy.
		Iterator it = vec.iterator();
		while(it.hasNext()) {
			//vektor elemanlarini yazdir.
			System.out.print(it.next().toString() + " ");
		}
		if(vec.indexOf("E") > 0) {
			System.out.printf("\nWanted found");
		}
		else {
			System.out.printf("Not found");
		}
	}

}
