package math.problems;

import java.util.ArrayList;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		int num1 = 2;
		int num2 = 1000000;
		int count = 0;

		for (int i = num1; i <= num2; i++) {
			int n = i;
			int a = 2;
			int temp = 0;
			while (a <= (n / 2)) {
				if (n % a == 0) {
					temp++;
					break;
				}
				a++;
			}
			if (temp == 0 && i != 1) {
				count++;
			}
		}
		System.out.println(count);
	}

}


