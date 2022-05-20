package datastructure;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		Map<String, List<String>> list = new HashMap<String, List<String>>();

		list.put("Students", Collections.singletonList("Bob, Mike,Adam, Jennifer, Mariam, Ahmed, Ayza"));

		System.out.println(list);


		for(Map.Entry entry: list.entrySet()){
			System.out.println(entry.getValue()+ " "+ entry.getKey());

			int i=0;
			while(i<1){
				System.out.println(entry.getKey());
				break;
			}
		}
	}

}
