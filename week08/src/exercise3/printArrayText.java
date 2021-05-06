package exercise3;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class printArrayText extends Thread
{
	String[] str = {"It","is","recommended","to","use","Calender","class"};
	
	public void extractText(String threadName)
	{
		for(int i=0;i<10;i++)
		{
			String txt = "";
			
			for(int x = 0; x <= i; x++)
			{
				if(x >= 7)
			    {
			        txt = txt + str[x-7] + " ";
			    }
			    else
			    {
			        txt = txt + str[x] + " ";
			    }
			}
			
			System.out.println(threadName + ": " + txt);
		}
		
	}
	
	public void printRandomText()
	{
		List<String> randomtxt = Arrays.asList(str);
		
		Collections.shuffle(randomtxt);
		
		String list = Arrays.toString(randomtxt.toArray()).replace("[", "").replace("]", "").replace(",", " ");
		
		System.out.println(list);
	}
	
	public void printRandomText(String threadName)
	{
		if(threadName.equals("word1"))
		{
			try
			{
				Thread.sleep(5000);
			}
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		
		List<String> randomtxt = Arrays.asList(str);
		
		Collections.shuffle(randomtxt);
		
		String list = Arrays.toString(randomtxt.toArray()).replace("[", "").replace("]", "").replace(",", " ");
		
		System.out.println(threadName + ": " + list);
	}
	
	@Override
	public void run() 
	{
		// Get current thread
		Thread currentThread = Thread.currentThread();
		
		// Execute task
		if(currentThread.getName().equals("text"))
		{
			extractText(currentThread.getName());
		}
		else
		{
			printRandomText(currentThread.getName());
		}

	}
}
