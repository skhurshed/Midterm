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
        //  n in this case
      public static void printTriangle(int n){
    for (int i=0; i<n; i++)
        {
            // inner loop to handle number spaces
            // values changing acc. to requirement
            for (int j=n-i; j>1; j--)
            {
                // printing spaces
                System.out.print(" ");
            }

            //  inner loop to handle number of columns
            //  values changing according to outer loop
            for (int j=0; j<=i; j++ )
            {

                System.out.print("* ");
            }

            //printing each line
            System.out.println();
        }
    }

    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printTriangle(n);
    }
}


