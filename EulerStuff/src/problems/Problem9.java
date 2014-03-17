package problems;

/*
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

	a2 + b2 = c2
	For example, 32 + 42 = 9 + 16 = 25 = 52.

	There exists exactly one Pythagorean triplet for which a + b + c = 1000.
	Find the product abc.
 */
public class Problem9 {

	public static void main(String[] args)
	{
		Test();
	}
	
	private static void Test()
	{
		for (int i = 1; i < 1000; i++)
		{
			int inner = 0;
			
			for (int j = 1; j < 1000; j++)
			{
				inner = i*i + j*j;
				
				Double sqr = Math.sqrt(inner);
				
				int k = sqr.intValue();
				
				if (sqr.doubleValue() == k)
				{									
					int sum = i + j + k;
					
					if (sum == 1000)
					{
						System.out.println("a= " + i + " b= " + j + " c=" + k);
						System.out.println("Product: " + (i * j * k));
					}
				}
			}
		}
	}
}
