package math.problems;

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
		int i =2;
		int num =0;

		StringBuilder primeNumbers = new StringBuilder();

		for (i=2 ; i <= 1000000; i++)
		{
			int counter=0;
			for(num =i; num>=1; num--)
			{
				if(i%num==0)
				{
					counter = counter + 1;
				}
			}
			if (counter ==2)
			{
				primeNumbers.append(i).append(" ");
			}

		}
		System.out.print(primeNumbers);
	}

}
