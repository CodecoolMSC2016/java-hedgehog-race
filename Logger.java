import java.util.*;

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

	public static void log(String message)
	{
		Player p = Main.player;				
		if (message.equals("welcome"))
		{
			System.out.println("Welcome to our Horse Race!");
		}
		else if (message.equals("startMoney"))
		{
			System.out.println("You have: " + p.getMoney());
		}
		else if (message.equals("money"))
		{
			System.out.println("You have now: " + p.getMoney());
		}
		else if (message.equals("bet"))
		{
			System.out.println("How much do you bet? ");
		}
		else if (message.equals("horse"))
		{
			System.out.println("The horses are: ");
			for(Horse horse : Simulation.getHorses())
			{
				System.out.println(horse.getName());
			}
		}
		else if (message.equals("bethorse"))
		{
			System.out.println("Choose a horse you want to bet: ");
		}
	}
	
	
	public void log(int bet)
	{
		System.out.println("Your bet is: " + bet);
	}

	public void printError(String message)
	{
		if (message.equals("lessMoney"))
		{
		System.out.println("Too much bet. You haven't got enough money.");
		}
		else if (message.equals("noHorse"))
		{
		System.out.println("We haven't got any horse with this name.");
		}
	}
	
}
