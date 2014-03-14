package Something;

public class SimpleGenericClass<T> {

	private T generic;
	
	public void Test()
	{
		int i = 0;
		
		try (
				SomeClass c = new SomeClass();
				
			)
			{
				String f = 1 + "dd";
			}
		catch (StringIndexOutOfBoundsException ex)
		{
			return;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String j = "dd" + i;
		
		assert j != "bb" : "um"; // Assertions are built into the language.
		
		String[] newString = new String[2];
		int moreInts[];
		
	}
}

class SomeClass implements AutoCloseable
{

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}
