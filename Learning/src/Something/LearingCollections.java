package Something;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class LearingCollections {

	public static void main(String[] args)
	{
		ArrayListTest();
	}
	
	/*
	 * The ArrayList behaves like the list.
	 * This is unordered.
	 */
	public static void ArrayListTest()
	{
		ArrayList<String> strings = new ArrayList<String>();
		String[] someStrings = new String[] { "A", "B", "C", "D" };
		
		strings.addAll(Arrays.asList(someStrings));
		
		for (String s : strings)
		{
			System.out.println(s);
		}
		
		System.out.print(strings.isEmpty());
		
		List<String> sync = Collections.synchronizedList(strings);
	}
}
