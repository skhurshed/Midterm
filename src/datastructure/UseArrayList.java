package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

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

		Iterator<Integer> it= list.iterator();

		for (it=list.iterator();it.hasNext();)
		{
		System.out.println(it.next());
	    }

		while(it.hasNext())
		{
			System.out.println(it.next());
		}


	}

}
