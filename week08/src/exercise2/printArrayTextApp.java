package exercise2;

public class printArrayTextApp {

	public static void main(String[] args) 
	{
		Runnable printArrayText1 = new printArrayText();
		Runnable printArrayText2 = new printArrayText();
		Runnable printArrayText3 = new printArrayText();
		
		Thread printThread1 = new Thread(printArrayText1, "text");
		Thread printThread2 = new Thread(printArrayText2, "word1");
		Thread printThread3 = new Thread(printArrayText3, "word2");
		
		printThread1.start();
		printThread2.start();
		printThread3.start();
	}

}
