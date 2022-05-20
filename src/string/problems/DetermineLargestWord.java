package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */

        String s = "Human brain is a biological learning machine";
        String wordNLength = findTheLargestWord(s);

        System.out.println(findTheLargestWord(s));


    }

    public static String findTheLargestWord(String wordGiven) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "", large = "";
        for (String word : wordGiven.split(" "))
            if (word.length() >= large.length())
                large = word;


        return large;
    }
}





