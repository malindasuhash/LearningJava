package problems;

/*
 * 	2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

	What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * 
 */
public class Problem5 {

	public static void main(String[] args)
	{
		Test();
	}
	
	private static void Test()
	{
		int maxDivisor = 20;
		
		for (int i = 2520; i < Integer.MAX_VALUE; i++)
		{
			if (fullyDivisable(i, maxDivisor))
			{
				System.out.println(i);
				break;
			}
		}
		
	}
	
	private static boolean fullyDivisable(int input, int divisor)
	{
		for (int j = 1; j <= divisor; j++)
		{
			int reminder = input % j;
			
			if (reminder != 0)
			{
				return false;
			}
		}
		
		return true;
	}
}
