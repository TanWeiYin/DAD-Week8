package exercise1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class currentTimeThread extends Thread
{
	public void printTime()
	{
		for(int i = 0; i < 10 ; i++)
		{
			LocalTime time = LocalTime.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
			System.out.println("CurrentTimeThread: " + time.format(formatter));
		}
	}
	
	@Override
	public void run() 
	{

		// Execute task to print statements
		printTime();

	}
}
