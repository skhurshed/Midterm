package math.problems;

import java.util.Scanner;
public class Factorial {
    /*
     * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
     * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
     *
     */
        public static void main(String[]args){


            Scanner in = new Scanner(System.in);
            System.out.println("Factorial using Recursion, Enter a number: ");
            long num = in.nextLong();
            System.out.println(factor(num));

            System.out.println("Factorial using iteration, Enter a number: ");
            long numb= in.nextLong();
            System.out.println(fact(numb));

        }
    public static long factor(long num) {
        if (num == 0) {
            return 1;
        } else {
            return num * factor(num - 1);
        }
    }
    public static long fact(long numb)
    {
        long fact = 1L;
        for(long i= numb; i > 0; i--)
        { fact = fact * i; }
        return fact;
    }
}



