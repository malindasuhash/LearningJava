
package Something;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Test {

	public enum Keys
	{
		A,
		
		B,
		
		C
	}
	
	public static void main(String[] args)
	{
		
		
		System.out.println("Class path working.");
		
		TestSwitch(Keys.B);
		
		One();
		
		String input = "string input";
		
		int[] someints = new int[3];
		
		double[] doub = { 0.4, 0.6 };
		
		for (int i : someints)
		{
			System.out.println(i);
		}
		
		for (double i : doub)
		{
			System.out.println(i);
		}
		
		System.out.println(doub.length);
		
		try
		{
			SomeMethod();
			ReceiveArray(new String[] { "abc" });
		}
		catch(NullPointerException | StackOverflowError | FileNotFoundException e)
		{
			
		} 
		
		
		String[][] s = new String[10][];
		
		System.out.println(s.getClass());
	}
	

	
	private static void ReceiveArray(String[] array)
	{
		
	}
	
	
	public static void SomeMethod() throws FileNotFoundException, StackOverflowError
	{
		
	}
	
	/**
	 * @param key
	 * 
	 */
	public static void TestSwitch(Keys key)
	{
		
		switch (key)
		{
		case A:
			System.out.println("A selected");
			break;
			
		case B:
			System.out.println("B it is!!");
			
		default:
			System.out.println("Default selected");
			break;
		}
	}
	
	public static void One()
	{
		String[] items = new String[2];
		items[0] = "abc";
		items[1] = "pqr";
		
		for (String s : items)
		{
			System.out.println(s);			
		}
	}
	
	
		
	public void ContinueFromHere()
	{
		if (true)
		{
			return;
		}
	}
}
