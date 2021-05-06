package exercise1;

public class currentTimeApp {

	public static void main(String[] args) 
	{
		Thread printTime1 = new currentTimeThread();
		Thread printTime2 = new currentTimeThread();
		
		printTime1.start();
		printTime2.start();
	}

}
