package math.problems;

public class MakePyramid {


        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */

        // outer loop to handle number of rows
      public static void printTriangle(int n){
    for (int i=0; i<n; i++)
        {
            // inner loop to handle number spaces
            for (int j=n-i; j>1; j--)
            {
                System.out.print(" ");
            }

            //  inner loop to handle number of columns
            for (int j=0; j<=i; j++ )
            {

                System.out.print("* ");
            }

            System.out.println();
        }
    }


    public static void main(String args[])
    {
        int n = 6;
        printTriangle(n);
    }
}


