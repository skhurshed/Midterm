package datastructure;

import java.util.ArrayList;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList <Integer> list = new ArrayList<>();

		list.add(400);
		list.add(45);
		list.add(234);
		list.add(120);
		list.add(67);


		list.remove(0);
		list.add(4);

		System.out.println(list);

		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}

		int i=0;
		while (i<1){
			System.out.println(list.get(3));
			break;
		}

	}

}
