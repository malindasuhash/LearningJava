package problems;

/*
 * 	By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

	What is the 10001st prime number?
 */
public class Problem7 {

	public static void main(String[] args)
	{
		Test();
	}
	
	private static void Test()
	{
		int primeCount = 0;
		
		for (int i = 2; i <= Integer.MAX_VALUE; i++)
		{
			if (isPrime(i))
			{
				primeCount++;
				System.out.println("Prime: (" + primeCount + "): " + i);
				
			}
			
			if (primeCount == 10001)
			{
				break;
			}
		}
	}
	
	private static boolean isPrime(int input)
	{
		if (input == 1)
			return true;
		
		for (int i = 2; i < input; i++)
		{
			int reminder = input % i;
			
			if (reminder == 0)
			{
				return false;
			}
		}
		
		return true;
	}
}
