import java.util.Random;

public class Simulator
{
	
	public Simulator(Simulation simulation, Logger logger)
	{
		
	}


	public static Result run()
	{
		Result result;
		Random num = new Random();

		Horse[] horses = new Horse[5];	
		horses[0] = new Horse("Kincsem");
		horses[1] = new Horse("Csikócsőr");
		horses[2] = new Horse("Túladagolás");
		horses[3] = new Horse("Herbál");
		horses[4] = new Horse("Szmoki");
	
		int index = num.nextInt(horses.length);

		result = new Result(horses[index].getName());
	
		return result;
	}

	
}
