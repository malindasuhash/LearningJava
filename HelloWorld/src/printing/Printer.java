package printing;

public class Printer {

	public boolean isOn;
	public String modelNumber;
	
	public Printer(boolean isOn, String modelNumber)
	{
		this.isOn = isOn;
		this.modelNumber = modelNumber;
	}
	
	public void Print(int copies) {
		
		String[] someColours = new String[] { "A", "B", "C" };
		
		for (String current : someColours) // For any iterable
		{			
			System.out.println(current);
		}
		
		
		switch(copies)
		{
		case 0:
			if (this.isOn)
			{			
				System.out.println("Model number is " + modelNumber + " and on");
			}
			break;
		default:
			System.out.println("Not supported");
		}
		
		if (this.isOn)
		{			
			System.out.println("Model number is " + modelNumber);
		}
		// System.out.println(modelNumber);
	}
	
	public void Print(String text) {
		System.out.println(text);
		
	}
}
