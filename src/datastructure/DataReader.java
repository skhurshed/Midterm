package datastructure;

import java.io.*;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class DataReader {

	public DataReader() throws FileNotFoundException {
	}

	public static void main(String[] args)throws IOException {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		//String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
		FileReader fileReader= new FileReader("C:\\Users\\sadaf\\eclipse-workspace\\midterm-coding-exam\\src\\data\\self-driving-car");
		BufferedReader bufferedReader= new BufferedReader(fileReader);
		String str=" ";
		while ((str = bufferedReader.readLine()) != null){
			System.out.println(str);
		}
		fileReader.close();
		bufferedReader.close();

		String content = new String();

		int count=1;
		File file = new File("C:\\Users\\sadaf\\eclipse-workspace\\midterm-coding-exam\\src\\data\\self-driving-car");
		LinkedList<String> list = new LinkedList<String>();

		try {
			Scanner sc = new Scanner(new FileInputStream(file));
			while (sc.hasNextLine()){
				content = sc.nextLine();
				list.add(content);
			}
			sc.close();
		}catch(FileNotFoundException fnf){
			fnf.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("\nProgram terminated Safely...");
		}

		Collections.reverse(list);
		Iterator i = list.iterator();
		while (i.hasNext()) {
			System.out.print("Node " + (count++) + " : ");
			System.out.println(i.next());
		}

	}



}
