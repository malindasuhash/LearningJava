package problems;

/*
 * 	The prime factors of 13195 are 5, 7, 13 and 29.

	What is the largest prime factor of the number 600851475143 ?
 */
public class Problem3 {

	public static void main(String[] main)
	{
		Test(600851475143l);
	}
	
	private static void Test(long input)
	{
		int divisor = 2;
		long largest = 1;
		
		while (input > 0)
		{
			long d = input % divisor;
			
			if (d == 0)
			{
				long output = input / divisor;
				
				if (divisor > largest)
				{
					largest = divisor;
				}

				if (input == divisor)
				{
					break;
				}
				
				input -= output;
				
				
				divisor = 2;
			}
			else
			{
				divisor += 1;
			}
		}
		
		System.out.println(largest);
	}
}
