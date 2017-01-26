// It writes information to the console. Only this class can contain calls to System.out.println().

public class Logger
{
	String message;

	public Logger(String message)
	{
		this.message = message;
	}
	
	public String getMessage()
	{
		return this.message;
	}

	public void log(String message)
	{
		if (message.equals("welcome"))
		{
		System.out.println("Welcome to our Horse Race!");
		}
		
	}
}

// The TimeStamp can be hardcoded to today's date, otherwise try and use java.util.Date (this is optional). 
