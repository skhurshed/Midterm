package string.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a string: ");
        String string = scanner.nextLine();

        Set<String> permutations = generatePermutations(string);

        System.out.println("Here are the unique permutations of " + string);
        System.out.println(Arrays.toString(permutations.toArray()));

        scanner.close();
    }

    private static Set<String> generatePermutations(String input) {
        Set<String> result = new HashSet<>();
        permutations("", input, result);
        return result;
    }

    private static void permutations(String all, String letters, Set<String> result) {
        if (letters.length() == 0) {
            result.add(all);
        } else {
            for (int i = 0; i < letters.length(); i++) {
                String letter = letters.substring(i, i + 1);
                String otherLetters = letters.substring(0, i) + letters.substring(i + 1);
                permutations(all + letter, otherLetters, result);
            }
    }

}
}

