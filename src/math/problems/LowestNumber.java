package math.problems;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LowestNumber {

	public static void main(String[] args) {
		/*
		 * Write java solution to find the lowest number from this array.
		 * Use one of the databases from mysql or mongodb to store and to retrieve.
		 */

		//find lowest number from the array

		int array[] = {10, 20, 25, 63, 96, 57};
		int min = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("smallest element is ::" + min);


		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		List<String> lowestValue = new ArrayList<String>();
		try {
			connectToSqlDB.insertDataFromArrayToSqlTable(array, "tbl_lowestNumber", "column_lowestNumber");
			lowestValue = connectToSqlDB.readDataBase("tbl_lowestNumber", "column_lowestNumber");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Data is reading from the Table (tbl_primenumber) and displaying to the console");
		for (String st : lowestValue) {
			System.out.println(st);
		}
	}
}



