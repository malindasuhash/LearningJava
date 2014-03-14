package problems;

/*
 * 	A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

	Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem4 {

	public static void main(String[] args)
	{
		Test();
	}
	
	private static void Test()
	{
		int min = 100;
		int max = 999;
		
		int lowest = min * min;
		int highest = max * max;
			
		for (int i = highest; i >= lowest; i--)
		{
			if (isPalindrome(i))
			{
				for (int j = max; j > min; j--)
				{
					int mod = i % j;
					
					if (mod == 0)
					{
						int result = i / j;
						
						if (result < max && j < max)
						{
							System.out.println("int1 X int2 " + result + " X " + j + " Final = " + i);
							break;	
						}
						
					}
				}
			}
				
		}		
	}	
	
	private static boolean isPalindrome(int value)
	{
		String original = new Integer(value).toString();
		String reversed = new StringBuilder(new Integer(value).toString()).reverse().toString();
		
		return original.equals(reversed);
	}	
}
