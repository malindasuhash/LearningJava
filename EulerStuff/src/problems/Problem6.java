package problems;

/*
 * The sum of the squares of the first ten natural numbers is,

	1-2 + 2-2 + ... + 102 = 385
	The square of the sum of the first ten natural numbers is,

	(1 + 2 + ... + 10)2 = 552 = 3025
	Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

	Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class Problem6 {

	public static void main(String[] args)
	{
		Container p = numbers(100);
		
		System.out.println(p.PowerSumTotal);
		System.out.println(p.SquareOfSum);
		
		System.out.println("Difference: " + (p.SquareOfSum - p.PowerSumTotal));
	}
	
	private static Container numbers(int max)
	{
		int powerSumTotal = 0;
		int squareOfSum = 0;
		
		for (int i = 1; i <= max; i++)
		{
			powerSumTotal += i * i;
			squareOfSum += i;
		}
		
		squareOfSum = squareOfSum * squareOfSum;
		
		Container c = new Container();
		c.PowerSumTotal = powerSumTotal;
		c.SquareOfSum = squareOfSum;
		
		return c;
	}	
}

class Container
{
	public int PowerSumTotal;
	
	public int SquareOfSum;
}
