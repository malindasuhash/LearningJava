package greetings;

import printing.*;



public class HelloWorld {
	
	private static int age = 50;
	
	public	static void main(String[] args) {
		
		Printer p = new Printer(true, "abc");		
		p.isOn = true;
		p.modelNumber = "abcd";
		
		p.Print(2);
	}
}
