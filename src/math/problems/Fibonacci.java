package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        int x1=0, y1=1, sum=0;
        System.out.print(x1+" ,"+y1);

            for (int x = 2; x < 40; x++) {
                sum = x1 + y1;
                System.out.print(" ," + sum);
                x1 = y1;
                y1 = sum;
            }

        }
    }
