import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
	}
	

	public void generateSimulation(int round)
	{	
		// returns a Simulation instance that contains the simulation result
		for(int i = 1; i<= round; i++)
		{
			Simulation sim = new Simulation();
			sim.generateData();
		}

	}

}
