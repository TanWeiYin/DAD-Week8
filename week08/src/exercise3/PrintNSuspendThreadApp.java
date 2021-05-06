package exercise3;

public class PrintNSuspendThreadApp {

	public static void main(String[] args) 
	{
		Thread RandomOrder1 = new printArrayText();
		RandomOrder1.setName("word1");
		
		Thread RandomOrder2 = new printArrayText();
		RandomOrder2.setName("word2");
		
		Thread RandomOrder3 = new printArrayText();
		RandomOrder3.setName("text");
		
		RandomOrder1.start();
		RandomOrder2.start();
		RandomOrder3.start();
	}

}
