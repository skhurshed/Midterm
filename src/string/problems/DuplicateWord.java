package string.problems;


import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        String[] words = st.toLowerCase().trim().split(" ");
        Map<String, Integer> duplicateString = new HashMap<>();
        int count = 1;
        for (String x : words) {
            if (duplicateString.containsKey(x))
            {
                duplicateString.put(x, duplicateString.get(x) + 1);
            } else {
                        duplicateString.put(x, count);
                    }
                }
        System.out.println("Duplicate Words in a String : ");
                
        for (Map.Entry a : duplicateString.entrySet())
        {
            int val = (Integer) a.getValue();
            if (val > 1)
            {
                System.out.println(a);
            }
        }
    }
}

