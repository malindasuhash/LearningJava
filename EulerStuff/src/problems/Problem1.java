package problems;

/*
 * Multiples of 3 and 5
 */
public class Problem1 {
	
	public static void main(String[] args)
	{
		Test(1000);
	}
	
	private static void Test(int end)
	{
		int total = 0;
		
		for (int i = 1; i < end; i++)
		{
			int canMultiplyBy5 = i % 5;
			int canMultiplyBy3 = i % 3;
			
			if (canMultiplyBy3 == 0 || canMultiplyBy5 == 0)
			{
				System.out.println(i);
				total += i;
			}
		}
		
		System.out.print(total);
	}
}
