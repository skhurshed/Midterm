package string.problems;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args)   throws java.lang.Exception{
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        String String1 = null;
        String String2 = null;
        boolean result = isAnagram(String1,String2);
            System.out.println(result);
        }
        public static boolean isAnagram(String first, String second)
        {
            // remove all whitespaces and convert strings to lowercase
            first  = first.replaceAll("\\s", "").toLowerCase();
            second = second.replaceAll("\\s", "").toLowerCase();

        /* check whether string lengths are equal or not,
        if unequal then not anagram */
            if (first.length() != second.length())
                return false;

            // convert string to char array
            char[] firstArray = first.toCharArray();
            char[] secondArray = second.toCharArray();

            // sort both the arrays
            Arrays.sort(firstArray);
            Arrays.sort(secondArray);

            // checking whether both strings are equal or not
            return Arrays.equals(firstArray,secondArray);
        }
    }

