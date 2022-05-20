package math.problems;

import java.util.Arrays;

public class FindLowestDifference {

    static int findSmallestDifference(int Array1[], int Array2[],
                                      int m, int n)
    {
        // Sort both arrays
        // using sort function
        Arrays.sort(Array1);
        Arrays.sort(Array2);

        int a = 0, b = 0;

        // Initialize result as max value
        int result = Integer.MAX_VALUE;

        // Scan Both Arrays upto
        // sizeof of the Arrays
        while (a < m && b < n)
        {
            if (Math.abs(Array1[a] - Array2[b]) < result)
                result = Math.abs(Array1[a] - Array2[b]);

            // Move Smaller Value
            if (Array1[a] < Array2[b])
                a++;

            else
                b++;
        }

        // return final smallest result
        return result;
    }

    public static void main(String[] args)
    {

        int Array1[] = {30, 12, 5, 9, 2, 20, 33, 1};
        int Array2[] = {18, 25, 41, 47, 17, 36, 14, 19};


        // Calculate size of Both arrays
        int m = Array1.length;
        int n = Array2.length;

        System.out.println(findSmallestDifference
                (Array1, Array2, m, n));


        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */

    }
}





